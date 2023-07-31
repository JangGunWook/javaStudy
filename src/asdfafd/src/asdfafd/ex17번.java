package festival30문제;

import java.util.ArrayList;
import java.util.Scanner;

public class ex17번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 17번
		// 15분
		
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		
		int index = 0;
		for(int i=1; i<=10; i++) {
			System.out.print(i + "번 째 정수 입력 : ");
			int num = sc.nextInt();
			
			if(num%3==0) {
				array.add(num);
			}
			
			
		}
		System.out.print("3의 배수 : ");
		for(int i=0; i<array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
	}

}
