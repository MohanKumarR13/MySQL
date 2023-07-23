package com.mysql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSELECTCommand {

	public static void main(String[] args) throws SQLException {
		// 1.Create a conncetion
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");

		// 2.Create Statement/Query
		Statement statement = connection.createStatement();
		String select = "SELECT Code,Name,Continent FROM COUNTRY";

		// 3.Excecute Statement/Query
		statement.execute(select);

		// 4.Store Data in Result set
		ResultSet resultSet = statement.executeQuery(select);
		while (resultSet.next()) {
			String code = resultSet.getString("Code");
			String name = resultSet.getString("Name");
			String continent = resultSet.getString("Continent");
			System.out.println(code + "  " + name + "  " + continent);
		}

		// 5.Close Connection
		connection.close();

		System.out.println("Query Excecuted....");
	}

}
