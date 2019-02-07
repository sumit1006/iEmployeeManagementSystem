package com.iEMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iEMS.model.Employee;
import com.iEMS.model.EmployeeSalary;
import com.iEMS.model.Organization;
import com.iEMS.model.User;
import com.iEMS.service.EmpSalaryService;
import com.iEMS.service.EmpService;
import com.iEMS.service.OrganizationService;
import com.iEMS.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
/* @RequestMapping({"/api"}) */
@ComponentScan("com.iEMS")
public class iEMSController {

	@Autowired
	private UserService iemsservice;

	@Autowired
	private EmpSalaryService iEmpService;

	@Autowired
	private OrganizationService organizationService;

	@Autowired
	private EmpService empService;

	@PostMapping(value = "/userRegistration")
	private String login(@RequestBody User users) {
		iemsservice.successLoginform(users);

		return "registered";
	}

	@PostMapping(value = "/OrgRegistration")
	public String registration(@RequestBody Organization organizations) {

		organizationService.registrationForm(organizations);

		return "registered";
	}

	@PostMapping(value = "/employeeReg")
	public String employeeReg(@RequestBody Employee employee) {

		empService.empRegistrationForm(employee);
		return "registration successs";
	}

	@PostMapping(value = "/empLogin")
	public String empLogin(@RequestBody User user) {
		String name;
		name = iemsservice.empLogin(user);
		if (name.equals("admin"))
			return "Success";
		else
			return "Failure";
	}

//	@PostMapping(value = "/empSalary")
//	public String empSalary(@RequestBody EmployeeSalary empsal) {
//
//		iEmpService.empSalary(empsal);
//		return "Salary Registered";
//	}

	@GetMapping(value = "/getAllEmployees")
	public List<Employee> getEmployees() 
	{
		return empService.getAllEmployees();

	}
	
	@PostMapping(value = "/empNewSalary/{id}")
	public String empSalary(@RequestBody EmployeeSalary empsal,@PathVariable("id") int id) 
	{
		iEmpService.empSalary(empsal,id);
		return "Salary Registered";
	}
}
