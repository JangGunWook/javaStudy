package festival30����;

import java.util.Scanner;

public class ex01�� {

	public static void main(String[] args) {
		// 1�� 
		// ���ѽð� 8��
		//���� �����Կ� ��ǥ�����Ը� ���� �Է� �ް�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������� : ");
		int present = sc.nextInt();		// ���� ������
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();		// ��ǥ ������
		
		int i=1;
		do {
			if(present>goal) {
			System.out.print(i+"���� ���� ������ :");
			int min = sc.nextInt();
			i++;
			present -= min;
			}else {
				break;	//�극��ũ ������ ���� ���ϴ�!!!! �ʼ� ����
			}
			
		}while(true);
		
		System.out.println(present + "kg �޼�!! �����մϴ�!");
		
		
	}

}
