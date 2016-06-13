package jms.com.jmsactivemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
public class Receiver {
    private ConnectionFactory factory = null;
    private Connection connection = null;
    private Session session = null;
    private Destination destination = null;
    private MessageConsumer consumer = null;
    public Receiver() {
    }
    public void receiveMessage() {
        try {
            factory = new ActiveMQConnectionFactory(
                    ActiveMQConnection.DEFAULT_BROKER_URL);
            System.out.println("factory "+factory);
           // connection = factory.createConnection();
            connection = factory.createConnection();
            System.out.println(" connection"+connection);
            connection.start();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            destination = session.createQueue("myqueue");
            System.out.println(" destination"+destination);
            consumer = session.createConsumer(destination);
            System.out.println("consumer "+consumer);
            Message message = consumer.receive();
            System.out.println("Receiver message  "+message);
            if (message instanceof TextMessage) {
                TextMessage text = (TextMessage) message;
                System.out.println("Message is : " + text.getText());
            }
        } catch (JMSException e) {
                      e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        System.out.println("receiver "+receiver);
        receiver.receiveMessage();
    }
}


