package org.mule.modules.indianrailway;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndianRailwayConnectorTest {
	
	IndianRailwayConnector indianRailwayConnector= new  IndianRailwayConnector();

	@Test
	public void testFindStation() {
		System.out.println(indianRailwayConnector.findStation("DEL"));
	}

	@Test
	public void testCheckPNRStatus() {
		System.out.println(indianRailwayConnector.checkPNRStatus("2459547855"));
	}

}
