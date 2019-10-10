package com.example.demo.technology;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.AuditModel;
import com.example.demo.training.Training;

@Entity
@Table(name ="technology")
public class Technology extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "tech_name", nullable = false)
	private String techname;
	@Column(name = "description", nullable = false)
	private String description;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

public Technology(int id, String techname, String description) {
	super();
	this.id = id;
	this.techname = techname;
	this.description = description;
}

public Technology() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Technology [id=" + id + ", techname=" + techname + ", description=" + description + "]";
}

}