package festival30����;

public class ex14�� {

	public static void main(String[] args) {

		
		// 14��
		// 15��
		
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
