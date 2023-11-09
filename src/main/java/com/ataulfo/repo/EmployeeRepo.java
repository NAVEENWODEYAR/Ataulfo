package com.ataulfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ataulfo.modal.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{
	@Query(value = "",nativeQuery = true)
	public void getEmp();
}
