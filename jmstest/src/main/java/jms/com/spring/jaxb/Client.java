package jms.com.spring.jaxb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

public class Client {

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
		  Marshaller marshaller = (Marshaller) context.getBean("jaxbMarshallerBean");  
	        
		  Employee employee=new Employee();  
		  employee.setId(101);  
		  employee.setName("praphul singh");  
		  employee.setSalary(100000);  
		  
		  Employee employee1=new Employee();
		  employee1.setId(102);  
		  employee1.setName("singh");  
		  employee1.setSalary(130000);
		  
		  ArrayList<Employee> list=new ArrayList<Employee>();
		  list.add(employee);
		  list.add(employee1);
		  
		/*  list.add(new Employee(102,"paphul",234567.8f));
		  list.add(new Employee(35,"Tom", 5678));
		  list.add(new Employee(44,"Kik", 384956));
		  
	*/
		          
		  marshaller.marshal(employee1, new StreamResult(new FileWriter("employee.xml")));  
		    
		  System.out.println("XML Created Sucessfully"); 

	}

}
