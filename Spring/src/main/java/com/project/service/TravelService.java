package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.impClasses.travelPackages;
import com.project.repositary.TravelRepositary;

@Service
public class TravelService {
	@Autowired
	private TravelRepositary tr;
	
	public List<travelPackages> seeAll(){
		return tr.findAll();
	}
	public travelPackages changePackage(travelPackages tc) {
		try {
			return tr.save(tc);
		}catch(Exception e) {
			return null;
		}
	}
	public void deletePackage(long id) {
		try {
			tr.deleteById(id);
		}catch(Exception w) {
		}
	}
	public travelPackages addPackage(travelPackages tp) {
		try {
			return tr.save(tp);
		}catch(Exception e) {
			return null;
		}
	}
	public List<travelPackages> byName(String name) {
		try {
			return tr.findByDestination(name);
		}catch (Exception e) {
			return null;
		}
	}
}
