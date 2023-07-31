package 메소드실습;

public  class ex03완전수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl 누른 상태에서 메소드 호출하는 걸 클릭
		// --> 선언한느 구간으로 데리고 가준다.
		// 공부하실 때, 해드디버깅하면서 메소드의 흐름을 파아하기!!!
		ex03완전수구하기 a = new ex03완전수구하기();
		System.out.println(a.isPerfect(6));		// 6는 완전수 : True
		System.out.println(a.isPerfect(44));		// 44는 완전수X : false
		
	}
	public static int isDivisor(int num1, int num2) {
//		boolean result;
//		if (num1 > num2) {
//			//num1 > num2 경우
//			if (num1 % num2 == 0) {
//				result = true;
//			} else {
//				result = false;
//			}
//		}else if(num2==num1) {
//			//num1==num2 경우
//			result = true;
//		}else if (num2 % num1 == 0) {
//			//num1<num2 경우
//			result = true;
//		} else {
//			result = false;
//		}
//		return result;
		
		//삼항연산자로 사용하기
		return num1%num2==0?num2:0;	//나누어 덜어지면 분모(num2)를 넣어주고 아니면 0값을 출력한다
	}
	
	
	public static int getSum(int num) {
		int sum=0;	//총 합을 구할 변수 선언
		int half = num/2;	//성능을 위해서 값을 전반으로 줄인다!
		
		for(int i=1; i<=num/2; i++) {	//num값을 제외한 것 까지 
				// num값과 나누어 떨어지는 정수 찾기!
				sum+=isDivisor(num, i);
				// isDivisor를 사용하여 sum에 누적
		}
		
		return sum;	// 총합 결과값 반환
	}
	
	
//	public static boolean isPerfect(int num) {
//		int sum=0;	//총 합을 구할 변수 선언
//		int half = num/2;	//성능을 위해서 값을 전반으로 줄인다!
//		
//		for(int i=1; i<=num/2; i++) {	//half값을 포함한 i값까지 
//			if(num%i==0) {
//				// num값과 나누어 떨어지는 정수 찾기!
//				sum+=i;
//				// sum에 약수를 누적시켜준다
//			}
//		}
//		if(sum==num) {
//			//sum과 입력값이 같으면 True
//			return true;
//		}else {
//			//sum과 입력값이 같으면 false
//			return false;
//		}
//			
//	}
	
	
	public  boolean isPerfect(int num) {
		
		return getSum(num)==num;// getSum메소드를 활용하여 num값과 같으면 True 아니면 False를 반환
	}
}
