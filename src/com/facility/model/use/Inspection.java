package com.facility.model.use;

import java.util.List;

import com.facility.model.facility.Facility;

import java.util.ArrayList;

public class Inspection implements IInspection {

	// saving facilities in memory
    private List<String> inspectionsList = new ArrayList<String>();
    
    public Inspection() {}
	
    // get all inspections
    // all facilities have the same inspection dates  ??? Get inspection dates by facility
    public List<String> listInspections() {
    	try {
    		inspectionsList.add("02/20/2022");
    		inspectionsList.add("05/13/2022");
    		inspectionsList.add("07/19/2022");
    		inspectionsList.add("12/11/2022");
    		return inspectionsList;
    	} catch (Exception se) {
  	        System.err.println("FacilityManager: Threw an Exception getting list of inspections.");
  	        System.err.println(se.getMessage());
    	}
    	return null;
    }
}
