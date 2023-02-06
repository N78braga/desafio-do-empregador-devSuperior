package com.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payDay;
	
	private Address address;
	private List<Employee> employee = new ArrayList<>();
	
	
	public Department() {
		
	}


	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPayDay() {
		return payDay;
	}


	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public List<Employee> getEmployee() {
		return employee;
	}

	public void addEmployee(Employee employee) {
		this.employee.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}
	
	public double payRoll() {
		
	double soma = 0;
				for(Employee sum : employee) {
					
					soma += sum.getSalary();
				}
			return soma;
	}
	/*String email = "";
	public String toString() {
		return  email = address.getEmail();
		}*/
		
		
	
	
}
