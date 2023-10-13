package com.ataulfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO 
{
	private String empName;
	private String empMail;
	private double empSalary;
	private String empPhone;
}
