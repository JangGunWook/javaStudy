package festival30����;

public class ���ʽ�3�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���ʽ� 3��
		// 15��
		
		int num1 = 50;
		int num2 = 15;
		String op = "-";
				
		System.out.println(cal(num1, num2, op));
		
	}
	public static int cal(int num1, int num2, String op) {
		
		if(op.equals("+")) {
			return num1+num2;
		}else if(op.equals("-")) {
			return num1 - num2;
		}else if(op.equals("*")) {
			return num1 * num2;
		}else{
			return num1/num2;
		}
	}

}
