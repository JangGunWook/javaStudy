package festival30문제;

import java.util.Scanner;

public class 보너스5번 {

	public static void main(String[] args) {
	
		//보너스5번
		// 15번
		
		int[] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print(i+1 + "번째 수 입력 :");
			array[i] = sc.nextInt();
		}
		
		for(int i=4; i>=0; i--) {
			System.out.print(array[i] + " ");
		}
		

	}

}
