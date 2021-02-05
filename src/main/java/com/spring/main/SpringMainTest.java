package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class SpringMainTest {

	public static void main( String[] args )
    {
		//Loading from class path
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println("Student No:" + student.getSno());
        System.out.println("Student Name:" + student.getSname());
        ac.close(); 
    }
}
