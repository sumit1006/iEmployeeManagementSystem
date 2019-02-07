package com.iEMS.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iEMS.model.EmployeeSalary;

@Repository
public interface EmpSalaryRepository extends JpaRepository<EmployeeSalary, Integer> 
{
	EmployeeSalary findByEmployeeId(int id);
}
