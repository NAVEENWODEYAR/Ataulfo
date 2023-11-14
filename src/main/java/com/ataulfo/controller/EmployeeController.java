package com.ataulfo.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ataulfo.dto.EmployeeDTO;
import com.ataulfo.dto.RequestDTO;
import com.ataulfo.modal.Employee;
import com.ataulfo.repo.EmployeeRepo;
import com.ataulfo.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	// Constructor Dependency injection,
	@Autowired
	private EmployeeService employeeService;
	
	// Logger object.,
	private static final Logger log = LogManager.getLogger(EmployeeController.class);
	
	// 1. send data to the db,
	@PostMapping("/insertEmployee")
	public ResponseEntity<RequestDTO> insertEmployee(EmployeeDTO employeeDTO)
	{
		log.trace("For multiple environments");
		log.debug("for debuging");
		log.info("for message");
		log.error("for exceptions");
		log.warn("for system warnings");
		log.fatal("for fatal messages");
		
		Employee employee = employeeService.insertEmployee(employeeDTO);
		RequestDTO requestDTO = new RequestDTO("Data inserted successfully,",employee);
		return new ResponseEntity<>(requestDTO,HttpStatus.CREATED);
	}
	
	// 2. receive from the database,
	@GetMapping("/getEmployees")
	public ResponseEntity<RequestDTO> getEmployees()
	{
		List<Employee> emp = employeeService.getEmployees();
		RequestDTO requestDTO = new RequestDTO("Employees available in the list,", emp);
		return new ResponseEntity<>(requestDTO,HttpStatus.FOUND);
	}
	
	// 3.findById
	@GetMapping("/getEmp/{empId}")
	public ResponseEntity<RequestDTO> getEmpById(@PathVariable int empId)
	{
		Employee emp = employeeService.getEmployeeById(empId);
		RequestDTO requestDTO = new RequestDTO("Employee found", emp);
		return new ResponseEntity<RequestDTO>(requestDTO,HttpStatus.FOUND);
	}
	
}
