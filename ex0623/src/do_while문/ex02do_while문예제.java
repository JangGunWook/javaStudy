package do_while문;

import java.util.Scanner;

public class ex02do_while문예제 {

	public static void main(String[] args) {
		// 1. 현재 몸무게와 목표 몸무게를 입력 받으세요.
		// 2. 주차별 감량 몸무게를 입력 받으세요.
		// 3. 현재 몸무게가 목표몸무게에 달성하면 축하한다는
		//    문구를 출력하고 종료시켜주세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int present  = sc.nextInt();
				
		System.out.print("목표 몸무게 : ");
		int goal  = sc.nextInt();
		
		int i = 1;
		do {
			System.out.print( i + "주차 감량 몸무게 : " );
			int lose = sc.nextInt();
			present -= lose;
			i++;
		}while(goal < present);
		
		System.out.println(present +"kg 달성!! 축하합니다!!");
		
		
	}

}
