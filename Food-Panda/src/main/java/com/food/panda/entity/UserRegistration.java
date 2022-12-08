package com.food.panda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Registration")
public class UserRegistration {
	@Id
	@Column(name = "User_Registration_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long UserRegistrationId;
	@Column(name="User_Registration_Name",length = 50)
	private String UserRegistrationName;
	@Column(name = "User_Registration_Email_Address",unique = true)
	private String UserRegistrationEmail;
	@Column(name="User_Registration_Mobile_Number",unique = true)
	private String UserRegistrationNumber;
	@Column(name="User_Registration_Password")
	private String UserRegistrationPassword;
	@Column(name="User_Registration_Cofiram_Password")
	private String UserRegistrationConfiramPassword;
	public long getUserRegistrationId() {
		return UserRegistrationId;
	}
	public void setUserRegistrationId(long userRegistrationId) {
		UserRegistrationId = userRegistrationId;
	}
	public String getUserRegistrationName() {
		return UserRegistrationName;
	}
	public void setUserRegistrationName(String userRegistrationName) {
		UserRegistrationName = userRegistrationName;
	}
	public String getUserRegistrationEmail() {
		return UserRegistrationEmail;
	}
	public void setUserRegistrationEmail(String userRegistrationEmail) {
		UserRegistrationEmail = userRegistrationEmail;
	}
	public String getUserRegistrationNumber() {
		return UserRegistrationNumber;
	}
	public void setUserRegistrationNumber(String userRegistrationNumber) {
		UserRegistrationNumber = userRegistrationNumber;
	}
	public String getUserRegistrationPassword() {
		return UserRegistrationPassword;
	}
	public void setUserRegistrationPassword(String userRegistrationPassword) {
		UserRegistrationPassword = userRegistrationPassword;
	}
	public String getUserRegistrationConfiramPassword() {
		return UserRegistrationConfiramPassword;
	}
	public void setUserRegistrationConfiramPassword(String userRegistrationConfiramPassword) {
		UserRegistrationConfiramPassword = userRegistrationConfiramPassword;
	}
	public UserRegistration(long userRegistrationId, String userRegistrationName, String userRegistrationEmail,
			String userRegistrationNumber, String userRegistrationPassword, String userRegistrationConfiramPassword) {
		super();
		UserRegistrationId = userRegistrationId;
		UserRegistrationName = userRegistrationName;
		UserRegistrationEmail = userRegistrationEmail;
		UserRegistrationNumber = userRegistrationNumber;
		UserRegistrationPassword = userRegistrationPassword;
		UserRegistrationConfiramPassword = userRegistrationConfiramPassword;
	}
	public UserRegistration(String userRegistrationName, String userRegistrationEmail, String userRegistrationNumber,
			String userRegistrationPassword, String userRegistrationConfiramPassword) {
		super();
		UserRegistrationName = userRegistrationName;
		UserRegistrationEmail = userRegistrationEmail;
		UserRegistrationNumber = userRegistrationNumber;
		UserRegistrationPassword = userRegistrationPassword;
		UserRegistrationConfiramPassword = userRegistrationConfiramPassword;
	}
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRegistration [UserRegistrationId=" + UserRegistrationId + ", UserRegistrationName="
				+ UserRegistrationName + ", UserRegistrationEmail=" + UserRegistrationEmail
				+ ", UserRegistrationNumber=" + UserRegistrationNumber + ", UserRegistrationPassword="
				+ UserRegistrationPassword + ", UserRegistrationConfiramPassword=" + UserRegistrationConfiramPassword
				+ "]";
	}
	
	
	

}
