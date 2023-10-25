package org.perscholas.database.doa;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.OrderDetail;

public class OrderDetailDAO {
	
	public OrderDetail findOrderdetailById(Integer id) {
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		    Session session = factory.openSession();
		    String hql = "FROM Orderdetail od WHERE od.id = :id";
		    TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		    query.setParameter("id", id);
		    OrderDetail result = query.getResultList().stream().findFirst().orElse(null);
		    session.close();
		    factory.close();
		    return result;
	}
	public List<OrderDetail> findByOrderId(String order_id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		String hql = "FROM Orderdetail od WHERE od.id = :id";
		
		TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
		query.setParameter("order_id",order_id);
		
		List<OrderDetail> result = query.getResultList();
		return result;
	
	}
	
	public void save(OrderDetail save) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
//		if(save.getId() == null) {
//			session.save(save);
//		}else {
//			session.merge(save);
//		}
		session.saveOrUpdate(save);
		t.commit();
	}
}











