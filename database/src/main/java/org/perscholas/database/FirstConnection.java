package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstConnection {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classic_models";
		String user = "root";
		String password = "* QvjdbjBfLhXy";
		try {
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an employee first name: ");
			String firstname = scanner.nextLine();
			
			
			
			
			String SelectSQL = "Select * FROM employees where firstname = '" + firstname + "' ";
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(SelectSQL);

			while (result.next()) {
				String name = result.getString("firstName");
				String email = result.getString("email");
				System.out.println(name + " | " + email);
			}
			
			result.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
