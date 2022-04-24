package main.java.com.facility.model.use;

import main.java.com.facility.model.facility.Facility;

public interface IUse { 
	
	// still too coupled here, I think.
	
	public boolean isInUseDuringInterval();
	
	public void assignFacilityToUse(Facility facility);
	
	public Facility vacateFacility(Facility facility);
	
	public Integer listActualUsage(Facility facility);
	
	public Float calcUsageRate(Facility facility);

}
