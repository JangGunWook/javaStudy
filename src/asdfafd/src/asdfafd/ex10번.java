package festival30문제;

import java.util.Random;

public class ex10번 {

	public static void main(String[] args) {
		// 10번
		// 13분
		
		int[] array = new int[8];
		
		Random ran = new Random();
		
		System.out.print("배열에 있는 모든 값 : ");
		for(int i=0; i<array.length; i++) {
			array[i] = ran.nextInt(100)+1;
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.print("가장 큰 값");
		int max =0;
		for(int i=0; i<array.length;i++) {
			if(array[i]>max) {
				max= array[i];
			}
		}
		System.out.println(max);
		
		int min = max;
		for(int i=0; i<array.length; i++) {
			if(array[i]<min) {
				min= array[i];
			}
		}
		System.out.println(min);
	}

}
