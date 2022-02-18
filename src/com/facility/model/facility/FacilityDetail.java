package com.facility.model.facility;

public class FacilityDetail {
	
	private String name;
	private Integer capacity;

	public FacilityDetail() {}
	
	public FacilityDetail(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
}
