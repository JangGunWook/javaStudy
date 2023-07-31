package 연습용;

import java.util.Scanner;

public class 자판기프로그램_if문작성 {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int charge = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 아우터(700원) 2. 이구동성(1000원) 3.에그몽(500원)>> ");
		int num = sc.nextInt();
		
		int charges = charge;
		
		if(num ==2 ) {
			if(charge>1000) {
				charges = charge - 1000;
				System.out.println("잔돈 : " + charges);
			}else {
				System.out.println("돈이 부족해요ㅠㅠㅠ");
				System.out.println("잔돈 : " + charges);
			}
		}else if(num==1) {
			if(charge>700) {
				charges = charge - 700;
				System.out.println("잔돈 : " + charges);
			}else {
				System.out.println("돈이 부족해요ㅠㅠㅠ");
				System.out.println("잔돈 : " + charges);
			}
		}else if(num==3) {
				if(charge>500) {
					charges= charge - 500;
					System.out.println("잔돈 : " + charges);
				}else {
					System.out.println("돈이 부족해요ㅠㅠㅠ");
					System.out.println("잔돈 : " + charges);
				}	
		}
		int a = charges/1000;
		System.out.println("천원개수 : " + a);
	}

}
	
