package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OrderProductExample {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classic_models";
		String user = "root";
		String password = "* QvjdbjBfLhXy";

		Connection connection = null;
		try {

			connection = DriverManager.getConnection(dburl, user, password);

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter order number: ");
			int orderNumber = scanner.nextInt();

			String SelectSQL = "SELECT o.id, p.product_name FROM orders o, products p WHERE id = ? AND p. =";

			PreparedStatement mystmt = connection.prepareStatement(SelectSQL);
			mystmt.setInt(1, orderNumber);
			
			ResultSet result = mystmt.executeQuery();

			while (result.next()) {
				String id = result.getString("id");
				//String customerId = result.getString("customer_id");
				//String status = result.getString("status");
				//String email = result.getString("email");
				//System.out.print();
				System.out.println(id);
			}

			result.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


