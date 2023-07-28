package com.jsp.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class testimg {
   public static void main(String args[]) throws Exception{
      //Registering the Driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/image";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "root321");
      System.out.println("Connection established......");
      PreparedStatement pstmt = con.prepareStatement("INSERT INTO image_table VALUES(?,?)");
      pstmt.setString(1, "sample image");
      //Inserting Blob type
      InputStream in = new FileInputStream("C:\\Users\\ANUJEETP\\Pictures\\Screenshots\\img.png");
      pstmt.setBlob(2, in);
      //Executing the statement
      pstmt.execute();
      System.out.println("Record inserted......");
      con.close();
   }
}