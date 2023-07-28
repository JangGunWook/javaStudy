package ex02조건문;

import java.util.Scanner;

public class ex11자판기프로그램_스위치문작성 {

	public static void main(String[] args) {
		
		// 조건문 복합 예제
		// 자판기 프로그램을 만들어봅시다.
		// 금액을 입력하고 메뉴를 고른 뒤 잔돈을 출력해 보세요!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int charge = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3.에그몽(500원)>> ");
		int num = sc.nextInt();
		
		int charges;
		switch(num) {
		case 1:
			charges = charge - 700;
			break;
		case 2:
			charges = charge - 1000;
			break;
		case 3:
			charges = charge - 500;
			break;
		default :
			charges = charge - 0;
			break;
		}
		System.out.println("잔돈은 " + charges + "입니다." );
	}

}
