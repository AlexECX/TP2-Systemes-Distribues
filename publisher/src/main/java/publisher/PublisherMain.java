/**
 * PublisherMain
 */
package publisher;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class PublisherMain {

    public static void main(String[] args) {

        try {
            MqttClient client = new MqttClient("tcp://91.121.175.87:1883", MqttClient.generateClientId());
            client.connect();
            MqttMessage message = new MqttMessage();
            message.setPayload("hello guys!".getBytes());
            client.publish("AEX_channel", message);
        } catch (MqttException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
		}
    }
}