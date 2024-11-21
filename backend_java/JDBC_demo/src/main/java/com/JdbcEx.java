package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","toor");
		  Statement stmt = conn.createStatement();
		  
////	insert 
//		  String sql = "insert into jdbctest (id, name) values(3, 'Sapan')";
//		  stmt.executeUpdate(sql);
//	
		  
////		  update
//		  String sql = "update jdbctest SET name = 'Mohit' WHERE id = 2";
//		  stmt.executeUpdate(sql);
		  
////		  delete
//		  String sql = "delete from jdbctest WHERE id = 3";
//		  stmt.executeUpdate(sql);
		  
//		  retrive
		  ResultSet rs = stmt.executeQuery("select * from jdbctest");
		  while(rs.next()) {
//			  int id = rs.getInt(1);
//			  String name = rs.getString(2);
			  int id = rs.getInt("id");
			  String name = rs.getString("name");
			  System.out.println(id+"  "+name);
		  }
		  stmt.close();
		  conn.close();

	}
}