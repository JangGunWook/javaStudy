package 메소드 ;
import java.util.Scanner;

public class ex05가까운수찾기 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("정수1 입력");
	      int number1 = sc.nextInt();

	      System.out.println("정수2 입력");
	      int number2 = sc.nextInt();

	      int result = close10(number1, number2);

	      System.out.println("10에 가까운 수 " + result);

	}
//

	  

	public static int close10(int num1, int num2) {
		int result = 0;
		//제곱을 이용한방법
//		if((10- num1)*(10 -num1)<(10-num2)*(10-num2)) {
//			result = num1;
//		}else if((10- num1)*(10 -num1)>(10-num2)*(10-num2)){
//			result = num2;
//		}else {
//			result = 0;
//		}
		
		// 절대값을 이용한 방법
		if(Math.abs(10-num1)<Math.abs(10-num2) ) {
			result = num1;
		}else if(Math.abs(10-num1)>Math.abs(10-num2)) {
			result = num2;
		}else {
			result = 0;
		}
		return result;
	   }
		

	}

