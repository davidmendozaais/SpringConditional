package com.ais.spring4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import com.ais.spring4.condition.DevDataSourceCondition;
import com.ais.spring4.condition.ProdDataSourceCondition;
import com.ais.spring4.util.DataSource;
import com.ais.spring4.util.DevDatabaseUtil;
import com.ais.spring4.util.ProductionDatabaseUtil;

@Configuration
public class EmployeeDataSourceConfig {
	

	  @Bean(name="dataSource")
	  @Conditional(value=DevDataSourceCondition.class)
	  public DataSource getDevDataSource() {
		  return new DevDatabaseUtil();
	  }

	  @Bean(name="dataSource")
	  @Conditional(ProdDataSourceCondition.class)
	  public DataSource getProdDataSource() {
		  return new ProductionDatabaseUtil();
	  }
}