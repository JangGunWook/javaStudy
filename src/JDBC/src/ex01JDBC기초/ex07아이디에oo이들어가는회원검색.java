package ex01JDBC기초;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ex07아이디에oo이들어가는회원검색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("oo가 들어가는 아이디를 찾아주세요!" );
		String like = sc.next(); 
		

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "service";
			String passward = "12345";

			conn = DriverManager.getConnection(url, user, passward);

			if (conn != null) {
				System.out.println("연결이 완료되었습니다!");
			}

			
			String sql = "SELECT * FROM AIMEMBER WHERE ID like ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%" + like + "%" );
			rs = psmt.executeQuery();

			if (rs.next()) {
				String uName = rs.getString("NAME");
				String uId = rs.getString("ID");
				int uAge = rs.getInt("AGE");

				System.out.println("NAME : " + uName + "\t ID : " + uId + "\t AGE : " + uAge);
			} else {
				System.out.println(like +"를 포함한 회원ID는 없습니다");
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
