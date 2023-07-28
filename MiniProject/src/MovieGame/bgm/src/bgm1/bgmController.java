package MovieGame.bgm.src.bgm1;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class bgmController {

	MP3Player mp = new MP3Player();
	
	String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\MiniProject22\\src\\MovieGame\\bgm\\src\\브금\\";
	
	ArrayList<bgmField> bgmList = new ArrayList<bgmField>();
	
	public bgmController() {
		bgmList.add(new bgmField(comPath+"발소리.mp3"));   
		bgmList.add(new bgmField(comPath+"미션성공.mp3"));
		bgmList.add(new bgmField(comPath+"소개팅브금.mp3"));
		bgmList.add(new bgmField(comPath+"시작.mp3"));
		bgmList.add(new bgmField(comPath+"미션실패.mp3"));
		bgmList.add(new bgmField(comPath+"카톡알림.mp3"));
		bgmList.add(new bgmField(comPath + "선택.mp3"));
		bgmList.add(new bgmField(comPath + "도입부.mp3"));
		bgmList.add(new bgmField(comPath + "마무리.mp3"));
		
	}
	
	public bgmField play(int num) {
		if(mp.isPlaying()) {
			mp.stop();
		}
		mp.play(bgmList.get(num).getComPath());
		return bgmList.get(num);
	}
	
	public void stop() {
		if(mp.isPlaying()) {
			mp.stop();
		}
	}
	
	
	public bgmField button() {
		
		mp.play(bgmList.get(6).getComPath());
		return bgmList.get(6);
	}
	
	
}
