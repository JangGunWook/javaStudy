package 연습용;

import java.util.ArrayList;
import java.util.Scanner;

public class 연습용 {

	public static void main(String[] args) {
	    int[][] array = new int[5][5];
	    int num = 21;
	    
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    arr.ge

	    for (int i = 0; i < array.length; i++) {
	        if (i % 2 == 0) {
	            for (int j = 0; j < array[i].length; j++) {
	                array[i][j] = num++;
	            }
	        } else {
	            for (int j = array[i].length - 1; j >= 0; j--) {
	                array[i][j] = num++;
	            }
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
