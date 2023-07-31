package while문;

import java.util.Scanner;

public class ex04while문예제3 {
	
	public static void main(String[] args) {
		
			//숫자를 입력받아 홀수와 짝수가 각각 몇개 입력되었는지 
			//출력하는 프로그램을 작성하세요.
			//※ -1을 입력한 경우 프로그램 종료
			
			Scanner sc = new Scanner(System.in);
			
			int even = 0;		//짝수
			int odd = 0;		//홀수
			while(true) {
				System.out.print("숫자 입력 : ");
				int num = sc.nextInt();
				if(num%2==0) {
					even++;
				}else if(num%2>0) {
					odd++;
				}else if(num==-1) {
					System.out.println("종료되었습니다.");
					break;
				}
				System.out.println("짝수 개수 : " + even);
				System.out.println("홀수 개수 : " + odd);
		}
	}
}