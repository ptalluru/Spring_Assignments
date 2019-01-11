package com.cg.app.springaopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.app.springaopdemo.service.Calculator;

public class App {
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calculator cal = context.getBean(Calculator.class);
		cal.add(0, 200);
    }
}
