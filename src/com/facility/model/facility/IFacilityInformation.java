package com.facility.model.facility;

import java.util.List;

public interface IFacilityInformation {
	
    public Facility getFacilityInformation(Integer facilityId, List<Facility> facilityList);
	
	public Integer requestAvailableCapacity(Facility facility);

}