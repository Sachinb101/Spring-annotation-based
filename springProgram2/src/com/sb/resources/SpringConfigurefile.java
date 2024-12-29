package com.sb.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sb.Student;

@Configuration
public class SpringConfigurefile {

	@Bean("stdObj1")
	public Student createStdBeanObj1() 
	{
		Student std=new Student();
		std.setName("Vishal");
		std.setRollno(202);
		std.setEmail("vishal@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj2")
	public Student createStdBeanObj2() {
	Student std=new Student();
	std.setName("Samarth");
	std.setRollno(203);
	std.setEmail("samarth@gmail.com");
	
	return std;
}
}
