package 배열기초;

import java.util.Arrays;

import java.util.Random;

public class ex02배열예제 {

	public static void main(String[] args) {

		// 배열 예제 - 홀수 찾기
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언하세요.
		// 2. 배열 안의 모든 데이터를 임의의 값을 초기화하세요.(1~100까지의 수)
		// 3. 배열 안으 ㅣ데이터 중 홀수의 값만 출력하고, 총 몇 개인지 출력하세요.

		int[] array = new int[5];
		Random ran = new Random();

		int cnt = 0; // 총 홀수 개수

		System.out.print("array에 들어가는 홀수는 ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				cnt++;
			}
		}
		System.out.print("이며, 총" + cnt + "개 입니다.");

	}

}
