package main.java.com.facility.model.maintenance;

import java.util.List;

import main.java.com.facility.model.facility.Facility;

public interface IMaintenance {	
	
	public Integer calcMaintenanceCostForFacility(Facility facility, List<MaintRequest> maintRequestList);
	
	public Float calcProblemRateForFacility(Facility facility, List<MaintRequest> maintRequestList);
	
	public Float calcDownTimeForFacility(Facility facility, List<MaintRequest> maintRequestList);	
	
}
