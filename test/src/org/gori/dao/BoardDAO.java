package org.gori.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.gori.dto.Board;

public class BoardDAO {

	public static void insert(Board board) {
		Connection conn = ConnectionMysql.getConnection();
		PreparedStatement pstmt = null;
		SimpleDateFormat BoardDate = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		Date date = new Date();
		System.out.println(board.toString()+"///"+BoardDate.format(date));
		String sql="insert into board (title,content,tags,p_url,likeCount,boardDate)values(?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,board.getTitle());
			pstmt.setString(2,board.getContent());
			pstmt.setString(3,board.getTags());
			pstmt.setString(4,board.getP_url());
			pstmt.setInt(5,0);
			pstmt.setString(6,BoardDate.format(date));
			pstmt.executeUpdate();
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
		
	}

	public static List<Board> list() {
		Connection conn = null;
		ResultSet rs= null;
		Statement stmt = null;
		String sql = "select * from board";
		ArrayList<Board> list = new ArrayList<Board>();
		
		conn = ConnectionMysql.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new Board(rs.getInt("bno"),
								   rs.getString("title"),
								   rs.getString("content"),
								   rs.getString("tags"),
								   rs.getString("p_url"),
								   rs.getString("likeCount"),
								   rs.getString("boardDate")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
