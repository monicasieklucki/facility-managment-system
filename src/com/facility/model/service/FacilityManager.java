package com.facility.model.service;

import java.util.List;
import java.util.ArrayList;
import com.facility.model.facility.*;

public class FacilityManager {
	
	// create Facility DAO 
	
	// saving facilities in memory
    private List<Facility> facilityList = new ArrayList<Facility>();
    
    public FacilityManager() {}
	
    // get all facilities
    public List<Facility> listFacilities() {
    	try {
    		return facilityList;
    	} catch (Exception se) {
  	        System.err.println("FacilityManager: Threw an Exception getting facilities.");
  	        System.err.println(se.getMessage());
    	}
    	return null;
    }
    
    public Facility getFacilityInformation(Integer facilityId) {
    	try {
    		for (Facility facility: facilityList) {
    			if (facility.getFacilityId().equals(facilityId)) {
    				return facility;
    			}
    			
    		}
    	} catch(Exception se) {
  	        System.err.println("FacilityManager: Threw an Exception getting facility information.");
  	        System.err.println(se.getMessage());
    	}
    	return null;
    }
    
	//Insert a new facility in the DB
	public void addNewFacility(Facility facility) {
		
		try {
			facilityList.add(facility);
			//facilityDAO.addFacility(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityManager: Threw a Exception adding new facility.");
	      System.err.println(se.getMessage());
	    }
	}
	
	//Add FacilityDetail
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
	
	//Insert a new facility in the DB
	public void removeFacility(Facility facility) {
		
		try {
			facilityList.remove(facility);
	    } catch (Exception se) {
	      System.err.println("FacilityManager: Threw a Exception removing facility.");
	      System.err.println(se.getMessage());
	    }
	}
	
	public Integer requestAvailableCapacity(Facility facility) {
		
		try {
		    int availableCapacity = facility.getFacilityDetail().getMaxCapacity() - facility.getFacilityDetail().getCurrCapacity();
		    return availableCapacity;
		} catch (Exception se) {
		    System.err.println("FacilityManager: Threw an exception getting available facility capacity.");
		    System.err.println(se.getMessage());			
		}
		return null;
	}	

}
