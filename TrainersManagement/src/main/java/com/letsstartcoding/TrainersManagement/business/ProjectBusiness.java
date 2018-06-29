package com.letsstartcoding.TrainersManagement.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.TrainersManagement.impl.ProjectImpl;
import com.letsstartcoding.TrainersManagement.model.Project;
import com.letsstartcoding.TrainersManagement.model.Supervisor;
import com.letsstartcoding.TrainersManagement.model.Trainee;
import com.letsstartcoding.TrainersManagement.repository.ProjectRepository;



@Service
public class ProjectBusiness implements ProjectImpl{
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project save(Project p) {
		// TODO Auto-generated method stub
		return projectRepository.save(p);
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

	@Override
	public List<Trainee> findTrainnes(int p) {
		// TODO Auto-generated method stub
		Project project=projectRepository.findOne(p);
		
		return projectRepository.findTrainnes(project);
	}

	@Override
	public List<Supervisor> findSupervisors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project findById(int id) {
		// TODO Auto-generated method stub
		return projectRepository.findOne(id);
	}
	

}
