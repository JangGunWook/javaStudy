package festival30문제;

import java.util.Scanner;

public class ex27번 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		
		String answer = sc.next();
		String[] array = answer.split("");
		
		int count = 0;
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i].equals("O")) {
				count++;
				sum += count;
			}else {
				count=0;
			}
		}
		System.out.print(sum);
		
		
		
			
			
			
		
		
	}
}
