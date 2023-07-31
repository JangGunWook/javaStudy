package 학생관리프로그램;

public class Student {
	
	
	
	//학생 정보를 저장할 수 있는 자료형
	
	//이름
	private String name;
	//학번
	private String number;
	//나이
	private int age;
	//java점수
	private int scoreJava;
	//web점수
	private int	scoreWeb;
	//android점수
	private int scorAndroid;
	
	//인자가 없는 생성자
		public Student() {
			// TODO Auto-generated constructor stub
		}
	
	//인자가 있는 생성자
	public Student(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	//인자가 있는 생성자
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scorAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scorAndroid = scorAndroid;
	}
	// 2.메소드
	// getter메소드 --> private 키워드로 함부로 접근할 수 없게끔 막아져있는 필드값
	//				  가져갈 수 있게끔 만들어주는 메소드
	public String getName() {
		return name;
	}
	// setter메소드 --> private 키워드로 함부로 접근할 수 없게끔 막아져있는 필드값
	//				  설정(수정)할 수 있게끔 만들어주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScorAndroid() {
		return scorAndroid;
	}
	public void setScorAndroid(int scorAndroid) {
		this.scorAndroid = scorAndroid;
	}
	
	

}
