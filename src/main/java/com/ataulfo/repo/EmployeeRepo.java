package com.ataulfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ataulfo.modal.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{

}
