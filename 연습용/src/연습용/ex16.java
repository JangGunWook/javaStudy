package 연습용;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num = num/10;
		}
		System.out.print(sum);

	}

}
