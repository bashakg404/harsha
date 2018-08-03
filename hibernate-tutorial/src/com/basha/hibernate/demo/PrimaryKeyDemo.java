package com.basha.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.basha.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		//create session factory
				SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(Student.class).buildSessionFactory();
				
				//create session
				Session session=factory.getCurrentSession();
				
				try{
					
					//create a 3 student object
					System.out.println("Create a 3 Student object..");
					Student tempStudent1 =new Student("Ragu", "C", "raghu@basha.com");
					Student tempStudent2 =new Student("Pramod", "BR", "pammi@basha.com");
					Student tempStudent3 =new Student("Avinash", "CS", "avi@basha.com");
					Student tempStudent4 =new Student("Katla", "S", "katla@basha.com");
					
					
					//start the transactiuon
					session.beginTransaction();
					
					//save the student object
					System.out.println("Saving the Students...");
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					session.save(tempStudent4);
					//commit transaction
					session.getTransaction().commit();
					System.out.println("Done!");
					
					
					
				}
				finally{
					factory.close();
				}
				
			}



	}


