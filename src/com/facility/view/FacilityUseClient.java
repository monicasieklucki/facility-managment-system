package com.facility.view;

import java.util.List;

import com.facility.model.facility.Facility;
import com.facility.model.service.FacilityManager;
import com.facility.model.service.UseManager;
import com.facility.model.use.IUse;
import com.facility.model.use.Use;

public class FacilityUseClient {
	public static void main (String args[]) throws Exception {
			
		FacilityManager facilityManager = new FacilityManager();
				
		// Adding facilities to database
		Facility facility1 = new Facility();
		facility1.setFacilityId(1);
		
		Facility facility2 = new Facility();
		facility2.setFacilityId(2);
		
		System.out.println("Adding facility.");
		facilityManager.addNewFacility(facility1);
		System.out.println("Adding facility.");
		facilityManager.addNewFacility(facility2);
		
		

		System.out.println("Inspections for every facility is the same.");
		UseManager useManager = new UseManager();
		List<String> inspections = useManager.listInspections();
		System.out.println(inspections);
		
		facilityManager.addFacilityDetail(facility1, "Loyola University Chicago", 10);

		IUse use = new Use();
		System.out.println(use.calcUsageRate(facility1));
		
		System.out.println("Assigning rooms to use in facility");
		use.assignFacilityToUse(facility1);
		use.assignFacilityToUse(facility1);

		System.out.println("Calculating facility usage. Capacity used is...");
		System.out.println(use.calcUsageRate(facility1));

		System.out.println("Listing the actual usage of facility.");
		System.out.println(use.listActualUsage(facility1));

		
	}
}