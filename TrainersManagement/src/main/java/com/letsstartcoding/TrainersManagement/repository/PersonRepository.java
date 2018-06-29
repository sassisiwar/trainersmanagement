package com.letsstartcoding.TrainersManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.TrainersManagement.model.Person;



public interface PersonRepository extends JpaRepository<Person, Long>{

}
