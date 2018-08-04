package com.fsd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="admin1")
public class Administrator{
	@Id
	@SequenceGenerator(name = "MySequence", sequenceName = "my_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MySequence")
	/*@Column(name="jobid")*/
	private long jobid;
	@Column(name="jname")
	private String jobname;
	@Column(name="jdesc")
	private String jobdescription;
	@Column(name="pname")
	private String projectname;
	@Column(name="sreq")
	private String skillsrequired;
	@Column(name="oskills")
	private String optionalskills;
	@Column(name="location")
	private String location;
	@Column(name="eband")
	private String employeeband;
	@Column(name="yoe")
	private float numberofyearsofexperience;
	@Column(name="nop")
	private int noofposition;
	@Column(name="cemail")
	private String contactemailid;
	@Column(name="cnum")
	private String contactnumber;
	public long getJobid() {
		return jobid;
	}
	public void setJobid(long jobid) {
		this.jobid = jobid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getSkillsrequired() {
		return skillsrequired;
	}
	public void setSkillsrequired(String skillsrequired) {
		this.skillsrequired = skillsrequired;
	}
	public String getOptionalskills() {
		return optionalskills;
	}
	public void setOptionalskills(String optionalskills) {
		this.optionalskills = optionalskills;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmployeeband() {
		return employeeband;
	}
	public void setEmployeeband(String employeeband) {
		this.employeeband = employeeband;
	}
	public float getNumberofyearsofexperience() {
		return numberofyearsofexperience;
	}
	public void setNumberofyearsofexperience(float numberofyearsofexperience) {
		this.numberofyearsofexperience= numberofyearsofexperience;
	}
	public int getNoofposition() {
		return noofposition;
	}
	public void setNoofposition(int noofposition) {
		this.noofposition = noofposition;
	}
	public String getContactemailid() {
		return contactemailid;
	}
	public void setContactemailid(String contactemailid) {
		this.contactemailid = contactemailid;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "[jobid=" + jobid + "\n"+
				", jobname=" + jobname + 
				", jobdescription=" + jobdescription
				+ ", projectname=" + projectname + ", skillsrequired=" + skillsrequired + ", optionalskills="
				+ optionalskills + ", location=" + location + ", employeeband=" + employeeband
				+ ", numberofyearsofexperience=" + numberofyearsofexperience + ", noofposition=" + noofposition
				+ ", contactemailid=" + contactemailid + ", contactnumber=" + contactnumber + "]";
	}

}
