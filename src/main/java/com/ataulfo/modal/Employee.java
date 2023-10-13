package com.ataulfo.modal;

import jakarta.persistence.Entity;
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
	private int empId;
	private String empName;
	private String empMail;
	private double empSalary;
	private String empPhone;
}
