package com.tap.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Address;
import com.tap.pojo.Employee;

public class Launch {

	public static void main(String[] args) {
		String config = "com/tap/config/applicationContext.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(config);
		Employee e = (Employee)a.getBean("empI1");
		Address addr = e.getAddress();
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
		System.out.println(addr.getCity() + " " + addr.getHouseNo() + " " + addr.getCountry());
	}

}
