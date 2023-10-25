package org.perscholas.database;

import java.util.List;

import org.perscholas.database.doa.CustomerDAO;
import org.perscholas.database.entity.Customer;


public class HibernateExample {
	
	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		
		// Customer customer = customerDao.findById(204);
		
		// System.out.println( customer.getId() + " | " + customer.getCustomerName() );
		
		List<Customer> customers = customerDao.findByFirstName("leslie");
		
		for (Customer cust: customers) {
			System.out.println("This is" + cust.toString());
		}
		
	}

};
