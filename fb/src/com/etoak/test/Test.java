package com.etoak.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.etoak.bean.Student;
import com.etoak.sf.SF;

public class Test {

	public static void main(String[] args) {
		Session session = SF.getSession();
		Transaction tx = session.beginTransaction();
		
		Student stu = new Student();
		stu.setId(5);
		stu.setName("yaoyao");
		stu.setPassword("128");
		session.save(stu);
		
//		session.update(stu);
//		session.delete(stu);
		
		
//		select 
		Student hh = (Student) session.get(Student.class,2);
		System.out.println(hh.getName() + " : " + hh.getPassword());
		tx.commit();
	}       

}