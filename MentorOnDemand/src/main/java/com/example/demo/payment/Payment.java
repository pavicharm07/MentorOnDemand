package com.example.demo.payment;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.training.Training;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="txn_type")
	private String txnType;
	@Column(name="amount")
	private Float amount;
	@Column(name="remarks")
	private String remarks;
	@Column(name="mentor_id")
	private int mentorId;
	@Column(name="training_id")
	private int trainingId;
	 @Column
	    public Integer userId;
	 
	
	public Payment(Integer userId) {
		super();
		this.userId = userId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Column(name="payment_type")
	private String paymentType;
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="payments")
	List<Training> training;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getpaymentType() {
		return paymentType;
	}
	public void setpaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public Payment(int id, String txnType, Float amount, String remarks, int mentorId, int trainingId,
			String paymentType) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentorId;
		this.trainingId = trainingId;
		this.paymentType = paymentType;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
		