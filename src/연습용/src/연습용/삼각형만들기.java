package 연습용;

import java.util.Scanner;

public class 삼각형만들기 {

	public static void main(String[] args) {
		
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행 개수 : ");
		int num = sc.nextInt();
		
//		//역삼각형
//		for(int i=num; 0<i; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
			
		//삼각형
		for(int i=1; i<num+1; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
	}
}
