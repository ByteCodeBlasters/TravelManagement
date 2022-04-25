package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.impClasses.Review;
import com.project.service.ReviewService;

@RestController
@RequestMapping("/reviews")
@CrossOrigin("http://localhost:4200")
public class ReviewController {
	@Autowired
	private ReviewService rs;
	
	
	@PostMapping("/add")
	public boolean review(@RequestBody Review re) {
		System.out.println(re+"in Controller");
		rs.writeReview(re);
		return true;
		
	}
	
	@GetMapping("/listAllReviews")
	public List<Review > listAll(){
		return rs.allReview();
	}
}
