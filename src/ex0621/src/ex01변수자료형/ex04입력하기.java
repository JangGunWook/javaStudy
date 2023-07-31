package ex01변수자료형;

import java.util.Scanner;

public class ex04입력하기 {

	public static void main(String[] args) {
		// name이라는 변수에 이름을 입력받아주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 해주세요 : ");
		String name = sc.next();
		
		System.out.println("안녕 " + name);

		// 숫자(정수)를 입력받기
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
	}

}
