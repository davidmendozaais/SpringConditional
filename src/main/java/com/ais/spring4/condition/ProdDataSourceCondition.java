package com.ais.spring4.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ProdDataSourceCondition implements Condition {

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String dbname = context.getEnvironment().getProperty("database.name");
		return dbname.equalsIgnoreCase("prod");
	}

}