package com.jsp.helper;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class Helper {
	
	public Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root321";
		Connection connection=null;
		try {
			//load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			connection=DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return connection;
	}

}
