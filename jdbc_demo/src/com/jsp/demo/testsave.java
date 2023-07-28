package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testsave {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root321";
		Connection connection=null;
		try {
			//step:1==to load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step:2to establish connection
		    connection=DriverManager.getConnection(url, username, password);
			
			//Step 3 : Create statement
			Statement statement=connection.createStatement();
			
           //Step 4 : To execute statement
			statement.execute("INSERT INTO pen VALUES (2,'ijk', 'yellow', 100)");
			statement.execute("INSERT INTO pen VALUES (3,'ghf', 'white', 75)");
			statement.execute("INSERT INTO pen VALUES (4,'mno', 'blue', 125)");
		    System.out.println("data has beed inserted");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// Step 5 : close the connection
			 try {
				 System.out.println("connection has been closed");
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
			
	}

}
