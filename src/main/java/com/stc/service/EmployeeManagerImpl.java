package com.stc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stc.dao.EmployeeDAO;
import com.stc.model.DepartmentEntity;
import com.stc.model.EmployeeEntity;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeEntity> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public List<DepartmentEntity> getAllDepartments() {
		return dao.getAllDepartments();
	}

	public void addEmployee(EmployeeEntity employee) {
		dao.addEmployee(employee);
	}
}
