package com.iEMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iEMS.model.Employee;
import com.iEMS.model.EmployeeSalary;
import com.iEMS.repositry.EmpRepository;
import com.iEMS.repositry.EmpSalaryRepository;
import com.iEMS.service.EmpService;


@Service
@Component
@ComponentScan({"com.iEMS.repositry"})
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private EmpSalaryRepository empSalaryRepository;
	
	@Override
	public String empRegistrationForm(Employee employee) {
//		Employee employees=new Employee();
//		//employees.setId(employee.getId());
//		employees.setfName(employee.getfName());
//		employees.setlName(employee.getlName());
//		employees.setEmailId(employee.getEmailId());
//		employees.setAddress(employee.getAddress());
//		employees.setContactNo(employee.getContactNo());
//		employees.setBirthDate(employee.getBirthDate());
//		employees.setAnniDate(employee.getAnniDate());
//		employees.setJoiningDate(employee.getJoiningDate());
		
		

		Employee emp=empRepository.save(employee);
		
		EmployeeSalary empsal=new EmployeeSalary();
		empsal.setEmployee(emp);
		empSalaryRepository.save(empsal);
			
		
		return "Registered";
	}

	/*@Override
	public Employee getEmployees(int id)
	{
		
		Employee employee=empRepository.findById(id);
				
		return employee;
		
	}*/
	
	public List<Employee> getAllEmployees()
	{
		
		List<Employee> employe=empRepository.findAll();
				
		return employe;
		
	}
}
