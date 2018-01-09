package com.ais.spring4.util;

import java.util.List;
import com.ais.spring4.domain.Employee;

public interface DataSource {
	List<Employee> getEmployeeDetails();
}