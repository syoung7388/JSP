package com.lcomputerstudy.testmvc.database;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionB {
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		
		Connection conn = null;
		
		String url= "jdbc:mysql://localhost:3306/test";
		String id= "root";
		String pw= "4848";
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		conn= DriverManager.getConnection(url,id,pw);
		
		return conn;
	}

}
