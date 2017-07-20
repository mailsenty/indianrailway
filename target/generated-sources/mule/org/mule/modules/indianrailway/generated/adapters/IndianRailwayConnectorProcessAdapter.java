
package org.mule.modules.indianrailway.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.indianrailway.IndianRailwayConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>IndianRailwayConnectorProcessAdapter</code> is a wrapper around {@link IndianRailwayConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T12:31:33-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class IndianRailwayConnectorProcessAdapter
    extends IndianRailwayConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<IndianRailwayConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, IndianRailwayConnectorCapabilitiesAdapter> getProcessTemplate() {
        final IndianRailwayConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,IndianRailwayConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, IndianRailwayConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, IndianRailwayConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
