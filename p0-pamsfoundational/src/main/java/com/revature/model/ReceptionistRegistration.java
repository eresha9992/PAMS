package com.revature.model;

public class ReceptionistRegistration {
	private String receptionistName;
	private int receptionistId;
	private String receptionistGender;
	private String receptionistDesigination;
	private String receptionistDateOfBirthDate;
	private int receptionistAge;
	private String receptionistShiftTime;
	private String receptionistContactNumber;
	private String receptionistAddress;
	
	public String getReceptionistName() {
		return receptionistName;
	}
	public void setReceptionistName(String receptionistName) {
		this.receptionistName = receptionistName;
	}
	public int getReceptionistId() {
		return receptionistId;
	}
	public void setReceptionistId(int receptionistId) {
		this.receptionistId = receptionistId;
	}
	public String getReceptionistGender() {
		return receptionistGender;
	}
	public void setReceptionistGender(String receptionistGender) {
		this.receptionistGender = receptionistGender;
	}
	public String getReceptionistDesigination() {
		return receptionistDesigination;
	}
	public void setReceptionistDesigination(String receptionistDesigination) {
		this.receptionistDesigination = receptionistDesigination;
	}
	public String getReceptionistDateOfBirthDate() {
		return receptionistDateOfBirthDate;
	}
	public void setReceptionistDateOfBirthDate(String receptionistDateOfBirthDate) {
		this.receptionistDateOfBirthDate = receptionistDateOfBirthDate;
	}
	public int getReceptionistAge() {
		return receptionistAge;
	}
	public void setReceptionistAge(int receptionistAge) {
		this.receptionistAge = receptionistAge;
	}
	public String getReceptionistShiftTime() {
		return receptionistShiftTime;
	}
	public void setReceptionistShiftTime(String receptionistShiftTime) {
		this.receptionistShiftTime = receptionistShiftTime;
	}
	
	public String getReceptionistContactNumber() {
		return receptionistContactNumber;
	}
	public void setReceptionistContactNumber(String receptionistContactNumber) {
		this.receptionistContactNumber = receptionistContactNumber;
	}
	public String getReceptionistAddress() {
		return receptionistAddress;
	}
	public void setReceptionistAddress(String receptionistAddress) {
		this.receptionistAddress = receptionistAddress;
	}
	@Override
	public String toString() {
		return "App [receptionistName=" + receptionistName + ", receptionistId=" + receptionistId
				+ ", receptionistGender=" + receptionistGender + ", receptionistDesigination="
				+ receptionistDesigination + ", receptionistDateOfBirthDate=" + receptionistDateOfBirthDate
				+ ", receptionistAge=" + receptionistAge + ", receptionistShiftTime=" + receptionistShiftTime
				+ ", receptionistContactNumber=" + receptionistContactNumber + ", receptionistAddress="
				+ receptionistAddress + "]";
	}
	

}
