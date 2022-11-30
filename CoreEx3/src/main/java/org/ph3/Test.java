package org.ph3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext
				(AppConfig.class);
		Emp e=context.getBean("emp", Emp.class);
		System.out.println(e.getEno());
		System.out.println(e.getName());
		System.out.println(e.getAddress().getDno());
		System.out.println(e.getAddress().getStreetName());
		
		Address a=e.getAddress();
		System.out.println(a.getLoc());
		
		

	}

}
