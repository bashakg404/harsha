package com.cgiindia.hibernate;

public class Lab1A {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
			Session session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = new Customer("basha", "basha@cgi.com", 12345, "Bangalore", 25000.0);
			session.save(customer);
			transaction.commit();
			session.close();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
	}
}
