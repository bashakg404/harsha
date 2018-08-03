package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try{
			
			int studentId=18;
			
			//now get a new session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			

			//retrive the student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent= session.get(Student.class, studentId);
			
			//delete student
			/*System.out.println("Deleting student....:" +myStudent);
			session.delete(myStudent);*/
			
			//deleting student id=17 using alternate approach
			System.out.println("Deleting student using student id");
			session.createQuery("delete from Student where id=17").executeUpdate();
	
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
		}
		finally{
			factory.close();
		}
		
	}

}
