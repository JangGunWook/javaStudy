package festival30문제;

import java.util.Random;
import java.util.Scanner;

public class ex29번 {

	public static void main(String[] args) {
		
		//29번
		//30분
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		
		while(true) {
			int num1 = ran.nextInt(10)+1;
			int num2 = ran.nextInt(10)+1;
			System.out.println(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			
			if(num1+num2==answer) {
				System.out.println("Success");
			}else {
				System.out.println("fail");
				count++;
			}
			
			if(count==5) {
				System.out.println("game over");
				break;
			}
			
		}
		
		
		
	}

}
