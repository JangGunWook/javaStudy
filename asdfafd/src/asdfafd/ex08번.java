package festival30����;

import java.util.Scanner;

public class ex08�� {

	public static void main(String[] args) {
		// 8��
		// 8��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		int result;
		if(num%10>4) {
			result = num + (10 - (num%10));
			System.out.println(result);
		}else {
			result = num - (num%10);
			System.out.println(result);
		}
		
	}

}
