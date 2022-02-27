package com.facility.model.maintenance;

import java.util.List;

import com.facility.model.facility.Facility;

public interface IMaintenance {	
	
	public void calcMaintenanceCostForFacility(Facility facility, List<MaintRequest> maintRequestList);
	
	public void calcProblemRateForFacility(Facility facility, List<MaintRequest> maintRequestList);
	
	public void calcDownTimeForFacility(Facility facility, List<MaintRequest> maintRequestList);	
	
}
