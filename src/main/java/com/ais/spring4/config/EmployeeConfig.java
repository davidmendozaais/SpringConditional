package com.ais.spring4.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ais.spring4.dao.EmployeeDAO;
import com.ais.spring4.service.EmployeeService;
import com.ais.spring4.util.DataSource;

@Configuration
public class EmployeeConfig{
	  @Autowired
	  private DataSource dataSource;
	  
	  @Bean
	  public EmployeeService employeeService() {
		  return new EmployeeService(employeeDAO());
	  }
	  
	  @Bean
	  public EmployeeDAO employeeDAO() {
		  System.out.println("EmployeeDAO employeeDAO()" + dataSource);
		  return new EmployeeDAO(dataSource);
	  }

}