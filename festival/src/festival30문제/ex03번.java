package festival30문제;

public class ex03번 {

	public static void main(String[] args) {
		// 3번
		// 8분
		
		int sum = 0;
		
		 for(int i=1; i<=100; i++) {
			 if(i%2==1) {
				 System.out.print(i + "\t");
				 sum += i;
			 }else {
				 System.out.print(-i + "\t");
				 sum -=i;
			 }
		 }
		 System.out.println();
		 System.out.println("결과 : " + sum);
	}

}
