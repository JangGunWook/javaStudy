package festival30문제;

import java.util.Scanner;

public class ex19번 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("어느 수까지 출력: ");
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num1; i++) {
			for(int j=1; j<=num2; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
	}
	
	
}
