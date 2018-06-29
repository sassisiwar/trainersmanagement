package com.letsstartcoding.TrainersManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.TrainersManagement.model.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Integer>{
	
	
}
