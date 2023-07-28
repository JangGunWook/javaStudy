package ex02조건문;

import java.util.Scanner;

public class ex10switch문예제 {

	public static void main(String[] args) {
		
		// 월을 입력받아 봄,여름,가을,겨울 중 맞는 계절을 알려주는 프로그램을 만드세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		String season; 
		
		switch(month) {
		case 12, 2, 1:
			season = "겨울";
			break;
		case 3,4,5:
			season = "봄";
			break;
		case 6,7,8:
			season = "여름";
			break;
		default:
			season = "가을";
			break;	
	}
		
		System.out.println(month + "월은 " + season +"입니다!");

	}
}
