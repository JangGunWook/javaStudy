package festival30문제;

public class ex23번_90도회전 {
	
	public static void main(String[] args) {
		
		// 23번
		// 25분
		
		
		
		int[][]	array = new int [5][5];
		int count = 1;
		for(int i=0; i<array.length; i++) {
			for(int j=array[i].length-1; j>=0; j--) {
				array[j][i]=count;
				count++;
			}
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	
		
	}
}
