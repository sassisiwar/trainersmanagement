package com.letsstartcoding.TrainersManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.TrainersManagement.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByRoleName(String roleName);

}
