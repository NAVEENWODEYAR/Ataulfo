package com.ataulfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ataulfo.dto.EmployeeDTO;
import com.ataulfo.dto.RequestDTO;
import com.ataulfo.modal.Employee;
import com.ataulfo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	// CConstructor Dependency injection,
	@Autowired
	private EmployeeService employeeService;
	
	// 1. send data to the db,
	@PostMapping("/insertEmployee")
	public ResponseEntity<RequestDTO> insertEmployee(EmployeeDTO employeeDTO)
	{
		Employee employee = employeeService.insertEmployee(employeeDTO);
		RequestDTO requestDTO = new RequestDTO("Data inserted successfully,",employee);
		return new ResponseEntity<>(requestDTO,HttpStatus.CREATED);
	}
	
}
