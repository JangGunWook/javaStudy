package festival30문제;

import java.util.Scanner;

public class ex05번_삼각형 {

	public static void main(String[] args) {
		// 5번
		// 10분
		
		System.out.print("행 개수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
