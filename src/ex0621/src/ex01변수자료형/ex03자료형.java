package ex01변수자료형;

public class ex03자료형 {
	public static void main(String[] args) {
		
		//java 기본 자료형(8가지)
		// 1. 논리형 : boolean --> 참 혹은 거짓을 저장하는 데이터(1byte)
		// 참을 저장할 수 있는 bool 변수 선언
		
		boolean bool = true; // false(거짓)
		System.out.println(bool);
		
		// 2. 문자 자료형 : char --> 문제데이터를 저장할 수 있는 자료형(2byte)
		// 손을 저장할 수 있는변수 name2을 선언
		
		char name2 = '손';
		// --> char는 문자 하나만 저장 가능! ''(따옴표)를 사용하서 값을 부여
		System.out.println(name2);
		
		// 3. 문자열 자료형 : String --> 문자데이터를 저장할 수 있는 자료형(기본 자료형이 아님!!!!)
		
		String name = "손지영";
		System.out.println(name);
		
		//4. 정수자료형
		//byte(1), short(2), int(4), long(8)
		// --> 각각의 크기는 표현할 수 있는 숫자의 범위를 의미한다.
		// ex) byte : -128 ~ 127까지만 표현 가능
		// 자바에서는 정수 데이터를 입력하면 int(default값) 인식
		
		//byte 자료형을 변수 num을 선언해서 128숫자 데이터를 담아주세요
		
		double num = (int) 12.8;
		byte num2 = (byte) 130;
		// casting(형변환)
		//(1) 강제형변환(※ 명시적 형변환)
		// --> 큰 용량이 작은 용량을 데이터 옮기는 작업
		//	   데이터 손실이 일어날 수 있다!
		// --> 데이터 손실이 일아도 괜찮으니 강제로 자료형을 바꿀 때 사용
		System.out.println(num);  //-->출력값-128
		System.out.println(num2);
		// 128을 int 자료형으로 인식(4byte)인식한다 But!!!!! ---> lbyte공간 담아주기
		
		//(2) 자동 형변환
		// : 작은 용량을 담은 공간에서 큰 용량을 담을 수 있는 공간으로
		//   데이터를 옮겨줄 때 자동으로 자료형 변환이 일어난다.
		// 5. 실수 자료형(소수점)
		// : float(4byte), double(8byte)
		double num3 = 4;
		System.out.println(num3);
		
		// 3.14라는 데이터를 저장할 수 있는 float 자료형 num3 변수 선언
		
		float num4 = 3.14f;	// 같은 형태 <= float num4 = (float)3.14;

				
		
		
		
		
		
		
		
		
		
		
		
	}

}
