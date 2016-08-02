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
  private static final String connectionString = "HostName=CoyoteIoT.azure-devices.net;SharedAccessKeyName=iothubowner;SharedAccessKey=xxxxx";
  private static final String deviceId = "device-fcbd127a";




  /**
   * 
   */
  public CreateDevice() {}




  /**
   * @param args
   */
  public static void main( String[] args ) throws IOException, URISyntaxException, Exception {
    RegistryManager registryManager = RegistryManager.createFromConnectionString( connectionString );

    Device device = Device.createFromId( deviceId, null, null );
    try {
      device = registryManager.addDevice( device );
      if ( device != null ) {
        System.out.println( "New device has been created" );
      }
    } catch ( IotHubException iote ) {
      try {
        device = registryManager.getDevice( deviceId );
        if ( device != null ) {
          System.out.println( "Device already exists" );
        }
      } catch ( IotHubException iotf ) {
        iotf.printStackTrace();
      }
    }
    System.out.println( "DeviceId: " + device.getDeviceId() );
    System.out.println( "PrimaryKey: " + device.getPrimaryKey() );
    System.out.println( "SecondaryKey: " + device.getSecondaryKey() );
  }

}
