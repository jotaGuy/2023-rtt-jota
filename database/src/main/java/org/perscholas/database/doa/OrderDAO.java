package org.perscholas.database.doa;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Order;

public class OrderDAO {
	public Order findById(String date) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Order o WHERE o.id = :id"; // Example of HQL to get all records of user class
		
		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("id", date);
		
		Order result = query.getSingleResult();
		
		session.close();
		factory.close();
		return result;
	}
}
