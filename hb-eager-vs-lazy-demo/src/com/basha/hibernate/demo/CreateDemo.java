package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Instructor;
import com.basha.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

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
			/*
			//create the objects
			Instructor tempInstructor=new Instructor("Anil", "BP", "anil@luv2learn.com");
			
			InstructorDetail tempInstructorDetail=
					new InstructorDetail("http://www.luv2learn.com/youtube",
							"Luv 2 Code");*/
			
			//create the objects
			Instructor tempInstructor=new Instructor("Basha", "KG", "basha@luv2learn.com");
			
			InstructorDetail tempInstructorDetail=
					new InstructorDetail("http://www.youtube.com",
							"Luv 2 Learn");
			
			//associate the object
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			//start the transactiuon
			session.beginTransaction();
			
			//save the instructor
			
			//Note: this will also save the details object
			//becuase CascadeType.ALL
			System.out.println("Saving Instructor: " + tempInstructor);
			session.save(tempInstructor);
			
			//save the instructor
			
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		finally{
			factory.close();
		}
		
	}

}
