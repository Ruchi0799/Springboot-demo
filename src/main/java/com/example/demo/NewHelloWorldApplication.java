package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.component.DemoBean;
import com.example.demo.controller.HelloRestController;

@SpringBootApplication
public class NewHelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello from bridgelabz from Ruchi ");
		ApplicationContext context=SpringApplication.run(NewHelloWorldApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		System.out.println("Demo Bean= "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
		//ApplicationContext context=SpringAppplication.run(NewHell)
	}

}
