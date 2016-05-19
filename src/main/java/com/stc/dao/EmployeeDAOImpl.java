package com.stc.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stc.dto.EmpDTO;
import com.stc.model.DepartmentEntity;
import com.stc.model.EmployeeEntity;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO 
{
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<EmployeeEntity> getAllEmployees() 
	{
		List<EmployeeEntity> employees = manager.createQuery("Select a From EmployeeEntity a", EmployeeEntity.class).getResultList();
        return employees;
	}
	
	public List<DepartmentEntity> getAllDepartments() 
	{
		List<DepartmentEntity> depts = manager.createQuery("Select a From DepartmentEntity a", DepartmentEntity.class).getResultList();
        return depts;
	}
	
	public DepartmentEntity getDepartmentById(Integer id) 
	{
        return manager.find(DepartmentEntity.class, id);
	}
	
	public void addEmployee(EmployeeEntity employee) 
	{
		//Use null checks and handle them
		employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
		manager.persist(employee);
	}
	
	
	public List<EmpDTO> getEmpNames() {
		//fetch named query from extral query.xml file
		//List<EmpDTO> resultList = manager.createNamedQuery("FETCH_EMP_NAME_DATA").getResultList();
		
		//fetch named query from Domain class
		List<EmpDTO> resultList = Collections.checkedList(manager.createNamedQuery("FETCH_NAMES").getResultList(), EmpDTO.class);
		return resultList;
	}
}