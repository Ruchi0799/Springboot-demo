package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;
import com.example.demo.controller.HelloRestController;

@SpringBootApplication
public class NewHelloWorldApplication {

	public static final Logger logger=LoggerFactory.getLogger(NewHelloWorldApplication.class);
	
	public static void main(String[] args) {
		//System.out.println("Hello from bridgelabz from Ruchi ");
		logger.debug("Welcome to Spring concept demo");
		ApplicationContext context=SpringApplication.run(NewHelloWorldApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		//System.out.println("Demo Bean= "+demoBean.toString());
		//System.out.println(context.getBean(HelloRestController.class));
		logger.debug("Demo Bean= "+demoBean.toString());
		
		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
	

}
