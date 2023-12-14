package org.perscholas.database.doa;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Product;

public class ProductDAO {
	
	public Product findById(Integer id) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Products p WHERE p.productName like :name";
		
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter(name "%");
		
		Product result = query.getSingleResult();
		return result;
	}
	
	
	public List<Product> findByName(String id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Products p WHERE p.id = :id";
		
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("id",id);
		
		List<Product> result = query.getResultList();
		return result;
	
	}
	public void save(Product save) {
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
