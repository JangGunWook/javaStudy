package festival30����;

import java.util.Scanner;

public class ex05��_�ﰢ�� {

	public static void main(String[] args) {
		// 5��
		// 10��
		
		System.out.print("�� ���� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
