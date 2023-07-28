package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import BalanceGame.BalanceGame_Controller;
import Login.Login_Controller;
import MovieGame.MovieGame_Controller;
import MovieGame.bgm.src.bgm1.bgmController;
import MovieGame.bgm.src.bgm1.bgmField;
import MusicGame.MusicController;
import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 스토리 넘어가기
		String next = sc.nextLine();
		// 문제 답변
		int answer;
		String answer1;

		String k = null;
		String playId = null;
		// Select객체
		Select sel = new Select();
		// 부금 객체
		bgmController bct = new bgmController();
		
		
		bct.play(7); // 도입부 브금
         
		String dynamicAsciiArt = "\t\t██╗░░██╗███████╗░█████╗░██████╗░████████╗  ░██████╗██╗░██████╗░███╗░░██╗░█████╗░██╗░░░░░\n"+
				 "\t\t██║░░██║██╔════╝██╔══██╗██╔══██╗╚══██╔══╝  ██╔════╝██║██╔════╝░████╗░██║██╔══██╗██║░░░░░\n"+
				 "\t\t███████║█████╗░░███████║██████╔╝░░░██║░░░  ╚█████╗░██║██║░░██╗░██╔██╗██║███████║██║░░░░░\n"+
				 "\t\t██╔══██║██╔══╝░░██╔══██║██╔══██╗░░░██║░░░  ░╚═══██╗██║██║░░╚██╗██║╚████║██╔══██║██║░░░░░\n"+
				 "\t\t██║░░██║███████╗██║░░██║██║░░██║░░░██║░░░  ██████╔╝██║╚██████╔╝██║░╚███║██║░░██║███████╗\n"+
				 "\t\t╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░  ╚═════╝░╚═╝░╚═════╝░╚═╝░░╚══╝╚═╝░░╚═╝╚══════╝";

		try {
			for (char c : dynamicAsciiArt.toCharArray()) {
				System.err.print(c);
				Thread.sleep(1); // 100밀리초(0.1초) 지연
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
 
		}
		System.out.println();
		System.out.println();
		sc.nextLine();
		String dynamicAsciiArt2 = "\t\t\t\t┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌█████┌┘█████┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌██████████████┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌████┘┌████┘┌┘███┘┌┘┌┘┌┘┌┘┌┘███████┘┌┘\n"
		         + "\t\t\t\t┘┌┘███┘┌┘┌██┘┌┘┌┘██┌┘┌┘┌┘┌┘┌┘████████┌┘┌\n"
		         + "\t\t\t\t┌┘┌██┘┌┘┌┘┌┘┌┘┌┘┌███┌┘┌┘┌┘┌┘┌┘┌┘█████┘┌┘\n"
		         + "\t\t\t\t┘┌┘██┌┘┌┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌┘┌┘┌┘███┘██┌┘┌\n"
		         + "\t\t\t\t┌┘┌██┘┌┘┌┘┌┘┌┘┌┘┌┘██┌┘┌┘┌┘┌┘┌┘███┘┌██┘┌┘\n"
		         + "\t\t\t\t┘┌┘██┌┘┌┘┌┘┌┘┌┘┌┘███┘┌┘┌┘┌┘┌┘███┘┌┘┘┌┌┘┌\n"
		         + "\t\t\t\t┌┘┌███┌┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌┘┌┘███┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌██┘┌┘┌┘┌┘┌┘┌███┌███┌┘┌┘███┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘███┘┌┘┌┘┌┘┌███┘█████┌┘█████┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘███┘┌┘┌┘┌███┌███┌█████┌┘███┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘███┘┌┘┌███┌██┘┌┘┌███┌┘┌┘██┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘███┘┌███┌┘██┌┘┌┘┌█┌┘┌┘┌███┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘┌┘██████┌┘██┌┘┌┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌███┌┘┌██┘┌┘┌┘┌┘┌┘┌┘┌┘██┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘┌┘┌┘██┌┘┌┘██┌┘┌┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘██┌┘┌┘┌┘┌┘┌┘┌███┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘┌┘┌┘██┌┘┌┘┌██┘┌┘┌┘┌┘┌┘┌┘██┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌██┘┌┘┌┘┌┘┌┘███┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘██████████┌┘███┘┌┘┌┘┌┘███┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌██████████┘┌┘███┘┌┘┌┘███┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘┌┘┌┘██┌┘┌┘┌┘┌┘███┘┌┘███┘┌┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌┘┌┘███┘███┘┌┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘┌┘┌┘██┌┘┌┘┌┘┌┘┌┘█████┘┌┘┌┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌██┘┌┘┌┘┌┘┌┘┌┘███┘┌┘┌┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘\n"
		         + "\t\t\t\t┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌┘┌\n"
		         + "\t\t\t\t";

		try {
			for (char c : dynamicAsciiArt2.toCharArray()) {
				System.err.print(c);
				Thread.sleep(1); // 100밀리초(0.1초) 지연
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		sc.nextLine();

		System.out.println("====회원가입 및 로그인====");
		while (true) {
			System.out.println("[1] 회원가입 [2] 로그인 [3] 회원탙퇴");
			int input = sc.nextInt();
			

/////////////////////////////////////////////////////////// 회원가입		
			if (input == 1) {
				System.out.println("====회원가입====");

				// 사용자 입출력 구간
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();

				Login_Controller dao = new Login_Controller();
				int row = dao.join(id, pw, name);

				if (row > 0) {
					System.out.println("회원가입 성공 ! ");
				} else {
					System.out.println("회원가입 실패 ㅠㅠ");
				}
				/////////////////////////////////////////////////////////// 로그인
			} else if (input == 2) {
				System.out.println("====로그인====");

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				Login_Controller dao = new Login_Controller();
				String uName = dao.login(id, pw);

				if (uName != null) {
					System.out.println(uName + "님 환영합니다.");
					k = uName;
					playId = id;
					break;
				} else {
					System.out.println("로그인에 실패했습니다.");
				}

			}
/////////////////////////////////////////////////////////// 회원탈퇴	
			else if (input == 3) {
				System.out.println("====회원탈퇴====");

				System.out.print("탈퇴할 ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				Login_Controller dao = new Login_Controller();
				int row = dao.delUser(id, pw);

				if (row > 0) {
					System.out.println("회원 탈퇴에 성공하였습니다.");
				} else {
					System.out.println("올바른 ID나 PW를 입력해주세요.");
				}

			} else {
				System.out.println("잘못누르셨습니다!");
			}
		}

		
		System.out.println();
		System.out.println("진행 : Press Enter");
		System.out.println();
		next = sc.nextLine();
		
		
		///////////////////////////////////////////////////////////////////////////////////// 프롤로그 아스키아트
		BufferedReader reader8 = null;
		try {
			reader8 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\프롤로그.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String str8;
		try {
			while ((str8 = reader8.readLine()) != null) {
				// System.out.println(str3);
				System.err.println(ConsoleColor.BLACK + str8 + ConsoleColor.RESET);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		/////////////////////////////////////////////////////////////////////////////////////// 
		
		next = sc.nextLine();
		System.out.println("(소란스러운 소리)"); // 왁자지껄, 웅성웅성 소란스러운 효과음 삽입
		bct.play(3); // 소란소란
		next = sc.nextLine();
		System.out.println("\"글쎄~ 우리 오빠가 그랬다니까~ ㅋㅋㅋㅋㅋㅋ\"");
		next = sc.nextLine();
		System.out.println("라는 친구의 말을 듣고");
		next = sc.nextLine();

		System.out.println(ConsoleColor.PURPLE_BOLD + "\"저 망할 기집애는 오늘도 지 남친 자랑질이네...\"" + ConsoleColor.RESET);
		next = sc.nextLine();
		System.out.println("라는 당신의 말에 친구는");
		next = sc.nextLine();
		System.out.println("\"뭐~? 모솔이 하는 말이라 목소리가 잘 안들리네~ㅎㅎ\"");
		next = sc.nextLine();
		System.out.println("\"너도 빨리 남자만나야지~ 언제까지 모솔인생만 살래?ㅎㅎ\"");
		next = sc.nextLine();
		System.out.println("하며 놀려댔다.");
		bct.stop(); // 소란스러운 소리 끝
		next = sc.nextLine();
		System.out.println("친구들과의 만남이 끝나고, 집에 돌아와 쓰러지듯 침대에 눕는 당신.");
		next = sc.nextLine();
		System.out.println("가만히 생각해보니 너무 서러워, 이불을 뒤집어쓰고");
		next = sc.nextLine();
		System.out.println("서럽게 엉엉 울기 시작한다....");
		next = sc.nextLine();
		System.out.println("그 순간....!!");
		next = sc.nextLine();
		System.out.println("당신에게 하나의 톡이 온다.");
		next = sc.nextLine();
		bct.play(5); // 카톡알림
		System.out.println("\"야, 너 남자 소개 한번 받아볼래?\"");
		next = sc.nextLine();
		System.out.println("그렇게 모솔인생 '24년만의 첫 소개팅'이 다가오는데....");
		next = sc.nextLine();

		///////////////////////////////////////////
		bct.play(2); // 소개팅브금 on
		System.out.println("===================다음 날===================");
		System.out.println();
		System.out.println("드디어 오늘... 결전의 날이 왔다!!");
		sc.nextLine();

		System.out.println("떨린다... 어떻게 입고 나갈까?");
		sc.nextLine();

		while (true) {
			System.out.println("1. 편안하게");
			System.out.println("2. 개성있게");
			System.out.println("3. 깔끔하게");
			System.out.println("4. 파인거^__^");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"역시 편안한게 좋겠지?\"" + ConsoleColor.RESET);
			} else if (answer == 2) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"내가 패션 선구자\"" + ConsoleColor.RESET);
			} else if (answer == 3) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"깔끔하게 입고 가야겠다.\"" + ConsoleColor.RESET);
			} else if (answer == 4) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"다 꼬셔버리겠어 ♥\"" + ConsoleColor.RESET);
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();

		//////////////////////////////////
		System.out.println();

		System.out.println("벌써 시간이?! 늦었다!! 소개팅남에게 어떻게 연락을 해야 할까?");
		// 달리는 발걸음 소리 삽임
		bct.play(0);
		sc.nextLine();
		sc.nextLine();
		bct.stop();

		bct.play(2);
		while (true) {
			System.out.println("1. 간단히 늦는다고 연락한다.");
			System.out.println("2. 늦는 이유를 자세히 설명한다.");
			System.out.println("3. 거짓말로 둘러댄다.");
			System.out.println("4. 특별한 연락은 하지 않는다.");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"죄송해요...조금 늦을 거 같아요...ㅠㅠ\"" + ConsoleColor.RESET);
			} else if (answer == 2) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"지하철 지연으로 10분 정도? 늦을 거 같아요...\"" + ConsoleColor.RESET);
			} else if (answer == 3) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"갑자기 급한 일이 생겨서 늦을 거 같아요!\"" + ConsoleColor.RESET);
			} else if (answer == 4) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"연락할 시간에 빨리 가자...\"" + ConsoleColor.RESET);
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();

		////////////////////////////////////////////////////////////////////////////////// 카페로고
		////////////////////////////////////////////////////////////////////////////////// 아스키아트
		BufferedReader reader0 = null;
		try {
			reader0 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\스타벅스로고.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String str0;
		try {
			while ((str0 = reader0.readLine()) != null) {
				System.out.println(str0);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		///////////////////////////////////////////////////////

		System.out.println();
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"헉...헉...죄송해요...! 제가 많이 늦었죠..?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("지각을 만회하고자 소개팅남에게 음료를 사려고 한다.");
		sc.nextLine();
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"지각했으니까 제가 음료살게요!\"" + ConsoleColor.RESET);
		sc.nextLine();

		while (true) {
			System.out.println("1. 아이스아메리카노 ");
			System.out.println("2. 녹차라떼");
			System.out.println("3. 딸기요거트");
			System.out.println("4. 메뉴를 물어보자!");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
				System.out.println();
				System.out.println("아이스 아메리카노를 주문했다.");
			} else if (answer == 2) {
				System.out.println();
				System.out.println("녹차라떼를 주문했다.");
			} else if (answer == 3) {
				System.out.println();
				System.out.println("딸기요거트를 주문했다.");
			} else if (answer == 4) {
				System.out.println();
				System.out.println("상대방이 원하는 메뉴로 주문했다.");
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();

		///////////////////////////////////////////////////////////////

		System.out.println();
		System.out.println("차가운 음료의 시원함이 땀을 식혀줄 즈음");
		sc.nextLine();
		System.out.println("본격적인 소개팅의 서막을 알리듯, 소개팅남이 말을 꺼냈다.");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"취미가 어떻게 되세요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("나는 당황하지 않고,");
		sc.nextLine();

		while (true) {
			System.out.println("1. 코딩공부 좋아해요!");
			System.out.println("2. 방탈출 좋아해요!");
			System.out.println("3. 뮤지컬 감상 좋아해요!");
			System.out.println("4. 게임 좋아해요!");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
				System.out.println();
				System.out.println(
						ConsoleColor.PURPLE_BOLD + "\"(안경을 치켜올리며)저 코딩 좋아하는데, 혹시'객체지향'아시나요?ㅎㅎ\"" + ConsoleColor.RESET);
			} else if (answer == 2) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"저 방탈출 카페 완전 사랑해요!\"" + ConsoleColor.RESET);
			} else if (answer == 3) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"뮤지컬 감상하는거 좋아해요!\"" + ConsoleColor.RESET);
			} else if (answer == 4) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"저 롤 좋아하는데, 혹시 티어가 어떻게 되세요?ㅎㅎ\"" + ConsoleColor.RESET);
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();
		///////////////////////////////////////////////////////////////////

		System.out.println();
		System.out.println("재치있게 답변하고 안도하는 것도 잠시,");
		sc.nextLine();
		System.out.println("이어지는 소개팅남의 질문공세!");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"혹시 좋아하시는 스타일 같은 거 있으신가요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"저는.....\"" + ConsoleColor.RESET);
		sc.nextLine();

		while (true) {
			System.out.println("1. 마초남 같은 스타일이 좋아요!");
			System.out.println("2. 당신같은 스타일이 좋아요!");
			System.out.println("3. 스타1 이요? 전 스타2가 더 좋은데! 깔깔깔!");
			System.out.println("4. 젠틀한 스타일이 좋아요!");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
			} else if (answer == 2) {
			} else if (answer == 3) {
			} else if (answer == 4) {
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();

		System.out.println();

		bct.stop(); // 소개팅 브금 잠시 끄기
		//////////////////////////////////////////////////////

		System.out.println("소개팅남의 질문이 끝나고, 어색한 정적만이 감도는 중,");
		sc.nextLine();
		System.out.println("소개팅남은 카페에서 흘러나오는 노래를 듣고선,");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"어? 제가 좋아하는 노래인데! 혹시 아세요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"저 노래는...?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("====집중해서 노래를 맞추고 소개팅남의 호감을 얻어보자!====");
		sc.nextLine();

		////////////////////////////////////////////////////////////////////////////////// 뮤직게임
		////////////////////////////////////////////////////////////////////////////////// 로고
		////////////////////////////////////////////////////////////////////////////////// 아스키아트
		BufferedReader reader1 = null;
		try {
			reader1 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\뮤직로고.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String str1;
		try {
			while ((str1 = reader1.readLine()) != null) {
				System.out.println(str1);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		bct.stop();

		// 노래맞추기
		System.out.println();
		System.out.println("1번 문제__ 노래 제목맞추기 게임");
		MusicController contr = new MusicController();
		System.out.println();
		System.out.println("무슨 노래일까??");
		System.out.println();
		System.out.println("제목이 영어면 영어로 입력해주세용.>-<");
		System.out.print("정답! >> ");
		contr.play();

		answer1 = sc.nextLine().toLowerCase().replaceAll(" ", "");

		if (contr.play().equals(answer1)) {
			contr.stop();
			System.out.println();
			System.out.println("맞췄어!");
			// 전체5점
			sel.truefalse();

		} else {
			System.out.println();
			System.out.println("실망이야...");
			contr.stop();
		}

		sc.nextLine();
		System.out.println();

///////////////////////////////////////////////////////////////////////////
		bct.play(2); // 다시 브금 재생

		System.out.println("한창 소개팅 도중, 갑작스레, 어떤 여자가 소개팅남에게 인사를 했다!");
		sc.nextLine();
		System.out.println("\"여기서 만나네 오랜만이야 잘 지냈어?\"");
		sc.nextLine();
		System.out.println("\"아 일행 분이 계셨구나~ 안녕하세요~ ^^\"");
		sc.nextLine();
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"뭐지...이 여자는...?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("나는 어떻게 행동해야 할까?");
		sc.nextLine();

		while (true) {
			System.out.println("1. 웃으며 같이 인사한다.");
			System.out.println("2. 째려본다.");
			System.out.println("3. 누군지 바로 물어본다.");
			System.out.println("4. 잠깐 자리를 비워준다.");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"아...네ㅎ 안녕하세요ㅎ\"" + ConsoleColor.RESET);
			} else if (answer == 2) {
				System.out.println();
				System.out.println("이글거리는 눈빛으로 레이저를 발사한다.");
			} else if (answer == 3) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"아..혹시...누구?\"" + ConsoleColor.RESET);
			} else if (answer == 4) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"저 잠시 화장실좀...\"" + ConsoleColor.RESET);
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();

