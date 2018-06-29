package com.letsstartcoding.TrainersManagement.impl;

import java.util.List;

import com.letsstartcoding.TrainersManagement.model.Supervisor;
import com.letsstartcoding.TrainersManagement.model.Trainee;

public interface SupervisorImpl {
	public Supervisor save(Supervisor s);
	public Supervisor findById(int id);
	public List<Trainee> findList(Supervisor s);
}
