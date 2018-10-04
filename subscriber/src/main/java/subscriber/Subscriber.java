package subscriber;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Subscriber
 */
public class Subscriber implements MqttCallback {

    @Override
    public void connectionLost(Throwable cause) {
        System.out.println("connectionLost");
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        System.out.println("messageArrived");
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete");
	}

    
}