package com.ais.spring4.dao;

import java.util.List;
import com.ais.spring4.domain.Employee;
import com.ais.spring4.util.DataSource;

public class EmployeeDAO {

	private DataSource dataSource;
	public EmployeeDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Employee> getEmployeeDetails() {
		return dataSource.getEmployeeDetails();
	}

}