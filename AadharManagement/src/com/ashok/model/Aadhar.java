package com.ashok.model;

public class Aadhar {
	private int adharId;
	private String aadharHolderName;
	private int age;
	private char gender;
	private double income;
	private Address address;
	public int getAdharId() {
		return adharId;
	}
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
	public String getAadharHolderName() {
		return aadharHolderName;
	}
	public void setAadharHolderName(String aadharHolderName) {
		this.aadharHolderName = aadharHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Aadhar [adharId=" + adharId + ", aadharHolderName=" + aadharHolderName + ", age=" + age + ", gender="
				+ gender + ", income=" + income + ", address=" + address + "]";
	}
	
	
}
