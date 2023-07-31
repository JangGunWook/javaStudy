package festival30문제;

import java.util.Scanner;

public class ex01번 {

	public static void main(String[] args) {
		// 1번 
		// 제한시간 8분
		//현재 몸무게와 목표몸무게를 각각 입력 받고
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int present = sc.nextInt();		// 현재 몸무게
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();		// 목표 몸무게
		
		int i=1;
		do {
			if(present>goal) {
			System.out.print(i+"주차 감량 몸무게 :");
			int min = sc.nextInt();
			i++;
			present -= min;
			}else {
				break;	//브레이크 없으면 에러 납니다!!!! 필수 사항
			}
			
		}while(true);
		
		System.out.println(present + "kg 달성!! 축하합니다!");
		
		
	}

}
