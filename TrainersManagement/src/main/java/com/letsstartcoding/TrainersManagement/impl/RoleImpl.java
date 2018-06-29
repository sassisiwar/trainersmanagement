package com.letsstartcoding.TrainersManagement.impl;

import com.letsstartcoding.TrainersManagement.model.Role;

public interface RoleImpl {
	public Role save(Role r);
	public Role findByRoleName(String roleName);
	
}
