package festival30����;

import java.util.Scanner;

public class ���ʽ�1�� {

	public static void main(String[] args) {
		
		//���ʽ� 1��
		// 12��
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		System.out.print("A �Է� : ");
		int A = sc.nextInt();
		
		System.out.print("B �Է� : ");
		int B = sc.nextInt();
		
		if(A==0&&B==0) {
			break;
		}else {
			A = A-B;
			System.out.print("��� >>" + A);
			System.out.println();
		}
		
		}
		
	}

}
