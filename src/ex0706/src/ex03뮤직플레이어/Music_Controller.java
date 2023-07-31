package ex03뮤직플레이어;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Music_Controller {

	// controller : 데이터의 흐름 제어
	// ( 음악 재생, 다음곡 넘기기, 이전곡 넘기기, 음악 정지)

	// 1. 필드
	private MP3Player mp3 = new MP3Player();
	private String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\ex0706\\src\\player\\";
	private ArrayList<Music_Model> musicList = new ArrayList<Music_Model>();
	private int i = 0; // 인덱스 번호

	// 2. 메소드
	// 객체를 생성한느 순간에 뮤직플레이리스트를 추가하기
	// --> 기본생성자
	public Music_Controller() {
		musicList.add(new Music_Model("Attention", "뉴진스", comPath + "Attention.mp3"));
		musicList.add(new Music_Model("Butterfly", "전영호", comPath + "Butterfly.mp3"));
		musicList.add(new Music_Model("LoveDive", "아이브", comPath + "Lovedive.mp3"));
		musicList.add(new Music_Model("Nxde", "아이들", comPath + "Nxde.mp3"));
		musicList.add(new Music_Model("Rushhour", "크러쉬", comPath + "Rushhour.mp3"));
	}

	// 재생하기
	public Music_Model play() {
		stop();
		mp3.play(musicList.get(i).getPath());
		return musicList.get(i);
	}
	// 정지하기
	public void stop() {
		if(mp3.isPlaying()) {
		mp3.stop();
		}
	}
	// 다음곡 재생하기
	public Music_Model next() {
		 if (i < musicList.size() - 1) {
             i++;
             return play();
	}else {
		stop();
		 return null;
	}
	}
	
	// 이전곡 재생하기
	public Music_Model pre() {
		if(i > 0) {
            i--;
          return play();
          
	}else {
		stop();
		return null;
	}

}
}
