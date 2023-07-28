package com.jsp.dao;

import java.net.CookieHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.dto.Pen;
import com.jsp.helper.Helper;
import java.util.ArrayList;
import java.util.List;

public class PenDao {

	Helper helper=new Helper();
	Connection connection=null;
	
	public void addMultiplePen(List<Pen> pens) {
		connection=helper.getConnection();
		String sql="INSERT INTO pen VALUES(?,?,?,?)";
		try {
			//create statement
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			//execute statement
			
			for(Pen p:pens) {
				preparedStatement.setInt(1,p.getId());
				preparedStatement.setString(2,p.getName());
				preparedStatement.setString(3,p.getColor());
				preparedStatement.setInt(4,p.getPrice());
				preparedStatement.executeUpdate();
			}
			//preparedStatement.executeBatch();
			System.out.println("all fine");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Pen savePen(Pen pen) {
		connection=helper.getConnection();
		String sql="INSERT INTO pen VALUES(?,?,?,?)";
		try {
			
			  PreparedStatement preparedStatement=connection.prepareStatement(sql);
			  preparedStatement.setInt(1,pen.getId());
			  preparedStatement.setString(2,pen.getName());
			  preparedStatement.setString(3,pen.getColor());
             preparedStatement.setInt(4,pen.getPrice()); 
             preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return pen;
		
	}
	
	//getall
	public List<Pen> getAllPen(){
		
		connection=helper.getConnection();
		String sql="SELECT * FROM pen";
		ArrayList<Pen> al=new ArrayList<Pen>();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			 ResultSet resultset=preparedStatement.executeQuery();
			 while(resultset.next()) {
				 int id=resultset.getInt(1);
				 String name=resultset.getString(2);
				 String color=resultset.getString(3);
				 int price=resultset.getInt(4);
				 Pen p=new Pen();
				 p.setId(id);
				 p.setName(name);
				 p.setColor(color);
				 p.setPrice(price);
				 al.add(p);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}
	
	//delete
	
	public boolean deleteById(int id) {
		connection=helper.getConnection();
		String sql="DELETE FROM pen WHERE id=?";
		boolean res2=false;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			int res=preparedStatement.executeUpdate();
			if(res>0) {
				res2=true;
			}
			else {
				res2=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res2;
	}
	
	public boolean updatePen(int id,String name) {
		connection=helper.getConnection();
		String sql="UPDATE pen SET name=? WHERE id=? ";
		boolean res2=false;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,name);
			preparedStatement.setInt(2,id);
			int res=preparedStatement.executeUpdate();
			if(res>0) {
				res2=true;
			}
			else {
				res2=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res2;
		
	}
	
	public Pen penById(int id) {
		connection=helper.getConnection();
		String sql="SELECT * FROM pen WHERE id=?";
		Pen p=new Pen();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				int id2=resultSet.getInt(1);
				String name=resultSet.getString(2);
				String color=resultSet.getString(3);
				int price=resultSet.getInt(4);
				p.setId(id2);
				p.setName(name);
				p.setColor(color);
				p.setPrice(price);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
}
