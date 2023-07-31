package for문;

public class ex07for문예제 {

	public static void main(String[] args) {
		
		//(77*1)+(76*2)+(75*3)+....+(1*77)를 계산하여
		// 결과값을 출력하세요.
		
		
		int result = 0;
		int j = 77;
		for(int i = 1; i<78; i++) {
			result += (i*j);
			j--;
		}
		System.out.println(result);
	}

}
