package ex01JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.xml.sax.SAXNotRecognizedException;

public class ex06회원정보검색 {

	public static void main(String[] args) {
		
		// id와 pw를 통해 회원 정보를 조회하기
		
		ResultSet rs = null;
		PreparedStatement psmt = null;
		Connection conn = null;

		Scanner sc = new Scanner(System.in);
		System.err.print("ID를 입력하세요 : ");
		String id = sc.next();
		
		System.err.print("PW를 입력하세요 : ");
		String pw = sc.next();
		
		
		
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
			String sql = "SELECT * FROM AIMEMBER WHERE ID = ? AND PW = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				String uName= rs.getString("NAME");
				
				System.out.println("안녕하세요"+ uName +"일치하는 정보가 확인됩니다.");
				
				String uId = rs.getString("ID");
				int uAge = rs.getInt("AGE");
				
				
				System.out.println("회원님의 정보는 아래와 같습니다!");
				System.out.println("NAME : " + uName + "\t ID : " + uId + "\t AGE : " + uAge );				
				
			}
			
			
			// 3) sql문 전송/실행
			//	select문 전송
			// ResultSet이란?
			// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조
			// : cursor를 가지고 있다.(처음에는 column명을 가리키고 있음)
			// : cursor가 가리키고 있는 데이터만 가져올 수 있다.
			rs = psmt.executeQuery();
			
			// rs.next() ---> 커서를 한 행 밑으로 내리는 작업이다!
			
				
				
			
			
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
