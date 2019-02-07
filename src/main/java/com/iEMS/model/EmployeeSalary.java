package com.iEMS.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Salary")
public class EmployeeSalary
{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "emp_sal_id", unique = true)
	private Integer id;

	@Column(name = "annual_salary")
	private Float annualsal;

	@Column(name = "monthly_salary")
	private Float monthlysal;
	
	@ManyToOne
    @JoinColumn(name = "emp_Id")
    private Employee employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getAnnualsal() {
		return annualsal;
	}

	public void setAnnualsal(Float annualsal) {
		this.annualsal = annualsal;
	}

	public Float getMonthlysal() {
		return monthlysal;
	}

	public void setMonthlysal(Float monthlysal) {
		this.monthlysal = monthlysal;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
