package com.facility.model.service;

import java.util.ArrayList;
import java.util.List;

import com.facility.model.facility.Facility;

public class UseManager {
	
	// saving facilities in memory instead
    private List<Facility> inspectionList = new ArrayList<Facility>();
    
    public UseManager() {}
	
    // get all inspections from db
    public List<Facility> listInspections() {
    	try {
    		return inspectionList;
    		//facilityDAO.GetFacilitiesList
    	} catch (Exception se) {
  	        System.err.println("UseManager: Threw an Exception getting inspections.");
  	        System.err.println(se.getMessage());
    	}
    	return null;
    }

}
