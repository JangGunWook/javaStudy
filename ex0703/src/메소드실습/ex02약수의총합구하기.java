package 메소드실습;

public class ex02약수의총합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(getSum(44));	//44의 약수들의 총합 : 40출력
	}
	

	
	public static int getSum(int num) {
		int sum=0;	//총 합을 구할 변수 선언
		int half = num/2;	//성능을 위해서 값을 전반으로 줄인다!
		
		for(int i=1; i<=num/2; i++) {	//num값을 제외한 것 까지 
			if(num%i==0) {
				// num값과 나누어 떨어지는 정수 찾기!
				sum+=i;
				// sum에 약수를 누적시켜준다
			}
		}
		
		return sum;	// 총합 결과값 반환
	}
}
