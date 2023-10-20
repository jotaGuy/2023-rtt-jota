package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepareStatementExamples {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classic_models";
		String user = "root";
		String password = "* QvjdbjBfLhXy";

		Connection connection = null;
		try {

			connection = DriverManager.getConnection(dburl, user, password);

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an employee first name: ");
			String firstname = scanner.nextLine();
			
			System.out.println("Enter an employee first name: ");
			String lastname = scanner.nextLine();

			String SelectSQL = "Select * FROM employees WHERE firstname = ? AND lastname = ?";

			PreparedStatement mystmt = connection.prepareStatement(SelectSQL);

			mystmt.setString(1, firstname);
			mystmt.setString(2, lastname);

			ResultSet result = mystmt.executeQuery();

			while (result.next()) {
				String name = result.getString("firstName");
				String lName = result.getString("lastName");
				String email = result.getString("email");
				System.out.println(name + " | " + lName + " | " + email);
			}

			result.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

