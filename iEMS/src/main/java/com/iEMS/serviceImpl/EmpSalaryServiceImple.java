package com.iEMS.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iEMS.model.Employee;
import com.iEMS.model.EmployeeSalary;
import com.iEMS.repositry.EmpRepository;
import com.iEMS.repositry.EmpSalaryRepository;
import com.iEMS.service.EmpSalaryService;

@Service
@Component
@ComponentScan({"com.iEMS.repositry"})
public class EmpSalaryServiceImple implements EmpSalaryService {

	@Autowired
	private EmpSalaryRepository empSalRepository;
	
	@Autowired
	private EmpRepository empRepository;
	
//	@Override
//	public String empSalary(EmployeeSalary empsal)
//	{
//		
//		empSalRepository.save(empsal);
//		return "Salary Registered";
//	}
	@Override
	public String empSalary(EmployeeSalary empsal,int id)
	{		
		EmployeeSalary empsal1=empSalRepository.findByEmployeeId(id);
		empsal1.setAnnualsal(empsal.getAnnualsal());
		empsal1.setMonthlysal(empsal.getMonthlysal());		
		empSalRepository.save(empsal1);
		return "SAVE SUCCESS";
	}

}
