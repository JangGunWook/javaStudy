package festival30����;

import java.util.Scanner;

public class ex07��_���ﰢ�� {

	public static void main(String[] args) {
		
		//7��
		//10��
		System.out.print("�ళ�� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num; i>0; i--) {		//i>0 �̰Ÿ� ����ض�!!!
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
