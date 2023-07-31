package for문;

import java.util.Scanner;

public class ex04for문예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for문 예제 원하는 단을 입력 받아 구구단을 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		int num = sc.nextInt();
		
		int i;
		for(i=0;i<10;i++) {
			System.out.println(num+"*"+i+"="+(i*num));
		}
		
		
	}

}
