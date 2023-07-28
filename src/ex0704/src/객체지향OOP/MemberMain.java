package 객체지향OOP;

public class MemberMain {

	public static void main(String[] args) {
		// JVM(java virtual machine) : ctrl f11 실행
		// --> 제일번저 찾아서 실행하는 메소드 >>> main method
		// 모든 코드들은 main method 안쪽에 작성되어야 실행 가능하다
		
		// 1. Member 설계도면을 기반으로 m1 객체 생성
		// 자료형 객체명 = new 자료형
		// reference 키워드 --> new
		Member m1 = new Member();
		Member a = m1;
		
		System.out.println(m1.alarm);
		// 레퍼런스 변수(객체)의 String 기본 값은 null이다.
		System.out.println(m1.age);
		System.out.println(m1.email);
		System.out.println(m1.name);
		
		// . --->
		m1.sendMessage();
		
		// 이름 : 짝궁 이름 넣어 주기
		
		// 전화번호 : 010 1234 5678
		
		//나이 : 20
		
		// 이름, 전화번호, 나이 콘솔 출력하기
		
		
		m1.setName("유선웅");
		m1.setPhone("010 1234 5678");
		m1.setAge(20);
		
		System.out.println(m1.name);
		System.out.println(a.phone);
		System.out.println(m1.age);
		
		Member m2 = new Member();
		m2.setName("장건욱");
		m2.setPhone("010 3604 2172");
		m2.setAge(29);
		
		System.out.println(m2.name);
		System.out.println(m2.phone);
		System.out.println(m2.age);
		
	}

}
