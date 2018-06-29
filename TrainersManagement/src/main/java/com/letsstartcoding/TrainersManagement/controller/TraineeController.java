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
import com.letsstartcoding.TrainersManagement.business.TraineeBusiness;
import com.letsstartcoding.TrainersManagement.model.Trainee;


@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	TraineeBusiness traineeB;
	@Autowired
	RoleBusiness roleB;
	
	/* to save a role*/
	@PostMapping("/save")
	public ResponseEntity<Trainee> createTrainee(@Valid @RequestBody Trainee s) {
		Trainee trainee=traineeB.save(s);
		return new ResponseEntity<Trainee>(trainee, HttpStatus.FOUND);
	}
	
	/* find all trainees */
	
	@GetMapping("/all")
	public ResponseEntity<Collection<Trainee>> findAll(){
		Collection<Trainee> trainees = traineeB.findAll();
		return new ResponseEntity<Collection<Trainee>>(trainees, HttpStatus.FOUND);
	}
	
	/* to affect on a project */
	
	@GetMapping("/affect/{id_trainne}/{id_project}")
	public ResponseEntity<Trainee> AffectTraineeOnProject(@PathVariable(value="id_trainne") int t,@PathVariable(value="id_project") int p) {
		Trainee trainee=traineeB.affectOnProject(t, p);
		return new ResponseEntity<Trainee>(trainee, HttpStatus.FOUND);
	}
	
/* to affect a supervisor */
	
	@GetMapping("/affectsupervisor/{id_trainne}/{id_supervisor}")
	public ResponseEntity<Trainee> AffectSupervisor(@PathVariable(value="id_trainne") int t,@PathVariable(value="id_supervisor") int s) {
		Trainee trainee=traineeB.affectSupervisor(t, s);
		return new ResponseEntity<Trainee>(trainee, HttpStatus.FOUND);
	}
		
	

}
