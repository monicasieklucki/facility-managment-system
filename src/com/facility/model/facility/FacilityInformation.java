package com.facility.model.facility;

import java.util.List;

public class FacilityInformation implements IFacilityInformation {
    // get facility information here
		
    public Facility getFacilityInformation(Integer facilityId, List<Facility> facilityList) {
		for (Facility facility: facilityList) {
			if (facility.getFacilityId().equals(facilityId)) {
				return facility;
			}	
		}
		return null;
    }
    
	public Integer requestAvailableCapacity(Facility facility) {
		
	    int availableCapacity = facility.getFacilityDetail().getMaxCapacity() - facility.getFacilityDetail().getCurrCapacity();
	    return availableCapacity;
	}
	
}
