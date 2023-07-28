package veiw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// 디자인 패턴 :
		// 계속해서 같은 문제가 발생, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 곳!
		// MVC
		// Model : 데이터를 저장하거나 조작하기 위한 코드의 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분

		// DAO객체를 먼저 생성
		MemberDAO dao = new MemberDAO();

		System.out.println("========회원관리 프로그램=========");

		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원목록 [5]회원정보수정 [6]종료");

			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			if (input == 1) {
				// 회원가입
				System.out.println("======회원가입=====");

				// 사용자 입출력 구간
				System.out.print("ID 입력 : ");
				String id = sc.next();

				System.out.print("PW 입력 : ");
				String pw = sc.next();

				System.out.print("이름 입력 : ");
				String name = sc.next();

				System.out.print("나이 입력 : ");
				int age = sc.nextInt();

				// DAO에 있는 join메서드 사용
				int row = dao.join(id, pw, name, age);
				if (row > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (input == 2) {
				// 로그인
				System.out.println("======로그인======");

				// 1) 사용자로부터 아이디와 비밀번호 입력 받기
				System.out.print("ID 입력 :");
				String id = sc.next();
				System.out.print("PW 입력 :");
				String pw = sc.next();

				String uName = dao.login(id, pw);
				if (uName != null) {
					System.out.println(uName + "님 환영합니다.");
				} else {
					System.out.println("회원계정을 찾을 수 없음");
				}
			} else if (input == 3) {
				// 회원탈퇴
				System.out.println("======회원탈퇴======");
				// 1) 사용자로부터 아이디와 비밀번호 입력 받기
				System.out.print("탈퇴할 ID 입력 :");
				String id = sc.next();
				System.out.print("탈퇴할 PW 입력 :");
				String pw = sc.next();
				int row = dao.resign(id, pw);
				if(row > 0) {
					System.out.println("탈퇴 성공");
				}else {
					System.out.println("탈퇴 실패");
				}
				
				
		
			} else if (input == 4) {
				// 전체회원목록 조회
				System.out.println("======전체회원조회======");
			ArrayList<MemberDTO> array = dao.selectAll();
			for(MemberDTO dto : array ) {
				System.out.print("NAME : " + dto.getName() + "\t");
				System.out.print( "ID : " + dto.getId() + "\t");
				System.out.print("AGE : " + dto.getAge() + "\t");
				System.out.println();
			}
			
//			for(int i=0; i<list.size(); i++) {
//			System.out.println("NAME : " + list.get(i).getName());
//			System.out.print("\t ID : " + list.get(i).getId());
//			System.out.print("\t AGE : " + list.get(i).getAge());
//			}
			System.out.println();
					
				
				
			} else if (input == 5) {
				// 회원정보수정
				System.out.println("======회원정보수정======");
			
				System.out.print("ID 입력 : ");
				String id = sc.next();
				
				System.out.print("PW 입력 : ");
				String pw = sc.next();
					
				
				System.out.println("수정할 이름을 입력 : ");
				String name = sc.next();
				
				int row = dao.amend(name, id, pw);
					
				if(row > 0) {
					System.out.println("회원정보 수정 성공");
				}else {
					System.out.println("회원정보 수정 실패");
				}
			
				
			
				
				
				
			} else if (input == 6) {
				// 종료
				System.out.println("======종료======");
				break;
			} else {
				System.out.println("잘못 누르셨습니다!");
			}

		}
	}

}
