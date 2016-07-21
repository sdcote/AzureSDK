package org.eclipse.paho.client.mqttv3;

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
