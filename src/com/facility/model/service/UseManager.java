package com.facility.model.service;

import java.util.ArrayList;
import java.util.List;

public class UseManager {
	
	// saving facilities in memory instead
    private List<String> inspectionList = new ArrayList<String>();
    
    public UseManager() {}
	
    // get all inspections from db
    // right now, all facilities have the same inspection dates
    public List<String> listInspections() {
    	try {
    		inspectionList.add("02/23/2022");
    		inspectionList.add("08/10/2022");

    		return inspectionList;
    		//facilityDAO.GetFacilitiesList
    	} catch (Exception se) {
  	        System.err.println("UseManager: Threw an Exception getting inspections.");
  	        System.err.println(se.getMessage());
    	}
    	return null;
    }

}
