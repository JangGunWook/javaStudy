package festival30����;

import java.util.Arrays;

public class ex21��_�ּҰŸ� {

	public static void main(String[] args) {
		
		// 21��
		// 20��
		// math.abs()	���밪 �޼ҵ� ����ϱ�!!
		
		int[] point = {92,32,52,9,81,2,68};
		int[] array = new int[2];
		
		int min = point[0]-point[1];
		for(int i=0; i<point.length; i++) {
			for(int j=0; j<i;j++) {
				
				if(Math.abs(point[i]-point[j])<min) {
					min =Math.abs(point[i]-point[j]);
					array[0] = j;	//�߻����ؾ���
					array[1] = i;	// ���؝��ؾ���
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
