package com.iEMS.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "emp_id", unique = true)
	private Integer id;

	@Column(name = "First_name")
	private String fname;

	@Column(name = "last_name")
	private String lname;
	
	@Column(name = "email_id")
	private String email;
	
	@Column(name = "contact_no")
	private long contact;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "birth_date")
	private String birthdate;
	
	@Column(name = "aniversory_date")
	private String annidate;
	
	@Column(name = "joining_date")
	private String joiningdate;	
	
	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private Set<EmployeeSalary> empsal;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public String getAnnidate() {
		return annidate;
	}


	public void setAnnidate(String annidate) {
		this.annidate = annidate;
	}


	public String getJoiningdate() {
		return joiningdate;
	}


	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}


	public Set<EmployeeSalary> getEmpsal() {
		return empsal;
	}


	public void setEmpsal(Set<EmployeeSalary> empsal) {
		this.empsal = empsal;
	}
}