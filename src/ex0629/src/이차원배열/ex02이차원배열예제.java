package 이차원배열;

public class ex02이차원배열예제 {

	public static void main(String[] args) {

		// 1. 정수형 데이터를 저장할 수 있는 5행 5열 크기의 array를 선언하세요.
		// 2. 21~45까지의 숫자를 저장하고, 출력하세요.

		int[][] arr = new int[5][5];
		// 일반 행열 출력하기
		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// 뒤엎어서 출력하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// 역순으로 출력하기
		for (int i = 0; i < arr.length; i++) {
			int num1 = 4;
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(arr[i][num1] + " ");
					num1--;
				}
			}
			System.out.println();
		}
	
		
		
	}
}