package com.stc.dao;

import java.util.List;

import com.stc.dto.EmpDTO;
import com.stc.model.DepartmentEntity;
import com.stc.model.EmployeeEntity;

public interface EmployeeDAO 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
	public List<EmpDTO> getEmpNames();
}