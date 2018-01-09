package com.ais.spring4.service;

import java.util.List;
import com.ais.spring4.dao.EmployeeDAO;
import com.ais.spring4.domain.Employee;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;
	public EmployeeService(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	public List<Employee> getEmployeeDetails(){
		return employeeDAO.getEmployeeDetails();
	}

}