package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Instructor;
import com.basha.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

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
			
			//get the instructor by primary key / id
			int theId=1;
			Instructor tempInstructor=
					session.get(Instructor.class, theId);
			
			System.out.println("Found Instructor:" + tempInstructor);
			
			//delete the instructors
			if (tempInstructor !=null){
				System.out.println("Deleting: " + tempInstructor);
				
				//Note: will also delete associate details object 
				//because of Cascade.ALL
				//
				session.delete(tempInstructor);
			}
			
			
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		finally{
			factory.close();
		}
		
	}

}
