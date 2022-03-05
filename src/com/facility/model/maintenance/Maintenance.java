package com.facility.model.maintenance;

import java.util.List;
import com.facility.model.facility.Facility;

public class Maintenance implements IMaintenance {
	
	Maintenance() {}
		
	public Integer calcMaintenanceCostForFacility(Facility facility, List<MaintRequest> maintList) {
		Integer maintenanceCostForFacility = 0;
		try {	
			
			for (MaintRequest request: maintList) {
				if (request.getFacility().getFacilityId().equals(facility.getFacilityId())) {
					maintenanceCostForFacility += request.getCost();
				}
			}				

		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
		return maintenanceCostForFacility;

	}
	
	public Float calcProblemRateForFacility(Facility facility, List<MaintRequest> maintRequestList) {
		
		Integer totalNumProblems = 0;
		Integer facilityNumProblems = 0;
		
		try {			
			for (MaintRequest request: maintRequestList) {
				if (request.getFacility().getFacilityId().equals(facility.getFacilityId())) {
					
					facilityNumProblems += facility.getFacilityDetail().getProblems().size();
				}
				facilityNumProblems += request.getFacility().getFacilityDetail().getProblems().size();

			}	

		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
		
		return (float) totalNumProblems / facilityNumProblems;
	}
	
	public Float calcDownTimeForFacility(Facility facility, List<MaintRequest> maintRequestList) {
		
		// TODO
		Float facilityDownTime = (float) 0;
		try {			
			//maintRequestList.add(request);
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
		return facilityDownTime;
	}
	
	public List<String> listFacilityProblems(Facility facility) {
		try {			
			return facility.getFacilityDetail().getProblems();
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception listing facility problems.");
  	        System.err.println(se.getMessage());
		}
		return null;
	}
	

}
