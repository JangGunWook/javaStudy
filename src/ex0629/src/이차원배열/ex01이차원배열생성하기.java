package 이차원배열;

import java.util.Arrays;

public class ex01이차원배열생성하기 {

	public static void main(String[] args) {

		// 1. 이차원 배열 생성하기(3행3열)

		int[][] array = new int[3][3];

		System.out.println(array[0]);	 // 0번행의 주소값 출력!
		System.out.println(array[0][2]); // 몇번째 행의 몇번 인덱스로 들어갈지

		// 2. 이창원배열 값을 넣으면서 생성하기

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3행 3열로 선언

		// 3. 이차원배열 안에 데이터 넣기!
		array[0][0] = 1;

		int num = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {		//각행의 열의 길이 구하는 방법
				array[i][j] = num++;
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		// 2차원 배열 한번에 출력하기 arrays.deeptostring()
		System.out.println(Arrays.deepToString(array));
		
		// 2차원 배열 다른 출력방법
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));

	}

}
