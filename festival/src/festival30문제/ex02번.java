package festival30����;

import java.util.Scanner;

public class ex02�� {
	public static void main(String[] args) {
		
		//2��
		//���ѽð�8��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		
		int money = 5000;
		if(time<=8) {
			money = money*time;  
		}else if(time>8) {
			money = (money*8) + (int)(money*1.5*(time-8));
		}
		
		System.out.println("�� �Ա��� " + money + "�� �Դϴ�");
	}

}
