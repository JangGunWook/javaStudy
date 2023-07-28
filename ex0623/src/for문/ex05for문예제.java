package for문;

import java.util.Scanner;

public class ex05for문예제 {

	public static void main(String[] args) {
		
		// 원하는 단과 어느 수까지 출력하 건지 입력 받아 구구단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		
//		for(int i=1; i<10; i++) {
//			System.out.println(num1 + "*" + i + "=" + num1*i);
//			if(i==num2) {
//				break;
//			}
//		}
		int i;
		for(i=0;i<num2+1;i++) {
			System.out.println(num1+"*"+i+"="+(i*num1));
		}

	}

}
