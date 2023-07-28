package 메소드;

public class ex02메소드예제 {

	public static void main(String[] args) {
		
		// 1. 덧셈, 뺄셈, 나눗셈, 곱셈이 가능한 메소드 4개를 생성하세요.
		// 2. 아래와 같이 메소드를 사용하고 결과값을 출력하세요.
		
		ex02메소드예제 asd = new ex02메소드예제();
		asd.add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
		

	}
	//더하기
	public  void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	//빼기
	public static void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(result);
	}
	//곱하기
	public static void mul(int num1, int num2) {
		int result = num1*num2;
		System.out.println(result);
	}
	//나누기
	public static void div(int num1, int num2) {
		int result = num1/ num2;
		System.out.println(result);
	}
}
