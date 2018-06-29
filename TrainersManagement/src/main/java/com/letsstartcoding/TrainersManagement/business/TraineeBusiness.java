package com.letsstartcoding.TrainersManagement.business;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.TrainersManagement.impl.TraineeImpl;
import com.letsstartcoding.TrainersManagement.model.Project;
import com.letsstartcoding.TrainersManagement.model.Role;
import com.letsstartcoding.TrainersManagement.model.Supervisor;
import com.letsstartcoding.TrainersManagement.model.Trainee;
import com.letsstartcoding.TrainersManagement.repository.ProjectRepository;
import com.letsstartcoding.TrainersManagement.repository.RoleRepository;
import com.letsstartcoding.TrainersManagement.repository.SupervisorRepository;
import com.letsstartcoding.TrainersManagement.repository.TraineeRepository;



@Service
public class TraineeBusiness implements TraineeImpl{
	@Autowired
	TraineeRepository traineeRepository;
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	SupervisorRepository supervisorRepository;

	@Override
	public Trainee save(Trainee t) {
		// TODO Auto-generated method stub
		Role r=roleRepository.findByRoleName("trainee");
		
		List<Role> l=t.getRoles();
		Boolean verif=l.add(r);
		t.setRoles(l);
		//t.setSupervisor(supervisorDAO.findById(id_sup));
		return traineeRepository.save(t);
	}

	@Override
	public List<Trainee> findAll() {
		// TODO Auto-generated method stub
		return traineeRepository.findAll();
	}

	@Override
	public Trainee affectOnProject(int id_trainee,int id_project) {
		// TODO Auto-generated method stub
		Project project=projectRepository.findOne(id_project);
		Trainee trainee=traineeRepository.findOne(id_trainee);
		trainee.setProject(project);
		return traineeRepository.save(trainee);
		
	}

	@Override
	public Trainee findById(int id) {
		// TODO Auto-generated method stub
		return traineeRepository.findOne(id);
	}

	@Override
	public Trainee affectSupervisor(int id_trainee, int id_supervisor) {
		// TODO Auto-generated method stub
		Trainee trainee=traineeRepository.findOne(id_trainee);
		Supervisor supervisor =supervisorRepository.findOne(id_supervisor);
		trainee.setSupervisor(supervisor);
		return traineeRepository.save(trainee);
	}
	

}
