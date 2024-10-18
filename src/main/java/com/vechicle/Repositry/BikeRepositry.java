package com.vechicle.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vechicle.Entity.Bike;


public interface BikeRepositry extends JpaRepository<Bike, Integer> {
	
}

