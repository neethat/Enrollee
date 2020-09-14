package com.example.userenrollment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enrollees {
	
	@Id
	private long id;
	private String name;
	private boolean activationStatus;
	private Date dob;
	
	Enrollees(){
		
		
	}
	public Enrollees(long id, String name,  boolean activationStatus,  Date dob){
		this.id = id;
		this.name = name;
		this.activationStatus = activationStatus;
		this.dob = dob;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActivationStatus() {
		return activationStatus;
	}
	public void setActivationStatus(boolean activationStatus) {
		this.activationStatus = activationStatus;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	  @Override
	    public String toString() {
	        return "Enrollee{" + "id=" + id + ", name=" + name + ", activation Status=" + activationStatus+ ", DOB=" + dob + '}';
	    }
}
