package ex02조건문;

public class ex01단순if문 {

	public static void main(String[] args) {
		
		// 단순 if문
		// if문 문법
		// if(조건식) {
		//			조건식이 참이었을 경우 실행할 실행문장 
		//{
		//  --> 실행문장은 여러줄이어도 상관없음!
		//  --> 실행문장이 한줄인 경우에는 중괄호 생략이 가능!
		
		int age = 15;
		
		if(age >= 20) {
			System.out.println("성인입니다!");
		} else {
			System.out.println("미성년자입니다!");
		}

	}

}
