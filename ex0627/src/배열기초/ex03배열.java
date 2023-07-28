package 배열기초;

import java.util.Arrays;
import java.util.Random;

public class ex03배열 {

	public static void main(String[] args) {

		// 1. 배열을 선언하는 또 다른 방법
		int[] array = { 5, 3, 2, 10, 9 };

		// 2. 배열안에 있는 모든 데이터를 출력하는 또 다른 방법
		// ----> Arrays.toString(변수명)
		// System.out.println(Arrays.toString(array));
		Random ran = new Random();

		// 배열 예제 - 가장 큰 수 찾기
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 arr를 선언한다.
		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화하세요,(1~10까지 수)
		// 3. 배열 안의 데이터 중 가장 큰값을 출력하세요.
		int max = 0;
		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 값은 :" + max + "입니다");
	}
}
