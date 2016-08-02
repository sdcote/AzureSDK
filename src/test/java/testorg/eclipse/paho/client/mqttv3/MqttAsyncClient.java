package testorg.eclipse.paho.client.mqttv3;

import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Used to intercept the setting made by the SDK when using Paho.
 * To use, remove the Paho JAR from the classpath and move this and other 
 * classes to the main code directory. The SDK will load these instead of the 
 * Paho classes and provide you the ability to see what the SDK sets.
 */
public class MqttAsyncClient {

  public MqttAsyncClient() {}




  public MqttAsyncClient( String serverURI, String clientId, MqttClientPersistence persistence ) throws MqttException {
    System.out.println( "URI:" + serverURI );
    System.out.println( "ID:" + clientId );
    System.out.println( "PER:" + persistence );
  }




  public void setCallback( MqttCallback obj ) {
    System.out.println( "CALLBACK:" + obj );
  }
}
