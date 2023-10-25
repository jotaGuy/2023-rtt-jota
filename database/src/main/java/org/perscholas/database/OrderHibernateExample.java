package org.perscholas.database;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.perscholas.database.entity.Order;

public class OrderHibernateExample {

    public static void main(String[] args) {
        Order order = new Order();

        // Create a new date object that represents right now
        Date orderDate = new Date();
        order.setOrderDate(orderDate);

        // Define a SimpleDateFormat to parse the required date string
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date requiredDate = null;

        try {
            // Parse the required date string
            requiredDate = sdf.parse("2023-10-31 12:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Print the number of milliseconds since the epoch
        System.out.println(orderDate.getTime());

        order.setRequiredDate(requiredDate);

        // Set the shipped date to null because the order has not yet shipped
        order.setShippedDate(null);
    }
}


