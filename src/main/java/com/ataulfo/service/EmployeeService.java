package com.ataulfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ataulfo.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	//  Constructor Dependency injection
	@Autowired
	private EmployeeRepo employeeRepo;
}
