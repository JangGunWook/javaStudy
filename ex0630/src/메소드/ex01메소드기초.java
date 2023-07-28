package 메소드;

import java.io.PrintStream;

public class ex01메소드기초 {

	private static int result;
	public static void main(String[] args) {
		// 메소드 사용하기(main 영역 아쪽에서 사용하기)
		double result = addDouble(3.14, 4.2);
		System.out.println(result);
		
			
		System.out.println();
		
		
	}
	// static 메소드 : static을 사용하면 생성된 클래스에서 사용!가능
	//				 다른 클래스에서 사용하려면 객체생성 후 사용가능!
	//			   	 객체생성 방법 : ex01메소드기초 객체명 = new ex01메소드기초();
	//				 메소드 사용방법 : 객체명.메소드명(매개변수)
	
	// void 메소드 : void 사용시 메서드의 리턴타입을 고려하지 않고 메소드 안에서 
	//             다른 자료형 타입사용 가능!!! return사용 불가능!
	//			   결과값 대입 혹은 메세지 출력만 가능하다!!!!!!
	
	
	
	
	//메서드 생성(main영역을 벗어나서 작성하기)
	// 1. 더하기 메소드
	// 리턴 타입 : double / 매개변수 : 2개(double) / 메소드명 : addDouble 
	
	public static double addDouble(double num1, double num2) {
		//void : 리턴타입이 없다는 것을 의미하는 키워드
		double result =  num1 + num2;
		// 메소드는 return을 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에 코드를 작성할 것!
		return result;
	}
	
	// 2. 빼기 메소드
	// 리터타입 : int / 매개변수 : int 2개 / 메소드명 : minusNum
	// 매개변수로 받아온 데이터 두개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰수에서 작은수르 뺀 결과를 돌려주기
	
	
	public static void minusNum(int num1, int num2) {
		 int result = num1 + num2;
		 System.out.println(result);
	}

}
