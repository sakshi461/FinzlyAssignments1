package com.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	int empid;
	String firstname;
	String lastname;
	String dob;
	String email;
	String department;
	String salary;

	@Id
	public int getEmpId() {
		return empid;
	}

	public void setEmpId(int id) {
		this.empid = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob
				+ ", email=" + email + ", department=" + department + ", salary=" + salary + "]";
	}
//	@Version
//    @Column(name = "version")
//    private int version;

}
