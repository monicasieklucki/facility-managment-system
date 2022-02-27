package com.facility.model.maintenance;

import java.util.List;
import java.util.ArrayList;

import com.facility.model.facility.Facility;
import com.facility.model.maintenance.*;

public class Maintenance implements IMaintenance {
	
	Maintenance() {}
		
	public void calcMaintenanceCostForFacility(Facility facility, List<MaintRequest> maintList) {
		try {			

		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
	}
	
	
	public void calcProblemRateForFacility(Facility facility, List<MaintRequest> maintRequestList) {
		try {			

		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
	}
	
	public void calcDownTimeForFacility(Facility facility, List<MaintRequest> maintRequestList) {
		try {			
			//maintRequestList.add(request);
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
	}
	
	public List<String> listFacilityProblems(Facility facility, List<MaintRequest> maintRequestList) {
		try {			
			return facility.getFacilityDetail().getProblems();
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception listing facility problems.");
  	        System.err.println(se.getMessage());
		}
		return null;
	}
	

}
