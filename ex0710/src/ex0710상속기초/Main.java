package ex0710상속기초;

public class Main {

	
	
	
	
	public static void main(String[] args) {
		// 실행공간
		
		Child a = new Child();
		a.makeAlio();
		a.makeSteake();
		// 자식클래스가 부모클래스의 메소드를 오버라이딩한 경우 
		// 오버라이딩한 메소드가 호출된다!
		
		
		// ★ 자바에서 상속의 특징 - 시험이 나온다!!!
		// 1. 다중상속을 지원하지 않는다. ----> 하나의 부모의 클래스만
		// 2. 상속의 횟수에 제한을 두지 않는다.
		//---> 하나의 클래스는 부모클래스가 될수 있고 자식클래스일수도 있다.
		//---> 부모클래스는 여러개의 자식클래스를 가질 수 있다.
		// 3. 모든 클래스는 java.lang.Object를 상속받는다!
		
		
		
		// 객체의 형변환(Casting)
		// 1. 기본자료형(데이터의 크기에 따라 강제로 형변환 할건지 자동으로 할건지 결정)
		// ---> boolean int char long double float short byte
		// 2. 레퍼런스타입
		// : 객체내 필드, 메소드의 접근권한을 기준으로 강제 vs 자동 형변환 결정
		
		// ★상속이 전제되어 있어야한다!!!!!
		// (1) 자동형변환(==업캐스팅)
		// : 자식클래스가 부모클래스 자료형으로 자동으로 형변환 하는 것을 업캐스팅이라고 한다.
		Parent p = new Child();
		p.makeSteake();
		// --> 업캐스팅 되었을 때, 자식클래스가 부모클래스의 메소드을
		//     오버라이딩한 경우에는, 자식클래스의 메소드가 호출된다.
		
		// (2) 강제형변환(다운캐스팅)
		// Child ch = (Child)new Parent();
		// >> ★ 업캐스팅된 객체를 다시 본래 자신의 형태로 강제적으로 되돌리는 것 
		// 코드를 작성하다가 빨간줄이 떠요 ---> Syntax Error --> 구분 오류
		// 코드에는 문제가 엢는데, 실행했을 때 문제상화 발생 --> Exception -->예외상항
		// 구문에는 문제가 없지만, JVM이 코드를 해석한는 순간 예외가 발생
		// 업캐스팅된 객체를 다시 본래의 자료형으로 강제로 되돌리는 것
	
		
		Child ch = (Child)p;
		ch.makeSteake(); //봉골래
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
