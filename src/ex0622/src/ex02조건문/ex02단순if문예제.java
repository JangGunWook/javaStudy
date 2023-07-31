package ex02조건문;

import java.util.Scanner;

public class ex02단순if문예제 {

	public static void main(String[] args) {
		// int타입의 변수 num을 선언하고 키보드로 값을 입력 받으세요.
		// 만약 num이 3의 배수이면서 5의배수라면 "3과5의 배수입니다"라고
		// 출력하는 프로그램을 만들어보세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}

		// 코드를 예쁘게 정렬할 수 있는 단축키
		// ctrl + shift + f

	}

}
