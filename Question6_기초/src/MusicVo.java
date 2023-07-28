
public class MusicVo {
	
	//1. 필드
	
	String title;
	String singer;
	int playTime;
	
	
	//2. 메소드
	
	// 생성자
	public MusicVo(String title, String singer, int playTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	public String toString() {
		return "노래 제목 : " + title + "\n 가수이름 : " + singer + "\n 노래길이 : " + playTime;
	}
	


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public int getPlayTime() {
		return playTime;
	}


	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	

}
