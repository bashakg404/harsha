package com.basha.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Course;
import com.basha.hibernate.demo.entity.Instructor;
import com.basha.hibernate.demo.entity.InstructorDetail;
import com.basha.hibernate.demo.entity.Review;
import com.basha.hibernate.demo.entity.Student;

public class AddCoursesForAviDemo {



	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			//get the student mary from database
			
			//create some more courses
			
			//add students to the courses
			
			//save the courses
			
			int studentId=2;
			Student tempStudent=session.get(Student.class, studentId);
			System.out.println("\n Loaded Student:" + tempStudent);
			System.out.println("Course: " + tempStudent.getCourses());
			
			//create more courses
			Course tempCourse1=new Course("PuzzleMaths- How to solve easily");
			
			Course tempCourse2=new Course("How To Win- Success Story");
			
			//add students to the courses
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			//save the courses
			System.out.println("\n Saving the Courses...");
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			
			// add clean up code
			session.close();
			
			factory.close();
		}
	}

}




