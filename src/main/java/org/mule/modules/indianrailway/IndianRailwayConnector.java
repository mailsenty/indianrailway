package org.mule.modules.indianrailway;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.indianrailway.config.ConnectorConfig;

@Connector(name="indian-railway", friendlyName="IndianRailway")
public class IndianRailwayConnector {
	
	
	private final String USER_AGENT = "Mozilla/5.0";
	private final String MASHAPE_KEY = "gSu3q2y5yymshH0OMkuExkKEOvFkp10qqQ4jsnK9a7OM0HzuPY";
	String findStationsURL="https://indianrailways.p.mashape.com/findstations.php?station=";
    String PNRStatusURL="https://indianrailways.p.mashape.com/index.php?pnr=";

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }
    
    @Processor
    public String findStation(String station) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
       return  getInfo(findStationsURL+station);
    }
    
    @Processor
    public String checkPNRStatus(String PNR) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	return getInfo(PNRStatusURL+PNR);
    }
    
    
    public String getInfo(String url) {
		StringBuffer response = new StringBuffer();
		String resp;
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("X-Mashape-Key",MASHAPE_KEY);
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			resp=response.toString();
		} catch (Exception e) {
			resp="Error validating the rail info";
			e.printStackTrace();
		}
		
		return resp;
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}