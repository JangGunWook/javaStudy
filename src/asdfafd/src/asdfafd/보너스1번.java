package festival30문제;

import java.util.Scanner;

public class 보너스1번 {

	public static void main(String[] args) {
		
		//보너스 1번
		// 12분
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		System.out.print("A 입력 : ");
		int A = sc.nextInt();
		
		System.out.print("B 입력 : ");
		int B = sc.nextInt();
		
		if(A==0&&B==0) {
			break;
		}else {
			A = A-B;
			System.out.print("결과 >>" + A);
			System.out.println();
		}
		
		}
		
	}

}
