package subscriber;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * SubscriberMain
 */
public class SubscriberMain {

    public static void main(String[] args) {
        try {
            MqttClient client = new MqttClient("tcp://91.121.175.87:1883", MqttClient.generateClientId());
            client.setCallback(new Subscriber());
            client.connect();
            client.subscribe("AEX_channel");
            System.out.println("test");
        
        } catch (MqttException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
    }
}