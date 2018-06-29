package com.letsstartcoding.TrainersManagement.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.TrainersManagement.impl.RoleImpl;
import com.letsstartcoding.TrainersManagement.model.Role;
import com.letsstartcoding.TrainersManagement.repository.RoleRepository;



@Service
public class RoleBusiness implements RoleImpl{
	
	
	@Autowired
	RoleRepository roleRepository;
	
	@Override
	public Role save(Role r) {
		// TODO Auto-generated method stub
		return roleRepository.save(r);
	}

	@Override
	public Role findByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleRepository.findByRoleName(roleName);
	}

}
