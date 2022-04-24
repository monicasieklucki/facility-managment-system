package main.java.com.facility.model.use;

import main.java.com.facility.model.facility.*;

public class Use implements IUse {

	public Use() { }
	
	// TODO - not sure how to handle intervals for is in use
	public boolean isInUseDuringInterval() {
    	try {

    		return false;
    	} catch (Exception se) {
  	        System.err.println("Use: Threw an Exception getting is facility in use during interval boolean.");
  	        System.err.println(se.getMessage());
    	}
    	return false;
	}
	
	public void assignFacilityToUse(Facility facility) {
    	try {
    		facility.getFacilityDetail().setCurrCapacity(facility.getFacilityDetail().getCurrCapacity() + 1);
    	} catch (Exception se) {
  	        System.err.println("Use: Threw an Exception assigning facility.");
  	        System.err.println(se.getMessage());
    	}	
	}
	
	public Facility vacateFacility(Facility facility) {
    	try {
    		facility.getFacilityDetail().setCurrCapacity(0);
    	} catch (Exception se) {
  	        System.err.println("Use: Threw an Exception vacating facility.");
  	        System.err.println(se.getMessage());
    	}	
    	return facility;
	}
	
	public Integer listActualUsage(Facility facility) {
    	try {
    		return facility.getFacilityDetail().getCurrCapacity();
    	} catch (Exception se) {
  	        System.err.println("Use: Threw an Exception listing usage.");
  	        System.err.println(se.getMessage());
    	}	
    	return null;
	}
	
	public Float calcUsageRate(Facility facility) {
    	try {
    		return ((float)facility.getFacilityDetail().getCurrCapacity()) / facility.getFacilityDetail().getMaxCapacity();
    	} catch (Exception se) {
  	        System.err.println("Use: Threw an Exception calculating usage.");
  	        System.err.println(se.getMessage());
    	}		
    	return null;
	}
}
