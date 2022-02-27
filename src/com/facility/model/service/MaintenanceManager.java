package com.facility.model.service;

import java.util.ArrayList;
import java.util.List;

import com.facility.model.facility.Facility;
import com.facility.model.maintenance.MaintRequest;
import com.facility.model.maintenance.Maintenance;

public class MaintenanceManager {
	
	// saving facilities in memory instead
	
	private List<MaintRequest> maintList = new ArrayList<MaintRequest>();
	private List<MaintRequest> maintRequestList = new ArrayList<MaintRequest>();
	
    public MaintenanceManager() {}
    
	public void makeFacilityMaintRequest(MaintRequest request) {
		try {			
			maintRequestList.add(request);
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception making maintenance request.");
  	        System.err.println(se.getMessage());
		}
	}
	
    public List<MaintRequest> listMaintRequests() {
		try {			
			return maintRequestList;
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception lsting maintenance request.");
  	        System.err.println(se.getMessage());
		}
		return null;
	}
    
    // set maintenance request to scheduled
    // updating request
	public void scheduleMaintenance(MaintRequest maintenance) {
		try {		
			maintenance.setStatus("Scheduled");
			maintList.add(maintenance);
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception scheduling maintenance request.");
  	        System.err.println(se.getMessage());
		}
	}
	
	public List<MaintRequest> listMaintenance() {
		try {	
			return maintList;
		} catch (Exception se) {
  	        System.err.println("Maintenance: Threw an Exception getting scheduled maintenance requests.");
  	        System.err.println(se.getMessage());
		}
		return null;
	}
	

	

}
