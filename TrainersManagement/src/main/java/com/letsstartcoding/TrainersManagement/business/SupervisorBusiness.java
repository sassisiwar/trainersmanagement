package com.letsstartcoding.TrainersManagement.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.TrainersManagement.impl.SupervisorImpl;
import com.letsstartcoding.TrainersManagement.model.Role;
import com.letsstartcoding.TrainersManagement.model.Supervisor;
import com.letsstartcoding.TrainersManagement.model.Trainee;
import com.letsstartcoding.TrainersManagement.repository.RoleRepository;
import com.letsstartcoding.TrainersManagement.repository.SupervisorRepository;


@Service
public class SupervisorBusiness implements SupervisorImpl{
	
	@Autowired
	SupervisorRepository supRepository;
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Supervisor save(Supervisor s) {
		// TODO Auto-generated method stub
		Role r=roleRepository.findByRoleName("supervisor");
		List<Role> l=s.getRoles();
		Boolean verif=l.add(r);
		s.setRoles(l);
		return supRepository.save(s);
	}

	@Override
	public Supervisor findById(int id) {
		// TODO Auto-generated method stub
		return supRepository.findOne(id);
	}

	@Override
	public List<Trainee> findList(Supervisor s) {
		// TODO Auto-generated method stub
		return supRepository.findListOfTrainee(s);
	}

}
