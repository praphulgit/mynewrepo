package jms.com.jmstest;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;
@Component("myMessageListener")
public class MyMessageListener implements MessageListener{  
	
    public void onMessage(Message m) { 
        System.out.println("m     :-"+m); 

        TextMessage message=(TextMessage) m; 
        System.out.println("message  :-"+message);
        try{  
            System.out.println(message.getText()); 
            System.out.println("from receiver");
        }catch (Exception e) {e.printStackTrace();  }  
    }  
}  

