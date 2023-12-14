package org.perscholas.database;



import org.perscholas.database.doa.OrderDAO;
import org.perscholas.database.doa.ProductDAO;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class CreateOrderDetails {
	
	private ProductDAO productDAO = new ProductDAO();
	private OrderDAO orderDAO = new OrderDAO();
	
	
	
    public void createOrderDetails() {
        // Import relevant DAO classes
        Product p = productDAO.findById(1);
        Order o = orderDAO.findById(10100);

        OrderDetail od = new OrderDetail();
        od.setProduct(p);
        od.setOrder(o);
        od.setOrderLineNumber((short)200);
        od.setPriceEach(5.55);
        od.setQuantityOrdered(300); // Fix the typo here


        orderDAO.save(o); // Fix the variable name to use the correct DAO class
    }

    public static void main(String[] args) {
        CreateOrderDetails createOrderDetails = new CreateOrderDetails();
        createOrderDetails.createOrderDetails();
    }
}

