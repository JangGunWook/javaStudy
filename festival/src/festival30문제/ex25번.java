package festival30문제;

import java.util.Scanner;

public class ex25번 {

	public static void main(String[] args) {
		
		//25번
		//25분
		Scanner sc = new Scanner(System.in);
		int[] array = { 6,2,5,5,4,5,6,3,7,6};
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num>0) {
			sum +=  array[num%10];
			num /= 10;
			
		}
		System.out.print("대시의 총합 : " + sum );
		

	}

}
