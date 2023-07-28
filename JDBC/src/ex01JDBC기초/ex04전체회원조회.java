package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex04전체회원조회 {

	public static void main(String[] args) {
		
		// ID		이름		나이
		// test		test	20
		// test		임경남	20
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;

		
		// 1)DB연결
		try {
			//DB연결
			// 1-1) 드라이버 동적로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 1-2) DB 연결 통로 열기
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "service";
			String passward = "12345";
			
			conn = DriverManager.getConnection(url, user, passward);
			
			if(conn !=null) {
				System.out.println("연결 성공");
			}
			
			// 2) sql문 작성
			String sql = "SELECT * FROM AIMEMBER";
			
			psmt = conn.prepareStatement(sql);
			
			
			// 3) sql문 전송/실행
			//	select문 전송
			// ResultSet이란?
			// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조
			// : cursor를 가지고 있다.(처음에는 column명을 가리키고 있음)
			// : cursor가 가리키고 있는 데이터만 가져올 수 있다.
			rs = psmt.executeQuery();
			
			// rs.next() ---> 커서를 한 행 밑으로 내리는 작업이다!
				System.out.println();
				while(rs.next()) {
					String uName = rs.getString("NAME");
					String uId = rs.getString("ID");
					int uAge = rs.getInt("AGE");
					
					System.out.println("NAME : " + uName + "\t ID : " + uId + "\t AGE : " + uAge );
				}
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4)DB연결 종료!
			
				try {
					if(rs != null) 
					rs.close();
					if(psmt != null)
					psmt.close();
					if(conn !=null)
					conn.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		
		
	}

}
