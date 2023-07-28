package 메소드;

import java.util.Scanner;

public class ex03메소드예제 {

	public static void main(String[] args) {

		// 1. 정수형 num1과 num2를 입력바고, 문자형 op를 선언해 원하느 연산자를 넣으세요.
		// 2. num1과 num2를 op에 맞게 연산하여 최종 값을 반환헤즌, cal메소드를 만들어주세요.
		// 단, 빼기를 수행할 때는 더 큰 수에서 작은 수를 빼세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';
		System.out.println(cal(num1, num2, op));
	}

	// void메서드로 만들어봄(오버로딩함)
	public static void cal(int num1, int num2, String op) {
		int result;
		switch (op) {

		case "-":
			result = num1 - num2;
			System.out.println(result);

		case "+":
			result = num1 + num2;
			System.out.println(result);

		case "*":
			result = num1 * num2;
			System.out.println(result);

		case "/":
			result = num1 / num2;
			System.out.println(result);
		}
	}

	// 리턴타입 선언 하여 메소드 작성(오버로딩 함)
	public static int cal(int num1, int num2, char op) {

		if (op == '+') {
			return num1 + num2;
		} else if (op == '-') {
			return num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '*') {
			return num1 * num2;
		} else if (op == '/') {
			return num1 / num2;
		} else {
			// 조건에 맞지 않는 결과값을 작성해줘야합니다!
			return 0;
		}

	}

}
