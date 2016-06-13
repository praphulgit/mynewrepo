package jms.com.jmstest;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component("myMessageSender")
public class MyMessageSender {
	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessage(final String message) {

		this.jmsTemplate.send(new MessageCreator() {

			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				ObjectMessage msg = session.createObjectMessage();
				//System.out.println("ghgjh hgfh ");
				msg.setObject(message);
                System.out.println("msg  :"+msg);
				return msg;
			}
		});

	}
}
