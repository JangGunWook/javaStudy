package 연습용;

import java.util.Random;
import java.util.Scanner;

public class 마름모별찍기 {

	public static void main(String[] args) {

		int row = 5; // 위 5행 수

		for (int i = 1; i <= row; i++) {
			// 공백 출력
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}

			// 별표 출력
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			// 다음 행으로 이동
			System.out.println();
		}
		int row1 = 4; // 아래 4행
		for (int i = 1; i <= 4; i++) {
			// 공백 출력
			for (int j = 4; j < row; j++) {
				System.out.print(" ");
			}
			row++;
			// 별표 출력

			for (int k = 1; k <= 2 * row1 - 1; k++) {
				System.out.print("*");
			}
			row1--;
			// 다음 행으로 이동
			System.out.println();
		}

	}

}
