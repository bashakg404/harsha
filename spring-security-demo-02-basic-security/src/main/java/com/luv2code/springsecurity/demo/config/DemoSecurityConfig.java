package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//add our users for in memory authentication
		UserBuilder users=User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
				.withUser(users.username("harsha").password("test123").roles("EMPLOYEE"))
				.withUser(users.username("appu").password("test123").roles("MANAGER"))
				.withUser(users.username("avi").password("test123").roles("ADMIN"));
				
		
	}

}