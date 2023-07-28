package while문;

import java.util.Scanner;

public class ex03while문예제2 {

	public static void main(String[] args) {
		
		//while문을 사용하여 키보드로부터 입력 받은수를
		//누적하는 프로그램을 작성하세용
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.print("정수입력 : ");
			int num = sc.nextInt();
			if(num!=-1) {
				sum += num;
				System.out.println("누적결과 : " + sum);
			}else {
				sum += num;
				System.out.println("누적결과 : " + sum);
				System.out.println("종료되었습니다!");
				break;
			}
		}		
	}
}
