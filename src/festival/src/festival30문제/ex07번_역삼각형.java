package festival30문제;

import java.util.Scanner;

public class ex07번_역삼각형 {

	public static void main(String[] args) {
		
		//7번
		//10분
		System.out.print("행개수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {		//i>0 이거를 기억해라!!!
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
