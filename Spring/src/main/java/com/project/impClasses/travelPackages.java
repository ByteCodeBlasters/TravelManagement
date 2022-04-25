package com.project.impClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PACKAGES")
public class travelPackages {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long packageId;
	private String destination;
	@Column(name="description",length=5000)
	private String description;
	private Double costPerPerson;
	private int numberOfDays;
	private String organizer;
	@Column(name="imageURL",length=500)
	private String imageurl;
	private String contactNumber; 
	
	
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public long getPackageId() {
		return packageId;
	}
	public void setPackageId(long packageId) {
		this.packageId = packageId;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getCostPerPerson() {
		return costPerPerson;
	}
	public void setCostPerPerson(Double costPerPerson) {
		this.costPerPerson = costPerPerson;
	}
	public String getOrganizer() {
		return organizer;
	}
	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}
	public travelPackages(long packageId, String destination, String description, Double costPerPerson, int numberOfDays,String contactNumber,
			String organizer, String imageurl) {
		super();
		this.packageId = packageId;
		this.destination = destination;
		this.description = description;
		this.costPerPerson = costPerPerson;
		this.numberOfDays = numberOfDays;
		this.organizer = organizer;
		this.imageurl = imageurl;
		this.contactNumber=contactNumber;
	}
	public travelPackages(String destination, String description, Double costPerPerson, int numberOfDays,String contactNumber,
			String organizer, String imageurl) {
		super();
		this.destination = destination;
		this.description = description;
		this.costPerPerson = costPerPerson;
		this.numberOfDays = numberOfDays;
		this.organizer = organizer;
		this.imageurl = imageurl;
		this.contactNumber=contactNumber;
	}
	public travelPackages() {
		super();
	}
}
