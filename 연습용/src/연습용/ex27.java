package 연습용;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====채점하기====");
		String answer = sc.next();
		
		String[] score = answer.split("");
		
		int count =0;
		int sum =0;
		for(int i=0; i<score.length; i++) {
			if(score[i].equals("o")) {
				count++;
				sum = sum + count;
			}else if(score[i].equals("x")){
				count = 0;
			}
		}
		
		System.out.println(sum);
		
	}

}
