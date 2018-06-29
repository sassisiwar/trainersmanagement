package com.letsstartcoding.TrainersManagement.impl;

import java.util.List;

import com.letsstartcoding.TrainersManagement.model.Project;
import com.letsstartcoding.TrainersManagement.model.Supervisor;
import com.letsstartcoding.TrainersManagement.model.Trainee;


public interface ProjectImpl {
	
	Project save(Project p);
	List<Project> findAll();
	List<Trainee> findTrainnes(int id_project);
	List<Supervisor> findSupervisors();
	Project findById(int id);
	

}
