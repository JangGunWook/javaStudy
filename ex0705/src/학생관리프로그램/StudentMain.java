package 학생관리프로그램;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		
		
		
		//Student 클래스 설계도면을 기반으로 stul이라는 갤체 생성
		Student stul = new Student("김은비","1234", 20);
		
		//student 설계도면 기반으로 stu2 객체 생성
		Student stul2 = new Student();
		// 이름 -> 김운비, 학번-> 0000, 나이-> 20....
		// new 클래스명() : 생성자(constructor) 호출
		// 1) 생성자도 메소드 (객체를 생성하는 순간에 자동으로 호출되는메소드) 이다.
		// 2) 매캐변수로 아무런 값도 받지 않는 생성자 --> 기본 생성자
		//	  기본 생성자는 설계도면에서 생략가능하다.
		// 3) 생성자는 리턴타입을 지정조차 하지 않는다--> void 클래스명
		// 4) 생성자으 ㅣ이름은 반드시 클래스명과 동일해야한다.(대소문자까지)
		// 5) 새로운 생성자를 만든다면, 기본 생성자는 덮어씌워진다.
		//    ---> 생성자를 오버로딩으로 기본 생성자를 새로 만들수 있다!
		
		// stul이 가지고 있는 이름을 손지영으로 변경해주세요!
		stul.setName("손지영");
		
		// stul이 가지고 있는 이름을 출력해주세요.
		System.out.println(stul.getName());
		
		stul.setNumber("20220878");
		
		stul.setAge(20);
		
		stul.setScoreJava(50);
		
		stul.setScoreWeb(99);
		
		stul.setScorAndroid(70);
		
		
		
		

	}

}
