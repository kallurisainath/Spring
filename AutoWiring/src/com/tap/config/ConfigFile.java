package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Address;
import com.tap.pojo.Employee;

@Configuration
public class ConfigFile {
	@Bean(name = "addr1")
	public Address addr1() {
		Address ad = new Address();
		ad.setCity("kadapa");
		ad.setHouseNo(1001);
		ad.setCountry("India");
		return ad;
	}
	@Bean(name = "addr2")
	public Address addr2(){
		Address ad = new Address();
		ad.setCity("kadapa");
		ad.setHouseNo(1001);
		ad.setCountry("India");
		return ad;
	}
	@Bean(name = "empI1")
	public Employee empI1() {
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("sai");
		e1.setSalary(30000);
		return e1;
	}
	
}
