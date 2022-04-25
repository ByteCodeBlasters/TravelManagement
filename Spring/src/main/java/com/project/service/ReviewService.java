package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.impClasses.Review;
import com.project.repositary.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepository rr;
	public void writeReview(Review review) {
		rr.save(review);
	}
	public List<Review> allReview() {
		return rr.findAll();
	}
}
