package 연습용;

public class ex3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum -= i;
				System.out.print(-i + " ");
			}else {
				sum+=i;
				System.out.print(i + " ");
			}
		
		}
		System.out.println();
		
		System.out.print("결과 : " + sum);
		
	}

}
