package com.ais.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import com.ais.spring4.condition.BeanPresennceCondition;
import com.ais.spring4.domain.Employee;

@Configuration
public class EmployeeBeanConfig{
 
	  @Bean
	  @Conditional(BeanPresennceCondition.class)
	  public Employee employee() {
		  return new Employee(222,"Popeye",55000);
	  }
}