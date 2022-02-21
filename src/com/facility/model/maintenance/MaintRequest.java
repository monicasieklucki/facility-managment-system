package com.facility.model.maintenance;

import java.util.List;
import java.util.ArrayList;

import java.time.LocalTime;

import com.facility.model.facility.*;

public class MaintRequest {
	
	private Integer id; 
	private Facility facility;
	private LocalTime startDate;
	private LocalTime endDate;
	
	MaintRequest () {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public LocalTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalTime startDate) {
		this.startDate = startDate;
	}

	public LocalTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalTime endDate) {
		this.endDate = endDate;
	}
	
	

}
