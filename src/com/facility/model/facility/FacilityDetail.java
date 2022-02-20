package com.facility.model.facility;

public class FacilityDetail {
	
	private String name;
	private Integer maxCapacity;
	private Integer currCapacity;

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

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	public Integer getCurrCapacity() {
		return currCapacity;
	}

	public void setCurrCapacity(Integer currCapacity) {
		this.currCapacity = currCapacity;
	}
	
}
