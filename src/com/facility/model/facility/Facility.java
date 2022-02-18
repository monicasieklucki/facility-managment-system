package com.facility.model.facility;

public class Facility {
		
	private Integer facilityId;
	private FacilityDetail facilityDetail;
	private FacilityLocation facilityLocation;
	
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
	
}
