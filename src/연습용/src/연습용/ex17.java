package 연습용;

import java.util.ArrayList;
import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList();
		
		for(int i=0; i<10; i++) {
			System.out.print(i+1 + "번째 정수 입력 :");
			int num = sc.nextInt();
			array.add(num);
		}
		
		System.out.print("3의 배수 :");
		for(int i=0; i<array.size(); i++) {
			if(array.get(i)%3==0) {
				System.out.print(array.get(i) + " ");
			}
		}

	}

}
