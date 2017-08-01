package com.spring.fram.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;




public class GlobalSecurityMethodConfig extends
		GlobalMethodSecurityConfiguration {

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		super.configure(auth);
	}
	

}
