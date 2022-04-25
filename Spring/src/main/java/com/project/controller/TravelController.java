package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.impClasses.travelPackages;
import com.project.service.TravelService;

@RestController
@RequestMapping("/package")
@CrossOrigin(origins="http://localhost:4200")
public class TravelController {
	
	@Autowired 
	private TravelService ts;
	
	@GetMapping("/listAll")
	public List<travelPackages> listAll(){
		return ts.seeAll();
	}
	
	@PostMapping("/add")
	public travelPackages addPackage(@RequestBody travelPackages tc) {
		System.out.println("In add package "+tc);
		ts.addPackage(tc);
		return tc;
	}
	
	@PutMapping("/update")
	public travelPackages updatePackage(@RequestBody travelPackages tc) {
		ts.changePackage(tc);
		return tc;
	}
	
	@DeleteMapping("/delete/{deleteingid}")
	public void deletePackageById(@PathVariable("deleteingid") long id) {
		System.out.println("In delete Package "+id);
		ts.deletePackage(id);
	}
	
}
