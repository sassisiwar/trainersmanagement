package com.letsstartcoding.TrainersManagement.controller;

import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.TrainersManagement.business.RoleBusiness;
import com.letsstartcoding.TrainersManagement.business.SupervisorBusiness;
import com.letsstartcoding.TrainersManagement.model.Supervisor;
import com.letsstartcoding.TrainersManagement.model.Trainee;


@RestController
@RequestMapping("/supervisor")
public class SupervisorController {
	@Autowired
	SupervisorBusiness supB;
	
	@Autowired
	RoleBusiness roleB;
	
	/* to save a supervisor*/
	@PostMapping("/save")
	public ResponseEntity<Supervisor> createSupervisor(@Valid @RequestBody Supervisor s) {
		
		Supervisor supervisor =supB.save(s);
		return new ResponseEntity<Supervisor>(supervisor, HttpStatus.FOUND);
		
	}
	
	/* to find list of trainee */
	@GetMapping("/listoftrainee/{id}")
	public ResponseEntity<Collection<Trainee>> findList(@PathVariable(value="id") int id){
		Collection<Trainee> trainees =supB.findList(supB.findById(id));
		return new ResponseEntity<Collection<Trainee>>(trainees, HttpStatus.FOUND);
		
	}

}
