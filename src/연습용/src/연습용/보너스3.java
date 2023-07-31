package 연습용;

public class 보너스3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));
		
		
	}

	
	public static int cal(int num1, int num2, char op ) {
		if(op=='-') {
			return num1 - num2;
		}
		if(op=='+') {
			return num1 + num2;
		}
		if(op=='*') {
			return num1 * num2;
		}
		if(op=='/') {
			return num1 / num2;
		}else {
			return 0;
		}
	
	}
}
