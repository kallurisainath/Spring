package com.tap.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Launch {
	public static void main(String[] args) {
		String config = "/com/tap/config/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		Employee e = (Employee)context.getBean("EmpI1");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	}
}
