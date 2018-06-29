package com.letsstartcoding.TrainersManagement.controller;
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
import com.letsstartcoding.TrainersManagement.model.Role;


@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleBusiness roleB;
	
	/* to save a role*/
	@PostMapping("/save")
	public ResponseEntity<Role> createRole(@Valid @RequestBody Role r) {
		Role role= roleB.save(r);
		return new ResponseEntity<Role>(role, HttpStatus.FOUND);
	}
	
	@GetMapping("/find/{roleName}")
	public ResponseEntity<Role> findByRoleName(@PathVariable("roleName") String name){
		Role role= roleB.findByRoleName(name);
		return new ResponseEntity<Role>(role, HttpStatus.FOUND);
	}
	
	
}
