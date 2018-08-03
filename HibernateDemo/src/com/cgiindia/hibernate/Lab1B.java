package com.cgiindia.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1B {
	public static void main(String[] args) {
	Transaction transaction = null;
		try {
			SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
			Session session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			Customer customer=(Customer)
					session.load(Customer.class, 1);
			System.out.println(customer.getCid()+"\t" +customer.getCname()+"\t"+customer.getEmail()+"\t"+customer.getPhone()+"\t"+customer.getCity()+"\t"+customer.getBalance());
			transaction.commit();

			session.close();
		}catch (Exception e){
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
		
		}
			
			
}
