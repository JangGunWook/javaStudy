package festival30����;

import java.util.Scanner;

public class ���ʽ�4�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ʽ�4��
		// 17��
		
		int[] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print(i + "��° ���� �� : ");
			int num = sc.nextInt();
			array[i]= num;
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ":");
			for(int j =0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
