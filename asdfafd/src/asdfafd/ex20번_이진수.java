package festival30����;

import java.util.Scanner;

public class ex20��_������ {

	public static void main(String[] args) {
		
		// 20��
		// 20��
		
		 Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� �ϼ��� : ");

        int num = sc.nextInt();

        int num2 = num;

        //10������ 2������ �ٲܶ� ����� �������� ���Ǵ��� Ȯ��
        while(num2>0) {
            num2/=2;
            System.out.print(num2%2);
        }

	}

}
