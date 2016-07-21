package org.eclipse.paho.client.mqttv3;

/**
 * Used to intercept the setting made by the SDK when using Paho.
 * To use, remove the Paho JAR from the classpath and move this and other 
 * classes to the main code directory. The SDK will load these instead of the 
 * Paho classes and provide you the ability to see what the SDK sets.
 */
public class MqttConnectOptions {

  public MqttConnectOptions() {}




  public void setKeepAliveInterval( int keepAliveInterval ) {
    System.out.println( "KA:" + keepAliveInterval );
  }




  public void setCleanSession( boolean setCleanSession ) {
    System.out.println( "CLEAN:" + setCleanSession );
  }




  public void setMqttVersion( int mqttVersion ) {
    System.out.println( "VER:" + mqttVersion );
  }




  public void setUserName( String userName ) {
    System.out.println( "USER:" + userName );
  }




  public void setPassword( char[] userPassword ) {
    System.out.println( "PASS:" + new String( userPassword ) );
  }
}
