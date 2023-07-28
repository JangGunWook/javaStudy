package festival30문제;

public class ex11번 {

	public static void main(String[] args) {
		
		//11번
		//15분
		
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 : " + result);
		
		
	}
	
	public static boolean isDivide(int num1, int num2) {
		
		if(num1%num2==0) {
			return true;
		}else if(num1%num2==1) {
			return false;
		}else {
			return false;
		}
	}

}
