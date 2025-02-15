package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

import java.util.Date;

/**
 * Personinformation generated by hbm2java
 */
public class Personinformation implements java.io.Serializable {

	private Integer personId;
	private String personName;
	private String userName;
	private String gender;
	private Date birthDate;
	private String description;
	private String phoneNumber;
	private String emailAddress;
	private String technicalPost;
	private Integer state;
	private String password;
	private Float standardPersonCost;
	private Float extraPersonCost;
	private String heheheh;

	public Personinformation() {
	}

	public Personinformation(String personName, String userName, String gender, Date birthDate, String description,
			String phoneNumber, String emailAddress, String technicalPost, Integer state, String password,
			Float standardPersonCost, Float extraPersonCost, String heheheh) {
		this.personName = personName;
		this.userName = userName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.description = description;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.technicalPost = technicalPost;
		this.state = state;
		this.password = password;
		this.standardPersonCost = standardPersonCost;
		this.extraPersonCost = extraPersonCost;
		this.heheheh = heheheh;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTechnicalPost() {
		return this.technicalPost;
	}

	public void setTechnicalPost(String technicalPost) {
		this.technicalPost = technicalPost;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Float getStandardPersonCost() {
		return this.standardPersonCost;
	}

	public void setStandardPersonCost(Float standardPersonCost) {
		this.standardPersonCost = standardPersonCost;
	}

	public Float getExtraPersonCost() {
		return this.extraPersonCost;
	}

	public void setExtraPersonCost(Float extraPersonCost) {
		this.extraPersonCost = extraPersonCost;
	}

	public String getHeheheh() {
		return this.heheheh;
	}

	public void setHeheheh(String heheheh) {
		this.heheheh = heheheh;
	}

}
