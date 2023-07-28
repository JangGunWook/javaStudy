package festival30문제;

public class ex14번 {

	public static void main(String[] args) {

		
		// 14번
		// 15분
		
		int[][] array = new int[5][5];
		int num =1;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = num;
				System.out.print(array[i][j] + "\t");
				
				num++;
			}
			System.out.println();
		}
		
	}

}
