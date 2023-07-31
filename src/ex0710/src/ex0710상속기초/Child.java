package ex0710상속기초;

public class Child extends Parent {
	
	//자식클래스, 서브클래스(새로운 클래스)
	
	// extends : 상속을 받을때 사용하는 키워드
	// --> 연장하다. 확장하다의 의미를 가지고 있음
	
	// class 서브클래스 extends 슈퍼클래스
	
	public void makeBong() {
		System.out.println("맛있는 봉골레 파스타를 만든다!~ 얍");
	}
	@Override
	public void makeSteake() {
		System.out.println("버터에 아스파라거스를 추가해서 스테이크 굽기");
	}

	/**
	 * @author 메소드 만듲ㄴ사람
	 * @since 만든 날짜
	 * @param	매개변수에 대한 설명
	 * @return	반환값에 대한 설명달아주는 곳
	 * 
	 */
	@Override	// @:annotation --> 개발자들끼리 소통을 위한 주석
	public void makeAlio() {
		super.makeAlio();
		// super --> Parent 클래스 호출
		// . --> 가지고 있는
		// makeAlio() --> 메소드를 그대로 호출할거야!
		
	}
	
	
	
	//메소드 오버로딩 == 중복정의
	//메소드 오버라이딩	== 재정의
	// : 상속이 전제되었을 때, 부모클래스를 가지고 있는 메소드를 그대로 가지고 와서
	//   (리턴타입, 메소드명, 매개변수 등) {} 안쪽에 있는 로직만 다시 정의하는 기법

	
}
