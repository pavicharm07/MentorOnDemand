package com.example.demo.user;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.payment.Payment;
import javax.persistence.JoinColumn;
@Entity
@Table(name="user")
public class User {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
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
	   @Column(nullable=true)
		public Integer trainingId;
	

		@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinTable(name="user_payment",joinColumns={
			@JoinColumn(name="user_id",nullable=false,updatable=false)},
		inverseJoinColumns={@JoinColumn(name="payment_id",nullable=false,updatable=false)}
		)
	    private List<Payment> payment;
	    
	    
	    
	    
	    
	    
	    
	     
	
	


	

	public User(List<Payment> payment) {
			super();
			this.payment = payment;
		}



	public List<Payment> getPayment() {
			return payment;
		}



		public void setPayment(List<Payment> payment) {
			this.payment = payment;
		}



	public User(Integer trainingId) {
		super();
		this.trainingId = trainingId;
	}



	public Integer getTrainingId() {
		return trainingId;
	}



	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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



	public Long getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getRegCode() {
		return regCode;
	}



	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
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



	


	




	

	


	public User(int id, String userName, String password, String firstName, String lastName, Long contactNumber,
			String email, String regCode, String role, String linkedinUrl, float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Boolean resetPassword, Date resetPasswordDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPassword = resetPassword;
		this.resetPasswordDate = resetPasswordDate;
		
		
	}



	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", contactNumber=" + contactNumber + ", email=" + email + ", regCode="
				+ regCode + ", role=" + role + ", linkedinUrl=" + linkedinUrl + ", yearsOfExperience="
				+ yearsOfExperience + ", active=" + active + ", confirmedSignUp=" + confirmedSignUp + ", resetPassword="
				+ resetPassword + ", resetPasswordDate=" + resetPasswordDate + 
				"]";
	}



	
}