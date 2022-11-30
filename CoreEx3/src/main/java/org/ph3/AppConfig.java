package org.ph3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Address address() {
		Address address= new Address();
		address.setDno(1);
		address.setStreetName("gooty road");
		address.setLoc("atp");
		return address;
	}
	@Bean
	public Emp emp() {
		Emp emp= new Emp();
		emp.setEno(1);
		emp.setName("Ram");
		emp.setAddress(address());
		return emp;
	}
}
