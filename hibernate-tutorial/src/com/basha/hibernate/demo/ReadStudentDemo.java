package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try{
			
			//create the student object
			System.out.println("Create new Student object..");
			Student tempStudent =new Student("Daffy", "Duck", "daffy@basha.com");
			
			//start the transactiuon
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the Student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			//MY NEW CODE
			
			
			//find out the students id: primary key
			System.out.println("Saved Student. Generated id: " + tempStudent.getId());
			
			//now get a new session and start transaction
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			
			//retrive the student based on the id: primary key
			System.out.println("\nGetting student with id: " + tempStudent.getId());
			
			Student myStudent= session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get Complete: " +myStudent);
			//commit the transaction
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
			
		}
		finally{
			factory.close();
		}
		
	}

}
