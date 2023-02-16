package com.revature.entity;

public class Receptionist {
private String name;
private int id;
private String Gender;
private String Desigination;
private String DateOfBirth;
private int age;
private String ShiftTime;
private String ContactNumber;
private String Address;
public Receptionist(String name, int id, String gender, String desigination, String dateOfBirth, int age,
		String shiftTime, String contactNumber, String address) {
	super();
	this.name = name;
	this.id = id;
	Gender = gender;
	Desigination = desigination;
	DateOfBirth = dateOfBirth;
	this.age = age;
	ShiftTime = shiftTime;
	ContactNumber = contactNumber;
	Address = address;
}

public String getName() {
	return name;
}
public Receptionist() {
	super();
	// TODO Auto-generated constructor stub
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getDesigination() {
	return Desigination;
}
public void setDesigination(String desigination) {
	Desigination = desigination;
}
public String getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getShiftTime() {
	return ShiftTime;
}
public void setShiftTime(String shiftTime) {
	ShiftTime = shiftTime;
}
public String getContactNumber() {
	return ContactNumber;
}
public void setContactNumber(String contactNumber) {
	ContactNumber = contactNumber;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "Receptionist [name=" + name + ", id=" + id + ", Gender=" + Gender + ", Desigination=" + Desigination
			+ ", DateOfBirth=" + DateOfBirth + ", age=" + age + ", ShiftTime=" + ShiftTime + ", ContactNumber="
			+ ContactNumber + ", Address=" + Address + ", getName()=" + getName() + ", getId()=" + getId()
			+ ", getGender()=" + getGender() + ", getDesigination()=" + getDesigination() + ", getDateOfBirth()="
			+ getDateOfBirth() + ", getAge()=" + getAge() + ", getShiftTime()=" + getShiftTime()
			+ ", getContactNumber()=" + getContactNumber() + ", getAddress()=" + getAddress() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
