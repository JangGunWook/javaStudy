package festival30����;

public class ex22��_�����Ǻ���� {
	public static void main(String[] args) {
		
		// 22��
		// 17��
		
		int rows = 5; //
        for (int i = 1; i <= rows; i++) {
            // ���� ���
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // ��ǥ ���
           
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // ���� ������ �̵�
            System.out.println();
	}

	}

}
