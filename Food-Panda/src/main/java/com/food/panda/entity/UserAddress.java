package com.food.panda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Address")
public class UserAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_Address_Id")
	private long UserAddressId;
	@Column(name="User_House_Number")
	private int UserHouseNumber;
	@Column(name="User_Area_Name")
	private String UserAreaName;
	@Column(name="User_City_Name")
	private String UserCityName;
	@Column(name="User_State_Name")
	private String UserStateName;
	@Column(name="User_Pin_Code")
	private int UserPinCode;
	@Column(name="User_Country_Name")
	private String UserCountryName;
	public long getUserAddressId() {
		return UserAddressId;
	}
	public void setUserAddressId(long userAddressId) {
		UserAddressId = userAddressId;
	}
	public int getUserHouseNumber() {
		return UserHouseNumber;
	}
	public void setUserHouseNumber(int userHouseNumber) {
		UserHouseNumber = userHouseNumber;
	}
	public String getUserAreaName() {
		return UserAreaName;
	}
	public void setUserAreaName(String userAreaName) {
		UserAreaName = userAreaName;
	}
	public String getUserCityName() {
		return UserCityName;
	}
	public void setUserCityName(String userCityName) {
		UserCityName = userCityName;
	}
	public String getUserStateName() {
		return UserStateName;
	}
	public void setUserStateName(String userStateName) {
		UserStateName = userStateName;
	}
	public int getUserPinCode() {
		return UserPinCode;
	}
	public void setUserPinCode(int userPinCode) {
		UserPinCode = userPinCode;
	}
	public String getUserCountryName() {
		return UserCountryName;
	}
	public void setUserCountryName(String userCountryName) {
		UserCountryName = userCountryName;
	}
	public UserAddress(long userAddressId, int userHouseNumber, String userAreaName, String userTownName,
			String userCityName, String userStateName, int userPinCode, String userCountryName) {
		super();
		UserAddressId = userAddressId;
		UserHouseNumber = userHouseNumber;
		UserAreaName = userAreaName;
		UserCityName = userCityName;
		UserStateName = userStateName;
		UserPinCode = userPinCode;
		UserCountryName = userCountryName;
	}
	public UserAddress(int userHouseNumber, String userAreaName, String userTownName, String userCityName,
			String userStateName, int userPinCode, String userCountryName) {
		super();
		UserHouseNumber = userHouseNumber;
		UserAreaName = userAreaName;
		UserCityName = userCityName;
		UserStateName = userStateName;
		UserPinCode = userPinCode;
		UserCountryName = userCountryName;
	}
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserAddress [UserAddressId=" + UserAddressId + ", UserHouseNumber=" + UserHouseNumber
				+ ", UserAreaName=" + UserAreaName + ", UserCityName=" + UserCityName + ", UserStateName="
				+ UserStateName + ", UserPinCode=" + UserPinCode + ", UserCountryName=" + UserCountryName + "]";
	}
	
}
