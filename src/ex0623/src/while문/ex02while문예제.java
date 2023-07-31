package while문;

import java.util.Scanner;

public class ex02while문예제 {

	public static void main(String[] args) {
		//while문을 사용하여 키보드로부터 입력 받은 수가
		//10보다 작을 때만 계속 정수를 입력받으세요.

		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(num<11) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
			System.out.println("종료되었습니다.");
	}

}
