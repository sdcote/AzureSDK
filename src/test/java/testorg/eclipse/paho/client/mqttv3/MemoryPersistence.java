package testorg.eclipse.paho.client.mqttv3;

/**
 * Used to intercept the setting made by the SDK when using Paho.
 * To use, remove the Paho JAR from the classpath and move this and other 
 * classes to the main code directory. The SDK will load these instead of the 
 * Paho classes and provide you the ability to see what the SDK sets.
 */
public class MemoryPersistence {

  public MemoryPersistence() {
  }

}
