package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Instructor;
import com.basha.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {

		//create session factory
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		//create session
		Session session=factory.getCurrentSession();
		
		try{
			
			
			//start the transactiuon
			session.beginTransaction();
			
			//get the instructor detail object
			int theId=3;
			InstructorDetail tempInstructorDetail=session.get(InstructorDetail.class, theId);
			
			//print the instructor detail
			System.out.println("tempInstructorDetail:" + tempInstructorDetail);
			
			//print the associated instructor
			System.out.println("the associated instructor : " +
					tempInstructorDetail.getInstructor());
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		finally{
			factory.close();
		}
		
	}

}