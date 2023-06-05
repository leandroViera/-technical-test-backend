package com.management.clients.apirest.models;

public class Client {
	
	private String name;
	private String sharedKey;
	private String businessID;
	private String email;
	private String phoneNumber;
	private String dataAdded;
	
	public Client(String name, String sharedKey, String businessID, String email, String phoneNumber, String dataAdded) {
		super();
		this.name = name;
		this.sharedKey = sharedKey;
		this.businessID = businessID;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dataAdded = dataAdded;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSharedKey() {
		return sharedKey;
	}
	public void setSharedKey(String sharedKey) {
		this.sharedKey = sharedKey;
	}
	public String getBusinessID() {
		return businessID;
	}
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public 	String getDataAdded() {
		return dataAdded;
	}
	public void setDataAdded(String dataAdded) {
		this.dataAdded = dataAdded;
	}
	
}
