package 연습용;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		int[][] array = new int[5][5];
		for (int i = 0; i <array.length; i++) {
			for (int j = array.length-1; j >=0; j--) {
				array[j][i] = count;
				count++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		System.out.println();
		}

	}

}
