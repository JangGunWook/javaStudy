package MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MemberDAO {
	
	Scanner sc = new Scanner(System.in);
	
	// 공통 필드
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int row = 0;
	
	
	// DB연결 메소드
	
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-cgi.smhrd.com:1524:xe";
			String user = "cgi_5_230721_3";
			String password ="smhrd3"; 
			
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("연결 성공~");
			}
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	///////////////////////////////// DB연결 메소드
	private void getClose() {
		try {
			if(rs!= null)
				rs.close();
			if(psmt!=null)
				psmt.close();
			if(conn!=null)
				conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	////////////////////////////// 회원가입 메소드
	public int join(String id, String pw, String name) {
		
		try {
			getConn();
			
			String sql = "INSERT INTO USERINFO VALUES (?, ?, ?)";
			
			psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		psmt.setString(3, name);
		
		row = psmt.executeUpdate();
		
		} catch (Exception e) {
	
			e.printStackTrace();
		}finally {
			getClose();
		}
		
		return row;
		
	}
	
	////////////////////////////////////////////////////////
	// 로그인
	public String login(String id, String pw) {
		
		String uName = null;
		try {
		getConn();
		String sql = "SELECT * FROM USERINFO WHERE ID = ? AND PW = ?";
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		
		rs = psmt.executeQuery();
		
		if(rs.next() == true) {
			uName = rs.getString("name");
		}else {
			uName=null;
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
		
			getClose();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		} return uName;
		
	}
		
		///////////////////////////////////////////////////
	    
	    //회원탈퇴
	public int  delUser(String id, String pw) {
		try {
		getConn();
		String sql = "DELETE FROM USERINFO WHERE ID = ? AND PW = ?";
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setString(2, pw);
		
		row = psmt.executeUpdate();
		
		
	
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			getClose();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}return row;
	
	}
	
/////////////////////////////////////////////////////////////////////
		
		
		
		//스코어 담기
	
	public int finalScore(String id, int score1, int score2, int score3, int score4) {
		
		try {
			getConn();
			
			String sql = "INSERT INTO USERSCORE VALUES (?, ?, ?, ?, ?)";
			
			psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setInt(2, score1);
		psmt.setInt(3, score2);
		psmt.setInt(4, score3);
		psmt.setInt(5, score4);
		
		row = psmt.executeUpdate();
		
		
		} catch (Exception e) {
	
			e.printStackTrace();
		}finally {
			getClose();
		}
		
		return row;
		
	}
	
	/////////////////////////////////////////////////////////////////////
	// 랭킹 등록하기
public int onRank(String id, int score1, int score2, int score3, int score4) {
		
		try {
			getConn();
			
			String sql = "INSERT INTO USERINFO VALUES (?, ?, ?, ?, ?)";
			
			psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		psmt.setInt(2, score1);
		psmt.setInt(3, score2);
		psmt.setInt(4, score3);
		psmt.setInt(5, score4);
		
		row = psmt.executeUpdate();
		
		} catch (Exception e) {
	
			e.printStackTrace();
		}finally {
			getClose();
		}
		
		return row;
		
	}
	
	/////////////////////////////////////////////////////////////////////
	
	// 랭킹 등록 삭제하기
	
	public int  delScore(String id) {
		try {
		getConn();
		String sql = "DELETE FROM USERSCORE WHERE ID = ?";
		
		psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
		
		row = psmt.executeUpdate();
		
		
	
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			getClose();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}return row;
	
	}
	/////////////////////////////////////////////////////////////////////
	
	// 스코어보드 보여주기
	
public String scoreBoard(String id, String pw) {
		
		String uName = null;
		try {
		getConn();
		String sql = "SELECT * FROM USERSCORE ";
		
		psmt = conn.prepareStatement(sql);
		
		
		rs = psmt.executeQuery();
		
		if(rs.next() == true) {
			uName = rs.getString("name");
		}else {
			uName=null;
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
		
			getClose();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		} return uName;
		
	}
		
	

		
	
	
	
	
	
	

}
