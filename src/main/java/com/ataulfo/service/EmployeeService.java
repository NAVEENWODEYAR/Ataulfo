package com.ataulfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ataulfo.dto.EmployeeDTO;
import com.ataulfo.modal.Employee;
import com.ataulfo.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	//  Constructor Dependency injection
	@Autowired
	private EmployeeRepo employeeRepo;
	
	// CRUD operations,
	// 1. INSERT INTO TABLENAME VALUES();
	public Employee insertEmployee(EmployeeDTO employeeDTO)
	{
		Employee employee = new Employee(employeeDTO);
		return employeeRepo.save(employee);
	}
}
