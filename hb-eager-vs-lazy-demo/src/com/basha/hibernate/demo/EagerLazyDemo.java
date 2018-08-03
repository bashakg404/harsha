package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Course;
import com.basha.hibernate.demo.entity.Instructor;
import com.basha.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {


			// start the transactiuon
			session.beginTransaction();

			// get the instructor from db
			int theId=3;
			Instructor tempInstructor=session.get(Instructor.class, theId);
			
			System.out.println("Love 2 Code: Instructor:" + tempInstructor);
			
			//get courses for instructor
			System.out.println("Love To Code: Courses:" + tempInstructor.getCourses());
			
			// commit transaction
			session.getTransaction().commit();
			
			//close the session
			
			session.close();
			
			System.out.println("\nLuv 2 Code: The session is now closed!\n");
			
			//option 1: call the getter method while session is open
			
			//get courses for instructor
			System.out.println("Love To Code: Courses:" + tempInstructor.getCourses());
			
			
			System.out.println("Love To Code: Done!");

		} finally {
			//add clean up code
			session.close();
			factory.close();
		}

	}

}
