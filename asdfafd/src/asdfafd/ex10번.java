package festival30����;

import java.util.Random;

public class ex10�� {

	public static void main(String[] args) {
		// 10��
		// 13��
		
		int[] array = new int[8];
		
		Random ran = new Random();
		
		System.out.print("�迭�� �ִ� ��� �� : ");
		for(int i=0; i<array.length; i++) {
			array[i] = ran.nextInt(100)+1;
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.print("���� ū ��");
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
