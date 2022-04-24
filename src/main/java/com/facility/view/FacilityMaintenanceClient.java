package main.java.com.facility.view;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FacilityMaintenanceClient {
	public static void main (String args[]) throws Exception {
		
	    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
	    System.out.println("***************** Application Context instantiated! ******************");

		

	    
	    
	    
	    ((AbstractApplicationContext) context).close();

	}
}
