/*
 * Copyright (c) 2016 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 *
 * Contributors:
 *   Stephan D. Cote 
 *      - Initial concept and initial implementation
 */
package azure;

import java.io.IOException;
import java.net.URISyntaxException;

import com.microsoft.azure.iot.service.exceptions.IotHubException;
import com.microsoft.azure.iot.service.sdk.Device;
import com.microsoft.azure.iot.service.sdk.RegistryManager;


/**
 * 
 */
public class CreateDevice {
  private static final String connectionString = "HostName=CoyoteIoT.azure-devices.net;SharedAccessKeyName=iothubowner;SharedAccessKey=XXXXXXXX";
  private static final String deviceId = "george";




  /**
   * 
   */
  public CreateDevice() {
    // TODO Auto-generated constructor stub
  }




  /**
   * @param args
   */
  public static void main( String[] args ) throws IOException, URISyntaxException, Exception {
    RegistryManager registryManager = RegistryManager.createFromConnectionString( connectionString );

    Device device = Device.createFromId( deviceId, null, null );
    try {
      device = registryManager.addDevice( device );
    } catch ( IotHubException iote ) {
      try {
        device = registryManager.getDevice( deviceId );
      } catch ( IotHubException iotf ) {
        iotf.printStackTrace();
      }
    }
    System.out.println( "Device id: " + device.getDeviceId() );
    System.out.println( "Device key: " + device.getPrimaryKey() );
  }

}
