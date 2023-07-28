package BalanceGame;

import java.util.Scanner;

public class BalanceGame_Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		BalanceGame_Controller m = new BalanceGame_Controller();
		
		System.out.println("벨런스 게임을 시작합니다!");
		System.out.println("총 3문제입니다!");
		System.out.println("무조건 둘 중에 하나를 골라야합니다!");
		System.out.println("선택한 답안에 따라 점수가 당신의 이상형에 점수가 올라갑니다!");
		System.out.println();
		
		//게임 진행
		String[] bal = m.play();
		
		for(int i = 0; i<3; i++) {
		
			System.out.println(i+1+"번 문제");
			System.out.print(bal[i] + ">> ");
			
	
			int num = sc.nextInt();
			System.out.println("상대방의 호감도가 상승하였습니다!");
			System.out.println();
		}
		
	}

}
