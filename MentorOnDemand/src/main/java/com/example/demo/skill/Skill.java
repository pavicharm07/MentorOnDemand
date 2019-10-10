package com.example.demo.skill;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.AuditModel;
import com.example.demo.training.Training;

@Entity
@Table(name="skill")
public class Skill extends AuditModel{
  
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   @Column(name="name",nullable=false)
   private String name;
   @Column(name="toc",nullable=false)
   private String toc;
   @Column(name="prerequisties",nullable=false)
   private String prerequisties;
  
   @Column(name="trainingId",nullable=false)
   private int trainingId;
 



   
public int getTrainingId() {
	return trainingId;
}
public void setTrainingId(int trainingId) {
	this.trainingId = trainingId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getToc() {
	return toc;
}
public void setToc(String toc) {
	this.toc = toc;
}
public String getPrerequisties() {
	return prerequisties;
}
public void setPrerequisties(String prerequisties) {
	this.prerequisties = prerequisties;
}
@Override
public String toString() {
	return "Skill [id=" + id + ", name=" + name + ", toc=" + toc + ", prerequisties=" + prerequisties + "]";
}
public Skill(int id, String name, String toc, String prerequisties) {
	super();
	this.id = id;
	this.name = name;
	this.toc = toc;
	this.prerequisties = prerequisties;
	
}

public Skill(int trainingId) {
	super();
	this.trainingId = trainingId;
}
public Skill() {
	super();
	// TODO Auto-generated constructor stub
}




}
