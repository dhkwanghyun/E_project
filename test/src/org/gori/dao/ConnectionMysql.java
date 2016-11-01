package org.gori.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class ConnectionMysql {
	public static Connection getConnection(){
		String url="jdbc:mysql://localhost/goridatabase";
		String user="ohkwang";
		String password="1234";
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("sucess");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
