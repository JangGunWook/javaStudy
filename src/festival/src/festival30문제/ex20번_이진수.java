package festival30����;

import java.util.Scanner;

public class ex20��_������ {

	public static void main(String[] args) {
		
		// 20��
		// 20��
		
		Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      
	      int num2 = num;
	      int i = 0;
	      
	      while(num2>0) {     // 2�� ��� ���� --> �迭�� ũ�⸦ ����
	                      // ����) 10�� 2�� ��������  5 2 1 0 �����鼭 x���� 4�� ��
	                      // �迭�� ũ�Ⱑ 4���� Ȯ���ϴ� ����
	         num2/=2;
	               i++;
	      }
	      
	      int[] arr = new int[i];
	      int j = 0;
	      num2=num;
	      while(num2>0) {    // 2������ 2�� �����鼭 �������� ���ϰ�, �� ���������� ������ ��ġ�ؾ���
	                     // 10%2 = 0
	                     // 5%2 = 1
	                     // 2%2 = 0
	                     // 1%2 = 1   --> 0 1 0 1�� �ݴ�� --> 1 0 1 0
	         
	      arr[j]=num2%2;
	      num2/=2;//---------->�ſ� �߿�
	      j++;
	      
	        
	      }
	      
	      
	      for(int n = arr.length;n>0;n--) {
	         // k�� �迭 ũ���� 4���� ����
	      System.out.println(arr[n-1]);
	      // [k-1]�� ������ �迭�� ũ�⺸�� 1 ���� �ױ����� �����ϴϱ�.
	      // k-- �������ν� ����� ������ ����ϴ°�
	      
	      
        }

	}

}
