package ex02연산자;

import java.util.Scanner;

public class ex01산술연산자 {

	public static void main(String[] args) {
		// main없이 클래스 파일이 생성되었다면?!
		// >> "main" + ctrl + space --> 내장되어있는 코드블록 자동완성 
		
		
		// 산술연산자
		// "/" : 몫
		// "%" : 나머지
		// --> 정수끼리 연산을 진행하면 정수자료형
		// --> 정수와 실수연산을 진행하면 실수 자료형
		// --> 문자열 + 문자열 --> +연결
		// --> 문자열 + 숫자 --> 결과값이 문자열 형태가 된다.
		//ex) "1" + 5 + 2 ===>출력값 : "152"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더한 결과 값 : " + (num1 + num2) );
		System.out.println("뺀 결과 값 : " + (num1 - num2) );
		System.out.println("곱합 결과 값 : " + (num1 * num2) );
		System.out.println("나눈 결과 값 : " + (num1 / (double)num2));
		
	}
}
