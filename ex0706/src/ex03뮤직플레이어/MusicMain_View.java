package ex03뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain_View {
	// view : 음악 재생시각화
	public static void main(String[] args) {


	

		Scanner sc = new Scanner(System.in);
		Music_Controller con = new Music_Controller();
		while (true) {
			System.out.print("[1] 노래재생 [2] 다음곡 [3] 이전곡 [4] 정지 [5] 종료 >>");
			int num = sc.nextInt();

			if (num == 1) {	//노래재생
				Music_Model m =con.play();
				System.out.println("♬♬♬재생중인 노래♬♬♬");
				System.out.println("노래제목 \t\t 가수");
				System.out.print((m.getTitle()+"\t"));
				System.out.println(m.getSinger());
				System.out.println();
			}
			if (num == 2) {	// 다음노래 재생
				 // 다음곡
				Music_Model m = con.next();
				if(m != null) {
	            // 다음곡이 있었을 경우에만 index 1증가시키고 노래를 재생
	            
	               // (2) musicList 두번째 방에 있는 노래 정보 출력
	               System.out.println("====재생중인 노래====");
	               System.out.println("노래 제목 \t 가수");
	               System.out.print(m.getTitle() + " \t ");
	               System.out.println(m.getSinger());
	            }else {
	               System.out.println("다음곡이 없습니다.");
	            
	            }

				
			}
			if (num == 3) {	//이전노래 재생
				 // 이전곡
				Music_Model m = con.pre();
				if(m != null) {
	            
	               System.out.println("====재생중인 노래====");
	               System.out.println("노래 제목 \t 가수");
	               System.out.print(m.getTitle() + " \t ");
	               System.out.println(m.getSinger());
	               
	            }else {
	               System.out.println("이전곡이 없습니다.");
	           
	            }

			}
			if (num == 4) {
				con.stop();
				System.out.println("노래가 멈췄습니다!!");
			}
			

			if (num == 5) {
				con.stop();
				System.out.println("노래가 종료되었습니다");
				break;

			}
		}
	}

}
