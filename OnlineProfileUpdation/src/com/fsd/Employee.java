package com.fsd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee8")
public class Employee {
	@Id
	@Column(name="pid")
	public String profileid;
	@Column(name="fname")
	private String firstname;
	@Column(name="lname")
	private String lastname;
	@Column(name="skillset")
	private String skillset;
	@Column(name="location")
	private String location;
	@Column(name="dob")
	private String dob;
	@Column(name="qualification")
	private String qualification;
	@Column(name="numberofyearsofexperience")
	private float numberofyearsofexperience;
	@Column(name="gender")
	private String gender;
	@Column(name="phonenumber")
	private String phonenumber;
	@Column(name="emailid")
	private String emailid;

	public String getProfileid() {
		return profileid;
	}
	public void setProfileid(String profileid) {
		this.profileid = profileid;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public float getNumberofyearsofexperience() {
		return numberofyearsofexperience;
	}
	public void setNumberofyearsofexperience(float numberofyearsofexperience) {
		this.numberofyearsofexperience = numberofyearsofexperience;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [profileid=" + profileid + ", firstname=" + firstname + ", lastname=" + lastname + ", skillset="
				+ skillset + ", location=" + location + ", dob=" + dob + ", qualification=" + qualification
				+ ", numberofyearsofexperience=" + numberofyearsofexperience + ", gender=" + gender + ", phonenumber="
				+ phonenumber + ", emailid=" + emailid + "]";
	}

}
