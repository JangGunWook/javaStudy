package festival30문제;

import java.util.Scanner;

public class 보너스4번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 보너스4번
		// 17분
		
		int[] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print(i + "번째 별의 수 : ");
			int num = sc.nextInt();
			array[i]= num;
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ":");
			for(int j =0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
