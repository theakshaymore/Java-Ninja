package day11;

import java.util.List;

public class Hospital {
	
	private int hospitalId;
	private String hospitalName, contactPerson, contactNumber, location;
	private List<String> listOfTreatments;
	private int hospitalCode = 1000;
	public Hospital() {
		this.hospitalCode++;
	}
	public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber, String location) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
		this.listOfTreatments = listOfTreatments;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}
	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}
	public int getHospitalCode() {
		return hospitalCode;
	}
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", contactPerson="
				+ contactPerson + ", contactNumber=" + contactNumber + ", location=" + location + ", listOfTreatments="
				+ listOfTreatments + ", hospitalCode=" + hospitalCode + "]";
	}
	
	

}
