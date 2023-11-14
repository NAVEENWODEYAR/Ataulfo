package com.ataulfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ataulfo.dto.EmployeeDTO;
import com.ataulfo.modal.Employee;
import com.ataulfo.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	// Constructor Dependency injection,
	@Autowired
	private EmployeeRepo employeeRepo;
	
	// CRUD operations,
	// 1. INSERT INTO TABLENAME VALUES();
	public Employee insertEmployee(EmployeeDTO employeeDTO)
	{
		Employee employee = new Employee(employeeDTO);
		return employeeRepo.save(employee);
	}
	
	// 2. SELECT * FROM TABLENAME;
	public List<Employee> getEmployees()
	{
		return employeeRepo.findAll();
	}
	
	// 3. SELECT * FROM TABLENAME WHERE ID = " ";
	public Employee getEmployeeById(int empId)
	{
		return employeeRepo.findById(empId).get();
	}
	
	// 4. UPDATE TABLENAME SET email = '' 	WHERE id = '';  
	public Employee updateEmployee(@PathVariable int empId, @RequestBody Employee emp)
	{
		Employee e = employeeRepo.findById(empId).get();
					e.getEmpMail(emp.setEmpMail(""));
					e.getEmpName(emp.setEmpName(""));
					e.getEmpPhone(emp.setEmpPhone());
					e.getEmpSalary(emp.setEmpSalary());
					;
	}
}
