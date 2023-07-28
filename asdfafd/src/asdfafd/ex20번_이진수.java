package festival30문제;

import java.util.Scanner;

public class ex20번_이진수 {

	public static void main(String[] args) {
		
		// 20번
		// 20분
		
		 Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 하세요 : ");

        int num = sc.nextInt();

        int num2 = num;

        //10진수를 2진수로 바꿀때 몇번의 나눗셈이 사용되는지 확인
        while(num2>0) {
            num2/=2;
            System.out.print(num2%2);
        }

	}

}
