package ex0622삼항연산자;

import java.util.Scanner;

public class ex01삼항연산자 {

	public static void main(String[] args) {
		
		// 삼항연산자
		// 조건문 ? 실행문1 : 실행문2;
		// --> 조건문은 반드시 결과값이 boolean형태로 나와야한다.
		// 조건문의 결과가 참인 경우 실행문1을 실행
		// 조건문의 결과가 거짓인 경우 실행문2를 실행
		// ex) 결과값은 자료형이 "String"  3 == 10 ? "같아" : "달라" ;
		
		//삼항연산자 예제1
		// 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램을 만들어보자!
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("정수를 입력하세요 : ");
		//int num = sc.nextInt();
		
		// String result = (num%2>=1) ? "홀수" : "짝수";
		//System.out.println(num + "는(은)" + result + "입니다.");
		
		//삼항연산자 예제2
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = (num1>num2) ? num1-num2 : num2-num1;
		System.out.print("두수의 차 : " + result);

	}

}
