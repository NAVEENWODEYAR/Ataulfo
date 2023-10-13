package com.ataulfo.modal;

import com.ataulfo.dto.EmployeeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Emp_Table")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private String empMail;
	private double empSalary;
	private String empPhone;
	
	public Employee(EmployeeDTO employeeDTO)
	{
		this.empName = employeeDTO.getEmpName();
		this.empMail = employeeDTO.getEmpMail();
		this.empSalary = employeeDTO.getEmpSalary();
		this.empPhone = employeeDTO.getEmpPhone();
		
	}
}
