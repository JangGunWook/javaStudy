package ex03뮤직플레이어;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		// 노래들의 공통경로
		String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\ex0706\\src\\player\\";

		// jar 확장자 추가하는 방법
		// 프로젝트 선택 --> 마우스 우클릭 --> build path
		// --> configure build path --> 탭중에 libraries
		// --> class path 옵션 선택 --> add jars

		// 1. MP3player 사용해보기!!!
		// --> 다른사람이 만든 자료형(클래스)
		MP3Player mp3 = new MP3Player();

		// 2. Music 자료형을 저장할 수 있는 가변배열 musicList생성
		ArrayList<Music_Model> musicList = new ArrayList<Music_Model>();

		// 3.musicList 5개 데이터 추가하기
		musicList.add(new Music_Model("Attention", "뉴진스", comPath + "Attention.mp3"));
		musicList.add(new Music_Model("Butterfly", "전영호", comPath + "Butterfly.mp3"));
		musicList.add(new Music_Model("LoveDive", "아이브", comPath + "Lovedive.mp3"));
		musicList.add(new Music_Model("Nxde", "아이들", comPath + "Nxde.mp3"));
		musicList.add(new Music_Model("Rushhour", "크러쉬", comPath + "Rushhour.mp3"));

		System.out.println(musicList.size());

		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.print("[1] 노래재생 [2] 다음곡 [3] 이전곡 [4] 정지 [5] 종료 >>");
			int num = sc.nextInt();

			if (num == 1) {	//노래재생
				if(mp3.isPlaying()) {	//겹치지 않게 노래 스탑
					mp3.stop();
				}
				System.out.println("♬♬♬재생중인 노래♬♬♬");
				mp3.play(musicList.get(i).getPath());	//0번 인덱스 노래 재생
				System.out.println("노래제목 \t\t 가수");
				System.out.print((musicList.get(i).getTitle()+"\t"));
				System.out.println(musicList.get(i).getSinger());
				System.out.println();
			}
			if (num == 2) {	// 다음노래 재생
				if(mp3.isPlaying()) {		//겹치지 않게 노래 스탑
					mp3.stop();
				}
				i++;	// 다음 노래 인덱스로 증가
				if (i > musicList.size()-1) {	//인덱스 번호가 4번을 초과하면 
					System.out.println("다음 노래는 없습니다.");
					System.out.println("현재노래를 재생합니다");
					i--;		// 이전노래로 돌아간다!
					System.out.println("♬♬♬재생중인 노래♬♬♬");
					mp3.play(musicList.get(i).getPath());	//이전 노래 재생
					System.out.println("노래제목 \t\t 가수");
					System.out.print((musicList.get(i).getTitle()+"\t"));
					System.out.println(musicList.get(i).getSinger());
					System.out.println();
				}else {
					System.out.println("♬♬♬재생중인 노래♬♬♬");
					mp3.play(musicList.get(i).getPath());	// 노랙 출력
					System.out.println("노래제목 \t\t 가수");
					System.out.print((musicList.get(i).getTitle()+"\t"));
					System.out.println(musicList.get(i).getSinger());
					System.out.println();
				}
				
			}
			if (num == 3) {	//이전노래 재생
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				i--;
				if (i < 0) {	//0번 인덱스보다 이전으로 가면 
					System.out.println("이전 노래는 없습니다.");
					System.out.println("현재노래를 재생합니다");
					i++;		// 다시 0번인덱스로 복귀 시킨다
					System.out.println("♬♬♬재생중인 노래♬♬♬");
					mp3.play(musicList.get(i).getPath());
					System.out.println("노래제목 \t\t 가수");
					System.out.print((musicList.get(i).getTitle()+"\t"));
					System.out.println(musicList.get(i).getSinger());
					System.out.println();
				}else {
					System.out.println("♬♬♬재생중인 노래♬♬♬");
					mp3.play(musicList.get(i).getPath());
					System.out.println("노래제목 \t\t 가수");
					System.out.print((musicList.get(i).getTitle()+"\t"));
					System.out.println(musicList.get(i).getSinger());
					System.out.println();
				}
			}
			if (num == 4) {
				mp3.stop();
				System.out.println("노래가 멈췄습니다!!");
			}
			

			if (num == 5) {
				System.out.println("노래가 종료되었습니다");
				if(mp3.isPlaying()) {
					mp3.stop();
				}
				break;

			}
		}
	}

//		// String path : 마우스 오른쪽버튼 누른 후 properties를 통해 주소값 복사
//		mp3.play(comPath + "Attention.mp3");
//		// console 창의 빨간색 네모 누르면 끊긴다
//		
//		//노래 멈추는 기능
//		mp3.stop();
//		
//		mp3.play(comPath + "Attention.mp3");
//		
//		// 노래 재생중인지 여부를 판단
//		if(mp3.isPlaying()) {
//			mp3.stop();
//		}
//		
//		mp3.play(comPath + "Butterfly.mp3");

}
