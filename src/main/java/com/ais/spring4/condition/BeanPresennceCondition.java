package com.ais.spring4.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import com.ais.spring4.config.EmployeeBeanConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

public class BeanPresennceCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		EmployeeBeanConfig employeeBeanConfig = null;
		try {
			employeeBeanConfig = (EmployeeBeanConfig)context.getBeanFactory().getBean("employeeBeanConfig");	
		}catch(NoSuchBeanDefinitionException ex) {
			
		}
		return employeeBeanConfig != null;
	}

}