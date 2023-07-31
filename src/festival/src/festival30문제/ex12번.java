package festival30문제;

public class ex12번 {

	public static void main(String[] args) {

		// 12번
		// 13분

		int[][] array = new int[5][5];

		int num = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

	}

}
