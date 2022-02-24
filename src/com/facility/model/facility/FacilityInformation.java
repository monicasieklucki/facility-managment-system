package com.facility.model.facility;

public class FacilityInformation implements IFacilityInformation {
    
	public Integer requestAvailableCapacity(Facility facility) {
		
	    int availableCapacity = facility.getFacilityDetail().getMaxCapacity() - facility.getFacilityDetail().getCurrCapacity();
	    return availableCapacity;
	}
	
}
