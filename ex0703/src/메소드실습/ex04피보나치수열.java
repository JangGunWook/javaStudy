package 메소드실습;

public class ex04피보나치수열 {

	public static void main(String[] args) {

		// 피보나치 수열
		// 1 1 2 3 5 8 13

		System.out.println(fibo(1));		//0번인덱스 값 출력!
		System.out.println(fibo(2));		//1번인덱스 값 출력!
		System.out.println(fibo(3));		//2번인덱스 값 출력!
		System.out.println(fibo(4));		//3번인덱스 값 출력!
		System.out.println(fibo(5));		//4번인덱스 값 출력!
		System.out.println(fibo(6));		//5번인덱스 값 출력!
		System.out.println(fibo(7));		//6번인덱스 값 출력!
		System.out.println(fibo(8));		//7번인덱스 값 출력!

	}

//	public static int fibo(int num) {
//
//		int[] array = new int[num];		//배열로 선언한다!
//		array[0] = 1;	//[0]에 1을 집어넣는다!(고정값)
//
//		if (num > 1) {		//만약 num이 2이면 1번인덱스까지 생성
//			array[1] = 1;	//[1]에 1을 집어넣는다(고정값)
//			if (num > 2) {	//만약 num이 3이면 2번인덱스부터 생성됨
//				for (int i = 2; i < array.length; i++) {	//num[2]~num[n까지] 값설정
//					array[i] = array[i - 2] + array[i - 1];	
//				}
//			}
//		}
//
//		return array[num - 1];
//	}
	
	//재귀함수를 이용한 메소드
	public static int fibo(int num) {
		
//		// 1,1,2(1+1), 3(1+2(1+1)), 5(2(1+1)+3(1+2(1+1))), 8, 13
//		
//		// 1. num이 2보다 작거나 같았을 경우에는
//		if(num<=2) {
//			// 2. 1이라는 결과값을 반환
//			return 1;
//		} else {
//			// 3. 그렇지 않은 경우
//			// 1, 1, 2
//			// fibo(3) - > 1+1
//			// fibo(4) - > 1+2
//			return fibo(num-1) + fibo(num-2);	//재귀함수
//		}
//		
		// 삼항연산자를 이용한 재귀함수
		return num<=2 ? 1: (fibo(num-1)+fibo(num-2));
	
	}
}
