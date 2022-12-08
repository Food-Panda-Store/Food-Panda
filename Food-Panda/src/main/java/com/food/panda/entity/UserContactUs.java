package com.food.panda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contact_Us")
public class UserContactUs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Contact_Us_Id")
	private long ContactUsId;
	@Column(name="Contact_Us_User_Name")
	private String UserName;
	@Column(name="Contact_Us_User_Number")
	private int UserNumber;
	@Column(name="Contact_Us_User_Email")
	private String UserEmail;
	public long getContactUsId() {
		return ContactUsId;
	}
	public void setContactUsId(long contactUsId) {
		ContactUsId = contactUsId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getUserNumber() {
		return UserNumber;
	}
	public void setUserNumber(int userNumber) {
		UserNumber = userNumber;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public UserContactUs(long contactUsId, String userName, int userNumber, String userEmail) {
		super();
		ContactUsId = contactUsId;
		UserName = userName;
		UserNumber = userNumber;
		UserEmail = userEmail;
	}
	public UserContactUs(String userName, int userNumber, String userEmail) {
		super();
		UserName = userName;
		UserNumber = userNumber;
		UserEmail = userEmail;
	}
	public UserContactUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ContactUs [ContactUsId=" + ContactUsId + ", UserName=" + UserName + ", UserNumber=" + UserNumber
				+ ", UserEmail=" + UserEmail + "]";
	}
	
}
