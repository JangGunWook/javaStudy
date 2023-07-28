package 배열기초;

import java.util.Arrays;
import java.util.Scanner;

public class ex04배열_정수계산 {

	public static void main(String[] args) {
		
		// 배열의 크기가 5인 array변수를 선언하고 
		// 1~5까지 입력값을 입력받기
		// 입력된 점수를 배열로 표시해주기
		// 최고, 최저, 총합, 평균 점수를 출력하시오!

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >>");
			int num = sc.nextInt();
			array[i] = num;
		}

		System.out.println("입력된 점수" + Arrays.toString(array));
		// 최댓값
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최고 점수 : " + max);
		// 최소값
		int min = max;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("최저 점수 : " + min);
		// 총합
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("총합 : " + sum);
		// 평균
		int avg = 0;
		System.out.println("평균 : " + (double) sum /array.length);

	}

}
