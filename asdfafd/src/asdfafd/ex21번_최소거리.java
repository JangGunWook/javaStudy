package festival30문제;

import java.util.Arrays;

public class ex21번_최소거리 {

	public static void main(String[] args) {
		
		// 21번
		// 20분
		// math.abs()	절대값 메소드 기억하기!!
		
		int[] point = {92,32,52,9,81,2,68};
		int[] array = new int[2];
		
		int min = point[0]-point[1];
		for(int i=0; i<point.length; i++) {
			for(int j=0; j<i;j++) {
				
				if(Math.abs(point[i]-point[j])<min) {
					min =Math.abs(point[i]-point[j]);
					array[0] = j;	//잘생각해야함
					array[1] = i;	// 잘해앆해야함
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
