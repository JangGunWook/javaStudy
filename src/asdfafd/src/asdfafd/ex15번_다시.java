package festival30����;

import java.util.Scanner;

public class ex15��_�ٽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//15��
		//15��
		
		  //���� n�� �Է¹޾� 1,2,4,7,11 �� ���� ������ n��° �ױ��� ���

        // 1,2,4,7,11,16,22

        Scanner sc = new Scanner(System.in);

        

        System.out.print("n �Է� : ");

        int n = sc.nextInt();

    

        for(int i=0, j=1; i<n; i++) {

            j+=i;

            System.out.print(j+"\t");

        }
	}

}