///////////////////////////////////////////////////////////////////////////

		System.out.println();
		System.out.println("의문의 여자가 떠나고 소개팅남이 말하기를,");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"아...전 여자친구예요...\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("나는 어떻게 반응해야 할까?");
		sc.nextLine();

		while (true) {
			System.out.println("1. 전 여자친구에 대해 자세히 물어본다.");
			System.out.println("2. 대수롭지않게 넘긴다.");
			System.out.println("3. 스타카토 웃음소리를 낸다. 하.하.하");
			System.out.println("4. 질투한다.");
			System.out.println();
			System.out.print("선택 >> ");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"얼마나 오랫동안 사귀셨어요?\"" + ConsoleColor.RESET);
			} else if (answer == 2) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"아 전 여자친구분이셨구나~ ^^\"" + ConsoleColor.RESET);
			} else if (answer == 3) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"아.하.하.하.하...\"" + ConsoleColor.RESET);
			} else if (answer == 4) {
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"전 여자친구를 보시던 눈빛이 엄청 애틋하던데요? ㅎ\"" + ConsoleColor.RESET);
			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();

		System.out.println();

		/////////////////////////////////////////////////////////////////////
		System.out.println("표정관리가 안된 탓일까, 소개팅남은 내 눈치를 보며");
		sc.nextLine();
		System.out.println("안절부절하다가 분위기를 환기시키려는 듯,");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"어젯밤에 넷플릭스에서 영화봤었거든요!\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"제가 명장면 성대모사해볼테니 맞춰보실래요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		bct.stop(); // 브금 잠시 중지
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"명장면 성대모사? 기대되는데?\"" + ConsoleColor.RESET);
		sc.nextLine();
		// 영화맞추기 게임
		System.out.println("=======영화제목 맞추기게임========");

		MP3Player m = new MP3Player();
		MovieGame_Controller movie = new MovieGame_Controller();

		// 영화제목 맞추기 게임 시작
		int[] bal = movie.play();

		System.out.println("2번문제__ 영화제목 맞추기 게임");
		sc.nextLine();
		///////////////////////////////////////////////////////////////////////////////////////////////영화 아스키아트
		BufferedReader reader7 = null;
		try {
			reader7 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\영화.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String str7;
		try {
			while ((str7 = reader7.readLine()) != null) {
				// System.out.println(str3);
				System.err.println(ConsoleColor.BLACK + str7 + ConsoleColor.RESET);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("총 3문제가 출제됩니다.");
		sc.nextLine();
		System.out.println("영화 명장면의 대사입니다.");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println("영화의 제목을 맞추세요?");
			m.play(movie.moviegame.get(bal[i]).getPath());
			System.out.println();
			System.out.print("정답! >> ");

			answer1 = sc.nextLine().replaceAll(" ", "");
			if (movie.moviegame.get(bal[i]).getTitle().equals(answer1)) {
				movie.stop();
				System.out.println("맞췄습니다. 상대방의 호감도가 상승했습니다!");
				// 맞추면 전체 +5
				sel.truefalse();
			} else {
				movie.stop();
				System.out.println("틀렸습니다! 상대방의 호감도가 감소했습니다!.");
			}
		}

		sc.nextLine();
		System.out.println();

////////////////////////////////////////////////////////////////////////////////////////	      

		System.out.println("다시금 찾아온 훈훈한 분위기에, 소개팅이 순조롭게 흘러가고있다.");
		sc.nextLine();
		bct.play(2); // 브금 다시 키기
		System.out.println("소개팅남이 웃으면서");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"저희 게임 하나 더 할까요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("하며 밸런스 게임을 제안한다.!!");
		sc.nextLine();

		// 밸런스 게임
		System.out.println("3문제__밸런스게임(19금)");
		
		//////////////////////////////////////////////////////////////////////////////////////////////////// 밸런스게임 아스키아트
		
		BufferedReader reader9 = null;
		try {
			reader9 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\밸런스게임.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String str9;
		try {
			while ((str9 = reader9.readLine()) != null) {
				// System.out.println(str3);
				System.err.println(ConsoleColor.BLACK + str9 + ConsoleColor.RESET);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		BalanceGame_Controller balance = new BalanceGame_Controller();
		System.out.println();
		System.out.println("밸런스 게임을 시작합니다!");
		System.out.println();
		System.out.println("총 3문제입니다!");
		System.out.println();
		System.out.println("무조건 둘 중에 하나를 골라야합니다!");
		System.out.println();
		System.out.println("선택한 답안에 따라 점수가 당신의 이상형에 점수가 올라갑니다!");
		System.out.println();

		// 게임 진행
		String[] bal1 = balance.play();

		for (int i = 0; i < 3; i++) {

			System.out.println(i + 1 + "번 문제");
			System.out.print(bal1[i] + ">> ");

			answer = sc.nextInt();

			while(true) {
				if(answer ==1) {
					break;
				}else if(answer == 2){
					
					break;
				} else {
					System.out.println("다시 입력해주세요");
					answer = sc.nextInt();
				}
			}
			
			// 1,2번 선택에 따른 score증가
			sel.select2(answer);
			System.out.println();
		}

		sc.nextLine();
		System.out.println();

/////////////////////////////////////////////////////////////////////////////

		System.out.println("한창 고민도하고 웃기도하며 대화를 하다보니");
		sc.nextLine();
		System.out.println("어느 새, 시간이 훌쩍 지난 뒤였다.");
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"저희 시간가는 줄도 모르고 이야기했었네요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"특별히 좋아하시는 음식이 뭐예요?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("내 최애 음식은...");
		sc.nextLine();

		while (true) {
			System.out.println("1. 초밥");
			System.out.println("2. 삼계탕");
			System.out.println("3. 만두");
			System.out.println("4. 특 A++ 한우 오마카세");

			answer = sc.nextInt();
			sel.select4(answer);

			if (answer == 1) {

				BufferedReader reader2 = null;
				try {
					reader2 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\초밥.txt"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}

				String str2;
				try {
					while ((str2 = reader2.readLine()) != null) {
						// System.out.println(str3);
						System.err.println(ConsoleColor.BLACK + str2 + ConsoleColor.RESET);

					}
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"초밥 완전 사랑해요!\"" + ConsoleColor.RESET);

			} else if (answer == 2) {

				////////////////////////////////////////////////////////////////// 닭 아스키아트 출력문
				BufferedReader reader3 = null;
				try {
					reader3 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\닭닭.txt"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}

				String str3;
				try {
					while ((str3 = reader3.readLine()) != null) {
						// System.out.println(str3);
						System.out.println(ConsoleColor.BLACK + str3 + ConsoleColor.RESET);

					}
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"역시 삼계탕으로 보신하는게 최고죠!\"" + ConsoleColor.RESET);

			} else if (answer == 3) {

				////////////////////////////////////////////////////////////////// 만두 아스키아트 출력문
				BufferedReader reader4 = null;
				try {
					reader4 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\만두.txt"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}

				String str4;
				try {
					while ((str4 = reader4.readLine()) != null) {
						// System.out.println(str3);
						System.err.println(ConsoleColor.BLACK + str4 + ConsoleColor.RESET);

					}
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"만두 맛있는 곳 알아요!\"" + ConsoleColor.RESET);

			} else if (answer == 4) {

				////////////////////////////////////////////////////////////////// 오마카세간판 아스키아트

				BufferedReader reader5 = null;
				try {
					reader5 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\오마카세.txt"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}

				String str5;
				try {
					while ((str5 = reader5.readLine()) != null) {
						// System.out.println(str3);
						System.err.println(ConsoleColor.BLACK + str5 + ConsoleColor.RESET);

					}
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println();
				System.out.println(ConsoleColor.PURPLE_BOLD + "\"고오급 한우 오마카세 애정해요!\"" + ConsoleColor.RESET);

			} else {
				System.out.println();
				System.out.println("**다시 선택해주세요!**");
				System.out.println();
				continue;
			}
			break;
		}

		sc.nextLine();
		sc.nextLine();

///////////////////////////////////////////////////////////////

		System.out.println();
		System.out.println(ConsoleColor.BLUE_BOLD + "\"그럼 좋아하시는 거 먹으러 나갈까요? 슬슬?\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println(ConsoleColor.PURPLE_BOLD + "\"네네 좋아요! ㅎㅎ\"" + ConsoleColor.RESET);
		sc.nextLine();
		System.out.println("그렇게 내가 좋아하는 음식으로 저녁을 먹은 뒤,");
		sc.nextLine();
		System.out.println("근처 공원에서 함께 산책하고, 각자의 집으로 돌아갔다.");
		sc.nextLine();
		System.out.println("종일 긴장한 탓에 기진맥진한 몸을 침대에 던졌다.");
		sc.nextLine();
		System.out.println("걱정 반, 기대 반으로 소개팅남의 연락을 기다렸다.");
		sc.nextLine();
		System.out.println("한참을 기다리며 졸고 있는데 카톡이 울리는 소리에"); // [카톡음 삽입]
		sc.nextLine();

		bct.play(5);

		System.out.println("화들짝 놀라며 휴대폰을 보았더니!!!!!!");
		sc.nextLine();

		bct.stop();

		BufferedReader reader6 = null;
		try {
			reader6 = new BufferedReader(new FileReader("C:\\Users\\smhrd\\Desktop\\iamge\\카톡.txt"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		String str6;
		try {
			while ((str6 = reader6.readLine()) != null) {
				System.out.println(str6);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		if (sel.score1 > 65 || sel.score2 > 65 || sel.score3 > 65 || sel.score4 > 65) {
			System.out.println();
			System.out.println(ConsoleColor.BLUE_BOLD + "\"집에는 잘 들어가셨나요? ^^\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.PURPLE_BOLD + "\"네! 잘 들어갔어요!\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.BLUE_BOLD + "\"괜찮으시면 다음 데이트 신청해도 될까요?\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.PURPLE_BOLD + "\"헉..!! 너무 감사해요...ㅠㅠ\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.BLUE_BOLD + "\"그럼 저희 조금 더 알아가볼까요?\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.PURPLE_BOLD + "\"그럴까요....♥ \"" + ConsoleColor.RESET);
			sc.nextLine();

			System.out.println("미션 성공~");

			// 성공 브금 삽입

			bct.play(1);
			Login_Controller dao = new Login_Controller();
			 sel.maxScore(sel.score1, sel.score2, sel.score3, sel.score4);
			 dao.finalScore(playId, sel.score1, sel.score2, sel.score3, sel.score4, sel.maxScore(sel.score1, sel.score2, sel.score3, sel.score4));
			
			 
			System.out.println("60점 이상의 점수를 획득하셨습니다^^~~♥♥♥");
			System.out.println("당신은 "+ sel.maxColumn()+"님과 " + sel.maxScore(sel.score1, sel.score2, sel.score3, sel.score4) +"점으로 가장 높은 점수를 획득하셨습니다!");
			
		}

		else {
			System.out.println();
			System.out.println(ConsoleColor.BLUE_BOLD + "\"더 좋은 분 만나시길 바랍니다...\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.PURPLE_BOLD + "\"왜지...? 왜... 분위기는 좋았잖아...\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println(ConsoleColor.PURPLE_BOLD + "\"내가 뭐 실수했나...?\"" + ConsoleColor.RESET);
			sc.nextLine();
			System.out.println("이변은 없었고, 결국 덩그러니 모솔로 남은 당신 뿐이었다...");
			sc.nextLine();
			System.out.println("당신은 휴대폰을 던지고 망연자실하며 이불을 뒤집어쓰고 엉엉 울었다...ㅠㅠ");
			sc.nextLine();
			System.out.println("그 후....저 톡을 마지막으로 소개팅남에게 연락오는 일은 없었다고 한다...");
			sc.nextLine();

			System.out.println("미션 실패 ㅠㅡㅠ호에엥 ㅠㅠ");
			// 실패 브금 삽임
			bct.play(4);
			System.out.println("60 점수 이상의 점수를 획득하지 못했습니다 ㅠㅠ");
			Login_Controller dao = new Login_Controller();
			//접수를 USERSCORE에 집어넣기
			dao.finalScore(playId, sel.score1, sel.score2, sel.score3, sel.score4, sel.maxScore(sel.score1, sel.score2, sel.score3, sel.score4));
			// 가장 잘 맞는 사람과의 출력문 
			dao.maxScoreBoard(playId);
			
		}

		//////////////////////////////////////////////////////////////////////////////////////////////
		bct.play(8); // 마무리 브금
		
		System.out.println("랭킹에 등록하시겠습니까?! [1] 등록할게욤  [2] 안해욤");
		answer = sc.nextInt();

		if (answer == 1) {
			Login_Controller dao = new Login_Controller();

				System.out.println("랭킹 등록에 성공하였습니당");
				dao.scoreBoard();
			

		} else if (answer == 2) {
			Login_Controller dao = new Login_Controller();
			dao.scoreBoard();
		}

		
		
		
	}
}
