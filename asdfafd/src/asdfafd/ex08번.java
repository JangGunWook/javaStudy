package festival30문제;

import java.util.Scanner;

public class ex08번 {

	public static void main(String[] args) {
		// 8번
		// 8분
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int result;
		if(num%10>4) {
			result = num + (10 - (num%10));
			System.out.println(result);
		}else {
			result = num - (num%10);
			System.out.println(result);
		}
		
	}

}
