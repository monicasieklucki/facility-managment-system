package main.java.com.facility.model.facility;


// ADAPTER
public class FacilityInformationAdapter implements FacilityInfoAdapter {
    
	public Float requestAvailableCapacity(Facility facility) {
		
		IFacilityInformation facilityInfo = new FacilityInformation();
		int availableCapacity = facilityInfo.requestAvailableCapacity(facility);

		// simple adapter - convert from integer into to float	    
	    return (float)availableCapacity;
		
	}

}
