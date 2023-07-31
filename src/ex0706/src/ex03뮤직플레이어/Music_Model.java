package ex03뮤직플레이어;

public class Music_Model {
	//model : music 모듈을 가지고 있음
	// 자료형
	// 1. 필드(속성, 데이터)
	 private String title; // 노래제목 
	 private String singer; // 가수 
	 private String path; // 노래저장경로 
	 
	 
	 
	 // 2. 메소드(로직, 행위)
	 
	 //생성자
	 public Music_Model(String title, String singer, String path) {
		 this.title = title;
		 this.singer = singer;
		 this.path = path;
	 }


	 //getter생성
	public String getTitle() {
		return title;
	}



	public String getSinger() {
		return singer;
	}



	public String getPath() {
		return path;
	}
	 
	 
	 
	 
	

}

