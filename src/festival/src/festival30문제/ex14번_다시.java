package festival30문제;

public class ex14번_다시 {

	public static void main(String[] args) {

		
		// 14번
		// 15분
		
int[][] array = new int [5][5];
		
		int count = 1;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i%2==0) {
					array[i][j] = count;
					count++;
				}else {
					array[i][array.length-j-1] = count;	//홀수 행일때는 반대로 
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
