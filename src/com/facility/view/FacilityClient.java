package com.facility.view;

import java.util.List;

import com.facility.model.facility.Facility;
import com.facility.model.facility.FacilityInformation;
import com.facility.model.facility.IFacilityInformation;
import com.facility.model.service.FacilityManager;


public class FacilityClient {
	public static void main (String args[]) throws Exception {
		
		//Facility Client
				
		// the manager is the service that connects to the dal
		// dal actually retrieves, inserts etc the objects from the db
		FacilityManager manager = new FacilityManager();
				
		System.out.println("List of facilities should be empty.");
		System.out.println(manager.listFacilities());
		
		// Adding facilities to database
		Facility facility1 = new Facility();
		facility1.setFacilityId(1);
		
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
		IFacilityInformation facilityInfo = new FacilityInformation();
			
				
		// interface that deals with getting capacity in a facility
		// 
		//requestAvailableCapacity() <- maybe the number of rooms in a facility
		int availableCapacity = facilityInfo.requestAvailableCapacity(retrieved_facility);
		System.out.println(availableCapacity);
		
	}
}
