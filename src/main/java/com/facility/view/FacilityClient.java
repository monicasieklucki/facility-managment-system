package main.java.com.facility.view;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.com.facility.model.facility.Facility;
import main.java.com.facility.model.facility.FacilityDetail;
import main.java.com.facility.model.facility.FacilityInformation;
import main.java.com.facility.model.facility.IFacilityInformation;
import main.java.com.facility.model.facility.Visitor;
import main.java.com.facility.model.facility.equipment.OfficeEquipment;
import main.java.com.facility.model.service.FacilityManager;

import main.java.com.facility.model.facility.FacilityInfoAdapter;
import main.java.com.facility.model.facility.FacilityInformationAdapter;

public class FacilityClient {
	public static void main (String args[]) throws Exception {
		
		BasicConfigurator.configure();
		
		//Facility Client
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");
			
		// the manager is the service that connects to the dal
		// dal actually retrieves, inserts etc the objects from the db
		
        // before spring wiring
        FacilityManager manager = new FacilityManager();
		//FacilityManager manager = (FacilityManager) context.getBean("facilityManager");
				
		System.out.println("List of facilities should be empty.");
		System.out.println(manager.listFacilities());
		
		Visitor visitor = new Visitor();
		
		// Adding facilities to database
		Facility facility1 = new Facility(new OfficeEquipment());
		
		FacilityDetail fd = new FacilityDetail();
		fd.setName("Visitor!");
		
		facility1.setFacilityDetail(fd);
		facility1.setFacilityId(1);
		facility1.getEquipment();
		facility1.accept(visitor);
		
		Facility facility2 = new Facility();
		facility2.setFacilityId(2);
		
		System.out.println("Adding facility.");
		manager.addNewFacility(facility1);
		System.out.println("Adding facility.");
		manager.addNewFacility(facility2);
		
		System.out.println("There should be two facilities in the list.");
		System.out.println(manager.listFacilities());
		
		// Adding facility details to db
		manager.addFacilityDetail(facility1, "The Boring Company", 10);
		
		System.out.println("Removing facility.");
		manager.removeFacility(facility2);
		
		System.out.println("Listing only one facility.");
		System.out.println(manager.listFacilities());
		
		// retrieving this from the "database"
		Facility retrieved_facility = manager.getFacilityInformation(1);
			
		System.out.println("Getting facility information.");
		// old implementation - the return type is integer
		IFacilityInformation facilityInfo = new FacilityInformation();
		// interface that deals with getting capacity in a facility
		int availableCapacity = facilityInfo.requestAvailableCapacity(retrieved_facility);
		System.out.println(availableCapacity);
		// adapter - the return type is float instead
		// reused the original facility information interface
		FacilityInfoAdapter adapter = new FacilityInformationAdapter();
		adapter.requestAvailableCapacity(retrieved_facility);
		float availableCapacityAdapter = adapter.requestAvailableCapacity(retrieved_facility);
		System.out.println(availableCapacityAdapter);	

		
        ((AbstractApplicationContext) context).close();

	}
}
