package com.stc.service;

import java.util.List;

import com.stc.model.DepartmentEntity;
import com.stc.model.EmployeeEntity;

public interface EmployeeManager 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}
