package MusicGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicController {
	
	
	Scanner sc = new Scanner(System.in);
	MusicGame_Model mus = new MusicGame_Model(null, null);
	Random rd = new Random();
	String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\MiniProject22\\src\\player\\";
	MP3Player mp3 = new MP3Player();
	// 노래번호 랜덤으로 나오게하기
	int index = rd.nextInt(5);
	// 음악리스트
	ArrayList<MusicGame_Model> musicList = new ArrayList<MusicGame_Model>();
	
	// 기본 메소드 생성
	public MusicController() {
		musicList.add(new MusicGame_Model("gee", comPath + "Gee.mp3"));
		musicList.add(new MusicGame_Model("tellme", comPath + "Tellme.mp3"));
		musicList.add(new MusicGame_Model("가시",  comPath + "가시.mp3"));
		musicList.add(new MusicGame_Model("거리에서",  comPath + "거리에서.mp3"));
		musicList.add(new MusicGame_Model("벌써일년",  comPath + "벌써일년.mp3"));
		
	}
	
	// 노래재생
	public String play() {
		mp3.play(musicList.get(index).getPath());
		return musicList.get(index).getTitle();
	}
	// 노래정지
	public void stop() {
		 
			mp3.stop();
		
	}

	
	
	
}
