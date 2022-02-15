package com.facility.model.facility;

import java.util.List;
import java.util.ArrayList;

import com.facility.model.facility.*;

public class Facility {
		
	private Integer facilityId;
	private FacilityDetail facilityDetail;
	private FacilityLocation facilityLocation;
	
    //private List<Facility> facilityList = new ArrayList<Facility>();

	
	public Facility() {}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public FacilityDetail getFacilityDetail() {
		return facilityDetail;
	}

	public void setFacilityDetail(FacilityDetail facilityDetail) {
		this.facilityDetail = facilityDetail;
	}

	public FacilityLocation getFacilityLocation() {
		return facilityLocation;
	}

	public void setFacilityLocation(FacilityLocation facilityLocation) {
		this.facilityLocation = facilityLocation;
	}
	
	
	// move to manager
	//public void addFacility(Facility facility)
	//{
	//    facilityList.add(facility);
	//}
	       
	//public void removeFacility(Facility facility)
	//{
	//    facilityList.remove(facility);
	//}

}
