package com.basha.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try{
			
			//start the transactiuon
			session.beginTransaction();
			
			//query the students
			List<Student> theStudents=session.createQuery("from Student").getResultList();
			
			//display the students
			displayStudents(theStudents);
			
			//query students : last name='C'
		theStudents=session.createQuery("from Student s where s.lastName='C'").getResultList();
		
		//display the stundents
		System.out.println("\n\nStudents who have last name of C");
		displayStudents(theStudents);
			
			//query student: lastName ='C' or firstName='Avinash'
	    theStudents= session.createQuery("from Student s where" 
			+ " s.lastName='C' OR s.firstName='Avinash'").getResultList();
			
			//display the stundents
			System.out.println("\n\nStudent who have last name of Hosmani OR first name Aparna ");
			displayStudents(theStudents);
			
			//query student: email like @basha
		theStudents =session.createQuery("from Student s where"
				+ " s.email LIKE '%basha.com'").getResultList();
		//display the stundents
		System.out.println("\n\nStudent whose email id is like %@basha ");
		displayStudents(theStudents);
		
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		finally{
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}
}
	

