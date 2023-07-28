package festival30문제;

import java.util.Scanner;

public class ex26번 {

	public static void main(String[] args) {
		
		//26번
		//25분
		Scanner sc = new Scanner(System.in);
		System.out.print(" 첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print(" 두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println(num1*(num2%10));
		System.out.println(num1*(num2/10%10));
		System.out.println(num1*(num2/10/10%10));
		System.out.println(num1*num2);
		
		
	}

}
