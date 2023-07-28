package festival30문제;

import java.util.Scanner;

public class ex24번 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("x 입력 : ");
		int num2 = sc.nextInt();
		
		int[] array = new int[num1];
		
		for(int i=0; i<array.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			int num = sc.nextInt();
			array[i] = num;
		}
		
		System.out.print("결과 : ");
		for(int i=0; i<array.length; i++) {
			if(num2>array[i]) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
