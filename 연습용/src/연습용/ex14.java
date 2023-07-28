package 연습용;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =1;
		int[][]array = new int[5][5];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i%2==0) {
					array[i][j] = count;
					count ++;
				}else {
					array[i][array.length-j-1]=count;
					count++;
				}
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" \t");
			}
			System.out.println();
		}
		
	}

}
