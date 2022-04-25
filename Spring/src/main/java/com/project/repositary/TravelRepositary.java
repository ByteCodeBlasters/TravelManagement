package com.project.repositary;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.impClasses.travelPackages;

@Repository
public interface TravelRepositary extends JpaRepository<travelPackages,Long>{

	List<travelPackages> findByDestination(String name);
}
