package main.java.com.facility.model.facility;



public interface IFacility {
	
	public Integer getFacilityId();

	public void setFacilityId(Integer facilityId);

	public FacilityDetail getFacilityDetail();

	public void setFacilityDetail(FacilityDetail facilityDetail);

	public FacilityLocation getFacilityLocation();

	public void setFacilityLocation(FacilityLocation facilityLocation);
	
	public void getEquipment();
	
	public void accept(Visitor visitor);
	
}
