package festival30문제;

import java.util.Scanner;

public class ex16번_다시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//16번
		//15번
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i =0; i<8; i++) {
			
			sum+=num%10;
			num /=10;		
		
		}
		System.out.println(sum);
		
	}

}
