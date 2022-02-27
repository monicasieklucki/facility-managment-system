package com.facility.model.facility;

import java.util.ArrayList;
import java.util.List;

public class FacilityDetail {
	
	private String name;
	private Integer maxCapacity;
	private Integer currCapacity = 0;

	private List<String> problems = new ArrayList<String>();
	
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

	public List<String> getProblems() {
		return problems;
	}

	public void setProblems(List<String> problems) {
		this.problems = problems;
	}
	
}
