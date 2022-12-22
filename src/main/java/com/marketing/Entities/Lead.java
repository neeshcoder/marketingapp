package com.marketing.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leads")
public class Lead {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
	@Column(name="First_Name", nullable=false ,length=45)
	private String firstname;
	
	@Column(name ="Last_Name",nullable= false,length=45)
	private String lastname;
	
	@Column(name="email",unique=true,length=128)
	private String email;
	
	@Column(name="mobile",unique=true,length=13)
	private String mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
