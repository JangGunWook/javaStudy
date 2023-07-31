package MovieGame.bgm.src.bgm1;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class bgm {
	public static void main(String[] args) {
		
		
		// 0 발소리
		// 1 미션성공
		// 2 소개팅브금
		// 3 시작
		// 4 미션실패
		// 5 카톡알림
		// 6 선택
		// 7 도입부
		// 8 마무리
		Scanner sc = new Scanner(System.in);
		
		bgmController bct = new bgmController();
		bct.play(7);
		
		sc.nextLine();
		bct.stop();
		
		
		
		
		

	}
}
