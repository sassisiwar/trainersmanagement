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

import com.letsstartcoding.TrainersManagement.business.ProjectBusiness;
import com.letsstartcoding.TrainersManagement.model.Project;
import com.letsstartcoding.TrainersManagement.model.Trainee;



@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired 
	ProjectBusiness projectBusiness;
	
	/* to save */
	@PostMapping("/save")
	public ResponseEntity<Project> createProject(@Valid @RequestBody Project p) {
		
		Project project= projectBusiness.save(p);
		return new ResponseEntity<Project>(project, HttpStatus.FOUND);
	}
	
	/* to get all projects*/
	@GetMapping("/")
	public ResponseEntity<Collection<Project>> getAll(){
		
		Collection<Project> projects =projectBusiness.findAll();
		return new ResponseEntity<Collection<Project>>(projects, HttpStatus.FOUND);
	}
	
	/* to find trainees by project */
	@GetMapping("/{id_project}")
	public ResponseEntity<Collection<Trainee>> getTraineesByProject(@PathVariable(value="id_project") int id){
		
		Collection<Trainee> trainees =projectBusiness.findTrainnes(id);
		return new ResponseEntity<Collection<Trainee>>(trainees, HttpStatus.FOUND);
	}
	
	

}
