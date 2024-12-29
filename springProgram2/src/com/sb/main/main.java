package com.sb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sb.Student;
import com.sb.resources.SpringConfigurefile;

public class main {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigurefile.class);
		
        //Student std=(Student)context.getBean("stdId");
		//std.display();
		
		//Student std=context.getBean(Student.class);
		//std.display();
		// method name and bean names are diffrent 
		//Student std=(Student)context.getBean("stdObj");
		//std.display();
		
		// two objects having same method but different data   
		Student stdObj1=(Student)context.getBean("stdObj1");
		stdObj1.display();
		System.out.println("..................................................");
		Student stdObj2=(Student)context.getBean("stdObj2");
		stdObj2.display();
		
	}

}
