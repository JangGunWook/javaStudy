package festival30����;

import java.util.Scanner;

public class ex16��_�ٽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//16��
		//15��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i =0; i<8; i++) {
			
			sum+=num%10;
			num /=10;		
		
		}
		System.out.println(sum);
		
	}

}
