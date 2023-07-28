package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import view.Select;

public class Login_Controller {
	public static void main(String[] args) {

		Login_Controller a = new Login_Controller();

		a.scoreBoard();


	}

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
			String password = "smhrd3";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	///////////////////////////////// DB연결 메소드
	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();

		} catch (Exception e) {
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
		} finally {
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

			if (rs.next() == true) {
				uName = rs.getString("name");
			} else {
				uName = null;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				getClose();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return uName;

	}

	///////////////////////////////////////////////////

	// 회원탈퇴
	public int delUser(String id, String pw) {
		try {
			getConn();
			String sql = "DELETE FROM USERINFO WHERE ID = ? AND PW = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				getClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;

	}

/////////////////////////////////////////////////////////////////////

	// 스코어 담기

	public int finalScore(String id, int score1, int score2, int score3, int score4, int max) {

		try {
			getConn();

			String sql = "INSERT INTO USERSCORE VALUES (?, ?, ?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setInt(2, score1);
			psmt.setInt(3, score2);
			psmt.setInt(4, score3);
			psmt.setInt(5, score4);
			psmt.setInt(6, max);

			row = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

	/////////////////////////////////////////////////////////////////////
	// 랭킹 등록하기
	public int onRank(String id, int score1, int score2, int score3, int score4, int max) {

		try {
			getConn();

			String sql = "INSERT INTO USERSCORE VALUES (?, ?, ?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setInt(2, score1);
			psmt.setInt(3, score2);
			psmt.setInt(4, score3);
			psmt.setInt(5, score4);
			psmt.setInt(5, max);

			row = psmt.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;

	}

	////////////////////////////////////////////////////////////////////////////
	//

	/////////////////////////////////////////////////////////////////////

	// 랭킹 등록 삭제하기

	public int delScore(String id) {
		try {
			getConn();
			String sql = "DELETE FROM USERSCORE WHERE ID = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				getClose();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return row;
	}

	//////////////////////////////////////////
	// 랭킹 확인(전체 점수 조회)

	// ID 이름 나이
	// test test 20
	// zznnan 문진환 28
	// SELECT ID, NAME AS 이름, AGE AS 나이 FROM AIMEMBER

	public void scoreBoard() {
		try {
			getConn();

			// SQL문 준비하고 전송
			String sql = "SELECT RANK() OVER(ORDER BY 최고점 DESC) 순위, 최고점, ID, GW, SW, JH, JS FROM USERSCORE";
			psmt = conn.prepareStatement(sql);

			// 커서로 보여주도록?
			rs = psmt.executeQuery();
			System.out.println(" 순위 \t 최고점 \t ID \t 건욱(GW)점수 \t 선웅(SW)점수 \t 진환(JH)점수 \t 지수(JS)점수");

			while (rs.next()) {

				int rank = rs.getInt("순위");
				int high = rs.getInt("최고점");
				String uID = rs.getString("id");
				int score1 = rs.getInt("GW");
				int score2 = rs.getInt("SW");
				int score3 = rs.getInt("JH");
				int score4 = rs.getInt("JS");

				System.out.print(rank + "\t");
				System.out.print(high + "\t");
				System.out.print(uID + "\t");
				System.out.print(score1 + "\t");
				System.out.print(score2 + "\t");
				System.out.print(score3 + "\t");
				System.out.println(score4 + "\t");

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				getClose();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void maxScoreBoard(String id) {

		// max 컬럼 뽑기
		String column = null;
		Select sel = new Select();
		if (sel.max == sel.score1) {
			column = "GW";

		} else if (sel.max == sel.score2) {
			column = "SW";

		} else if (sel.max == sel.score3) {
			column = "JH";

		} else if (sel.max == sel.score4) {
			column = "JS";
		}

		try {
			getConn();

			// SQL문 준비하고 전송
			String sql = "SELECT * FROM (SELECT * FROM USERSCORE WHERE ID = ?  ORDER BY 최고점 DESC) WHERE ROWNUM =1";
			psmt = conn.prepareStatement(sql);

			 psmt.setString(1, id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int score = rs.getInt(column);
				
				String uID = rs.getString("ID");

				System.out.println(uID + "님은 " + column + "님과 " + score + "점으로 가장 높은 점수를 획득하셨습니다!");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				getClose();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
