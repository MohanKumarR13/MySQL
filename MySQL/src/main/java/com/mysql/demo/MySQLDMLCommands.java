package com.mysql.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		// 1.Create a conncetion
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

		// 2.Create Statement/Query
		Statement statement = connection.createStatement();
		String insert = "INSERT INTO STUDENT VALUES(1004,'johnwick',100)";
		String update = "UPDATE STUDENT SET SNAME='DAVID' WHERE SNO=1004";
		String delete = "DELETE FROM STUDENT WHERE SNO=1004";

		// 3.Excecute Statement/Query
		statement.execute(insert);
		statement.execute(update);
		statement.execute(delete);

		// 4.Close Connection
		connection.close();

		System.out.println("Query Excecuted....");
	}

}
