package main.java.com.facility.model.facility;

import main.java.com.facility.model.facility.equipment.Equipment;

// I could eventually do different types of facilities using inheritance 
public class Facility implements IFacility {
		
	private Integer facilityId;
	private FacilityDetail facilityDetail;
	private FacilityLocation facilityLocation;
	
	Equipment equipment;
		
	public Facility() {}
	
	public Facility(Equipment equipment) {
		this.equipment = equipment;
	}
	
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
	
	// BUILDER
	public void getEquipment() {
		System.out.println("Facility contains ");
		if (equipment != null) {
			equipment.getEquipment();
		} else {
			System.out.println("no equipment");
		}
		
	}
	
	// VISITOR
	@Override
	public void accept(Visitor visitor) {
		visitor.visitFacility(this);	
	}
	
}
