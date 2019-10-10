package com.example.demo.calender;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calender")
public class Calender {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String Listofmentors;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getListofmentors() {
		return Listofmentors;
	}
	public void setListofmentors(String listofmentors) {
		Listofmentors = listofmentors;
	}
	public Calender(int id, String listofmentors) {
		super();
		this.id = id;
		Listofmentors = listofmentors;
	}
	@Override
	public String toString() {
		return "Calender [id=" + id + ", Listofmentors=" + Listofmentors + "]";
	}
	public Calender() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}