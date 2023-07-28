package 연습용;

import java.lang.reflect.Array;

public class ex12번 {

	public static void main(String[] args) {
		
	 int[][] array = new int[5][5];
	 int count =1;
	 for(int i=0; i<array.length;i++) {
		 for(int j=0; j<array[i].length; j++) {
			 array[i][j]=count;
			 count++;
		 }
	 }
	 
	 for(int i=0; i<array.length;i++) {
		 for(int j=0; j<array[i].length; j++) {
			 System.out.print(array[j][i]+"  ");
		 }
		 System.out.println();
	 }
	 
	}

}
