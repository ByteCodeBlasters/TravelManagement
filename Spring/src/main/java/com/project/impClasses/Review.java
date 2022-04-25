package com.project.impClasses;
import javax.persistence.*;
@Entity
@Table(name="REVIEW")
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="REVIEW_ID")
	int reviewId;
	@Column(name="NAME_OF_REVIWER")
	String nameOfReviwer;
	@Column(name="CONTACT_NUMBER")
	String contactNumber;
	@Column(name="EXPERIENCE")
	String experience;
	@Column(name="DESTINATION")
	String destination;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getNameOfReviwer() {
		return nameOfReviwer;
	}
	public void setNameOfReviwer(String nameOfReviwer) {
		this.nameOfReviwer = nameOfReviwer;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getdestination() {
		return destination;
	}
	public void setdestination(String destination) {
		this.destination = destination;
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(String nameOfReviwer, String contactNumber, String experience, String destination) {
		super();
		this.nameOfReviwer = nameOfReviwer;
		this.contactNumber = contactNumber;
		this.experience = experience;
		this.destination = destination;
	}
	public Review(int reviewId, String nameOfReviwer, String contactNumber, String experience, String destination) {
		super();
		this.reviewId = reviewId;
		this.nameOfReviwer = nameOfReviwer;
		this.contactNumber = contactNumber;
		this.experience = experience;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", nameOfReviwer=" + nameOfReviwer + ", contactNumber=" + contactNumber
				+ ", experience=" + experience + ", destination=" + destination + "]";
	}
	
}
