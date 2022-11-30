package com.ph3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		College c=context.getBean("college", College.class);
		System.out.println(c.getCollegeName()+"\t");
		c.getCourses().forEach(System.out::println);
	}

}
