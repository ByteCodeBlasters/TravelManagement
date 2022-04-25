package com.project.impClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")

public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ACCOUNT_ID",length=3)
	 private long accountId;
	@Column(name="NAME")
	 private String name;
	@Column(name="CONTACT_NUMBER", length=11)
	 private String contact;
	@Column(name="EMAIL")
	 private String email;
	@Column(name="PASSWORD")
	 private String password;
	
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account() {
		super();
	}

	public Account(long accountId, String name, String contact, String email, String password) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;

	}
	public Account(String name, String contact, String email, String password) {
		super();
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.password = password;
	}
}
