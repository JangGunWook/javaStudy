package 메소드실습;

import java.util.Scanner;

public class ex01나누어지는수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

	}

	public static boolean isDivisor(int num1, int num2) {
//		boolean result;
//		if (num1 > num2) {
//			//num1 > num2 경우
//			if (num1 % num2 == 0) {
//				result = true;
//			} else {
//				result = false;
//			}
//		}else if(num2==num1) {
//			//num1==num2 경우
//			result = true;
//		}else if (num2 % num1 == 0) {
//			//num1<num2 경우
//			result = true;
//		} else {
//			result = false;
//		}
//		return result;
		
		//삼항연산자로 사용하기
		return num1%num2==0?true:false;
	}

}
