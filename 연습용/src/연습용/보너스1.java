package 연습용;

import java.util.Scanner;

public class 보너스1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("A입력 >> ");
			int num1 = sc.nextInt();
			
			System.out.print("B입력 >> ");
			int num2 = sc.nextInt();
			
			if(num1==0&&num2==0) {
				break;
			}else {
				System.out.print("결과>>");
				System.out.print(num1-num2);
				System.out.println();
			}
			
		}

	}

}
