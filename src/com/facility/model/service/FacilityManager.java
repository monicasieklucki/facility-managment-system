package com.facility.model.service;

import java.util.List;
import java.util.ArrayList;
import com.facility.model.facility.*;

public class FacilityManager {
	
	// create Facility DAOs here
	
	
	// saving facilities in memory instead
    private List<Facility> facilityList = new ArrayList<Facility>();
    
    public FacilityManager() {}
	
    // get all facilities from db
    public List<Facility> listFacilities() {
    	try {
    		return facilityList;
    		//facilityDAO.GetFacilitiesList
    	} catch (Exception se) {
  	        System.err.println("FacilityManager: Threw an Exception getting facilities.");
  	        System.err.println(se.getMessage());
    	}
    	return null;
    }
    
    
	// insert a new facility in the DB
	public void addNewFacility(Facility facility) {
		
		try {
			facilityList.add(facility);
			//facilityDAO.addFacility(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityManager: Threw a Exception adding new facility.");
	      System.err.println(se.getMessage());
	    }
	}
	
	// add FacilityDetail
	public void addFacilityDetail(Facility facility, String name, Integer capacity) {
		try {
			for (Facility f: facilityList) {
				if (f.getFacilityId().equals(facility.getFacilityId())) {
					
					FacilityDetail facilityDetail = new FacilityDetail();
					facilityDetail.setName(name);
					facilityDetail.setMaxCapacity(capacity);
					
					f.setFacilityDetail(facilityDetail);
				}
			}
			//facilityList.add(facility);
			//facilityDAO.addFacility(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityManager: Threw a Exception adding facility detail");
	      System.err.println(se.getMessage());
	    }
	}
	
	// insert a new facility in the DB
	public void removeFacility(Facility facility) {
		
		try {
			facilityList.remove(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityManager: Threw a Exception removing facility.");
	      System.err.println(se.getMessage());
	    }
	}

}
