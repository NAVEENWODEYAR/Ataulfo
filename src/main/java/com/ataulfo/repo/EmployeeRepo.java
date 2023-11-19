package com.ataulfo.repo;

import org.springframework.data.jpa.repository.*;

import com.ataulfo.modal.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{
//	@Query(value = "",nativeQuery = true)
//	public void getEmp();
}
