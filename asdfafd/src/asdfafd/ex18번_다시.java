package festival30����;

import java.util.Random;

public class ex18��_�ٽ� {

	public static void main(String[] args) {
		
		//18��
		//15��

		Random ran = new Random();
		int[] array = new int[6];
		
		for(int i=0; i<6; i++) {
			array[i] = ran.nextInt(40)+1;
			for(int j=0; j<i; j++) {	//�񱳴���� �ε��� ��ȣ�� �����
				if(array[i]==array[j]) {
					i--;
				}
			}
			
		}
		for(int i = 0; i<6; i++) {
			System.out.println("����� ���� : " + array[i]);
		}

	}

}
