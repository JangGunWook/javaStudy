package festival30����;

public class ex14��_�ٽ� {

	public static void main(String[] args) {

		
		// 14��
		// 15��
		
int[][] array = new int [5][5];
		
		int count = 1;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i%2==0) {
					array[i][j] = count;
					count++;
				}else {
					array[i][array.length-j-1] = count;	//Ȧ�� ���϶��� �ݴ�� 
					count++;
				}
				
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
