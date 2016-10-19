package org.gori.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.gori.dto.SignUp;

public class LoginDAO {
	

	public static boolean idCheck(String id) {
		Connection conn = ConnectionMysql.getConnection();
		Statement stmt = null;
		ResultSet rs= null;
		boolean idCheck = true;
		String sql = "select id from login";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				if(id.equals(rs.getString("id"))){
					idCheck=false;
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return idCheck;
	}

	public static boolean insert(SignUp signUp) {
		Connection conn = ConnectionMysql.getConnection();
		PreparedStatement pstmt = null;
		SimpleDateFormat signUpDate = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");		
		Date date = new Date();
		System.out.println(signUpDate.format(date));
		boolean signUpCheck = false;
		String sql="insert into login values(?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, signUp.getName());
			pstmt.setString(2, signUp.getId());
			pstmt.setString(3, signUp.getPassword());
			pstmt.setString(4, signUp.getEmail());
			pstmt.setInt(5, signUp.getAge());
			pstmt.setString(6, signUpDate.format(date));
			int res = pstmt.executeUpdate();
			if(res>0){
				System.out.println("����");
				signUpCheck=true;
			}else{
				System.out.println("����");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return signUpCheck;
		
	}
	
}
