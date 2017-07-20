
package org.mule.modules.indianrailway.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.indianrailway.IndianRailwayConnector;


/**
 * A <code>IndianRailwayConnectorCapabilitiesAdapter</code> is a wrapper around {@link IndianRailwayConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T12:31:33-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class IndianRailwayConnectorCapabilitiesAdapter
    extends IndianRailwayConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
