package com.rms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private String UserID;
	private String name;
	private String contactInformation;

	public User(String userID, String name, String contactInformation) {
		this.UserID = userID;
		this.name = name;
		this.contactInformation = contactInformation;
	}

	public User() {
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", name=" + name + ", contactInformation=" + contactInformation + "]";
	}
}
