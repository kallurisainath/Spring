package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Employee;

@Configuration
public class ConfigFile {
	@Bean(name = "empI1")
	public Employee empI1() {
		Employee e1 = new Employee(1, "sai", 30000);
		return e1;
	}
	
}
