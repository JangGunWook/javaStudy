package 이중for문;

public class ex04공포의별찍기 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****
		int rows = 5; //
		for (int i = 1; i <= rows; i++) {
			// 공백 출력
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// 별표 출력
			for (int n = 1; n <= i; n++) {
				System.out.print("*");
			}

			// 다음 행으로 이동
			System.out.println();
		}

	}

}
