package 연습용;

import java.util.Scanner;

public class 자판기프로그램_잔돈개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int charge = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3.에그몽(500원)>> ");
		int num = sc.nextInt();
		
		int 잔돈 = charge;
		switch(num) {
		case 1:
			잔돈 = charge - 700;
			break;
		case 2:
			잔돈 = charge - 1000; 
			break;
		case 3:
			잔돈 = charge - 500; 
			break;	
		}
		
		if(0<잔돈) {
			System.out.println("거스름돈 : " + 잔돈);
		}else {
			System.out.println("잔돈이 부족해요ㅠㅠㅠ");
			System.out.println("거스름돈 : " + charge);
		}
		
		int a,b,c;
		if(잔돈>0) {
			a = 잔돈/1000;		//천원짜리	개수
			b = 잔돈%1000/500;	//500원짜리 개수
			c = 잔돈%500/100;		//100원짜리 개수
		}else {
			a = charge/1000;
			b = charge%1000/500;
			c = charge%500/100;
		}
		
		System.out.println("1000원짜리 개수 : " + a);
		System.out.println("500원짜리 개수 : " + b);
		System.out.println("100원짜리 개수 : " + c);
		
	}

}
	
