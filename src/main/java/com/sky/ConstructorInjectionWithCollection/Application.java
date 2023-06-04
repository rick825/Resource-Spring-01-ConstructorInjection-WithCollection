package com.sky.ConstructorInjectionWithCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {

	    ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");

		Employee e=(Employee)context.getBean("employee");
		e.Run();
	}

}
