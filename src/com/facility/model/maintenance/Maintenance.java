package com.facility.model.maintenance;

import java.util.List;
import java.util.ArrayList;

public class Maintenance {
	
	private List<MaintRequest> maintRequestList = new ArrayList<MaintRequest>();

	Maintenance() {}
	
	public void makeFacilityMaintRequest(MaintRequest request) {
		try {
			
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
	}
	
	

}
