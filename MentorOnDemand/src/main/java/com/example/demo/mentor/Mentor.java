package com.example.demo.mentor;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.training.Training;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@Column(name="mentorid",nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mentorid;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	@Column
	private Long contactNumber;
	
	@Column
	private String email;
	
	@Column
	private String regCode="";
	
	@Column
	private String role=null;
	
	@Column
	private String linkedinUrl=null;
	
	@Column
	private float yearsOfExperience;
	
	@Column
	private Boolean active=false;
	
	@Column
	private Boolean confirmedSignUp=false;
	
	
	@Column
	private Boolean resetPassword=false;
	
	@Column
	private Date resetPasswordDate;
	
	@JsonFormat(pattern="HH:MM:SS")
	@Column
	private String timezone;
	
	@Column
	private int rating;
	
	@Column
	private String mentor_profile;
	
	
	public int getId() {
		return mentorid;
	}
	public void setId(int id) {
		this.mentorid = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public float getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public Boolean getActive() {
		return active;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getMentor_profile() {
		return mentor_profile;
	}
	public void setMentor_profile(String mentor_profile) {
		this.mentor_profile = mentor_profile;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Boolean getConfirmedSignUp() {
		return confirmedSignUp;
	}
	public void setConfirmedSignUp(Boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}
	public Boolean getResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	public Date getResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(Date resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(int mentorid, String userName, String password, String firstName, String lastName, Long contactNumber,
			String regCode, String role, String linkedinUrl, float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Boolean resetPassword, Date resetPasswordDate, String email) {
		super();
		this.mentorid = mentorid;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPassword = resetPassword;
		this.resetPasswordDate = resetPasswordDate;
		this.email = email;
	}
	public Mentor(String timezone, int rating, String mentor_profile) {
		super();
	
		this.timezone = timezone;
		this.rating = rating;
		this.mentor_profile = mentor_profile;
	}

	
	
	
	

}
