package BalanceGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BalanceGame_Controller {
	ArrayList<String> balance = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	String[] bal = new String[10];
	
	
	// 생성자
	public BalanceGame_Controller() {
		// 1번 게임
				balance.add("1.낮져밤이 vs 2.낮이밤져");
				// 2번 게임
				balance.add("1.이성친구 가능 vs 2.이성친구 불가능");
				// 3번 게임
				balance.add("1.애인 집에 내 절친 팬티 vs 2 절친 집에 내 애인 팬티");
				// 4번 게임
				balance.add("1.양치 안하고 키스하기 vs 2.안씻고 사랑을 찐하게 나누기");
				// 5번 게임
				balance.add("애인이 애인 허용 범위 내의 스킨십은? 1.팔짱 vs 2.포웅");
				// 6번 게임
				balance.add("1.불을 키우고 사랑을 나누기 vs 2.불을 끄고 사랑을 나누기");
				// 7번 게임
				balance.add("1.결혼하면 자녀는 3명을 기르자 vs 2.자식없이 평생 배우자랑만 살기");
				// 8번 게임
				balance.add("1.애인이 털복숭이 vs 2.애인이 대머리");
				// 9번 게임
				balance.add("1. 한 달동안 포웅금지 vs 2.한 달동안 뽀뽀금지");
				// 10번 게임
				balance.add("1.얼굴만 잘생긴 애인  vs 2.몸매만 좋은 애인 ");
	}
	
	//게임재생
	public String[] play() {
		for(int i =0; i<balance.size(); i++) {
			bal[i] = balance.get(ran.nextInt(10)); 
			for(int j=0; j<i; j++) {	
				if(bal[i]==bal[j]) {
					i--;
				}
			}
		}
		return bal;
	}


}
