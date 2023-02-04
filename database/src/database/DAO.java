package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	String jdbcURL;
	String jdbcDriver;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public DAO() {
		jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	}
	public void deleteNum(String num1) {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = " delete from board "
				+ " where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num1);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void subjectUpdate(String num1 , String subject) {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = " update board "
				+ " set subject = ? "
				+ " where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, subject);
			pstmt.setString(2, num1);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다. ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	
	public void contentUpdate(String num1 , String content) {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = " update board "
				+ " set content = ? "
				+ " where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, content);
			pstmt.setString(2, num1);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다. ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	
	public void boardUpdate(String num1 ,String subject, String content) {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = " update board "
				+ " set subject =?, content = ? "
				+ " where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, subject);
			pstmt.setString(2, content);
			pstmt.setString(3, num1);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다. ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
	
	
	
	
	
	
	
	public void selectNum(String num1) {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = "select * from board where num = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num1);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("번호      제목       내용      등록일");
				System.out.println(rs.getString(1) + "    " 
						  +rs.getString(2) + "    "
						  +rs.getString(3) + "    "
						  +rs.getString(4));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {}
		}
	}
	
	public void boardInsert(String num1, String subject,String content) {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = " insert into board(NUM,SUBJECT, CONTENT, REGEDATE ) "
				+ " values(?,?,?, sysdate) ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num1);
			pstmt.setString(2, subject);
			pstmt.setString(3, content);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 입렫되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}	
	public void boardSelectAll() {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection( jdbcURL, "smrit", "oracle");
			sql = "select * from board ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("번호      제목       내용      등록일");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "    " 
								  +rs.getString(2) + "    "
								  +rs.getString(3) + "    "
								  +rs.getString(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {}
		}
	}
	
	
	
}
