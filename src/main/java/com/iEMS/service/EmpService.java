package com.iEMS.service;

import java.util.List;

import com.iEMS.model.Employee;

public interface EmpService {

	String  empRegistrationForm(Employee employee);

	List<Employee> getAllEmployees();
}
