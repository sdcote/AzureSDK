package org.eclipse.paho.client.mqttv3;

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
