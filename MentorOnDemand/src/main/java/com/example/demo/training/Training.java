package com.example.demo.training;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.mentor.Mentor;
import com.example.demo.payment.Payment;
import com.example.demo.skill.Skill;
import com.example.demo.technology.Technology;
import com.example.demo.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Training {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
public int id;
@Column(name="status")
private String status;
@Column(name="progress")
private Integer progress=0;
@Column(name="fees")
private Float fees=0.0f;
@Column(name="commission_amount")
private Float commissionAmount = 0.0f;
@JsonFormat(pattern = "HH:MM:SS")
@Column(name="end_time")
private String endTime;
@Column(name="amount_recieved")
private Float amountRecieved = 0.0f;
@Column(name="amount_to_mentor")
private Float amountToMentor = 0.0f;
@Column(name="rating")
private Integer rating=0;
@JsonFormat(pattern = "yyyy-MM-dd")
@Column(name="start_date")
private Date startDate;
@JsonFormat(pattern = "yyyy-MM-dd")
@Column(name="end_date")
private Date endDate;
@JsonFormat(pattern = "HH:MM:SS")
@Column(name="start_time")
private String startTime;


@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "mentor_id")
private Mentor mentor;

@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinTable(name="training_user",joinColumns = {
		@JoinColumn(name="TRAINING_ID",nullable=false,updatable=false)},
inverseJoinColumns = {@JoinColumn(name="USER_ID",nullable=false,updatable=false)})

private List<User> users;


@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinTable(name="training_payment",joinColumns = {
		@JoinColumn(name="TRAINING_ID",nullable=false,updatable=false)},
inverseJoinColumns = {@JoinColumn(name="PAYMENT_ID",nullable=false,updatable=false)})
private List<Payment> payments;

@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinTable(name="training_skill",joinColumns = {
		@JoinColumn(name="TRAINING_ID",nullable=false,updatable=false)},
inverseJoinColumns = {@JoinColumn(name="SKILL_ID",nullable=false,updatable=false)})
private List<Skill> skills;



@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "technology_id")
private Technology technology;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Integer getProgress() {
	return progress;
}
public void setProgress(Integer progress) {
	this.progress = progress;
}
public Float getFees() {
	return fees;
}
public void setFees(Float fees) {
	this.fees = fees;
}
public Float getCommissionAmount() {
	return commissionAmount;
}
public void setCommissionAmount(Float commissionAmount) {
	this.commissionAmount = commissionAmount;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public Float getAmountRecieved() {
	return amountRecieved;
}
public void setAmountRecieved(Float amountRecieved) {
	this.amountRecieved = amountRecieved;
}
public Float getAmountToMentor() {
	return amountToMentor;
}
public void setAmountToMentor(Float amountToMentor) {
	this.amountToMentor = amountToMentor;
}


public Integer getRating() {
	return rating;
}
public void setRating(Integer rating) {
	this.rating = rating;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public Training(int id, String status, Integer progress, Float fees, Float commissionAmount, String endTime,
		Float amountRecieved, Float amountToMentor, Integer rating,
		Date startDate, String startTime) {
	super();
	this.id = id;
	this.status = status;
	this.progress = progress;
	this.fees = fees;
	this.commissionAmount = commissionAmount;
	this.endTime = endTime;
	this.amountRecieved = amountRecieved;
	this.amountToMentor = amountToMentor;
	
	this.rating = rating;
	this.startDate = startDate;
	this.startTime = startTime;
}
public Training() {
	super();
	// TODO Auto-generated constructor stub
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
public Mentor getMentor() {
	return mentor;
}
public void setMentor(Mentor mentor) {
	this.mentor = mentor;
}
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public List<Payment> getPayments() {
	return payments;
}
public void setPayments(List<Payment> payments) {
	this.payments = payments;
}
public List<Skill> getSkills() {
	return skills;
}
public void setSkills(List<Skill> skills) {
	this.skills = skills;
}
public Technology getTechnology() {
	return technology;
}
public void setTechnology(Technology technology) {
	this.technology = technology;
}

}