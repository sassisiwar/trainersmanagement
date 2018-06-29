package com.letsstartcoding.TrainersManagement.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.TrainersManagement.impl.PersonImpl;
import com.letsstartcoding.TrainersManagement.model.Person;
import com.letsstartcoding.TrainersManagement.repository.PersonRepository;




@Service
public class PersonBusiness implements PersonImpl{
	
	@Autowired
	PersonRepository personRepository;
	public List<Person> findAll(){
		return personRepository.findAll();
		
	}
	
	public Person save(Person emp){
		
		return personRepository.save(emp);
		
	}
	
	

}
