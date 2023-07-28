package festival30문제;

import java.util.Scanner;

public class ex20번_이진수 {

	public static void main(String[] args) {
		
		// 20번
		// 20분
		
		Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      
	      int num2 = num;
	      int i = 0;
	      
	      while(num2>0) {     // 2로 계속 나눔 --> 배열의 크기를 구함
	                      // 예시) 10을 2로 나눠가면  5 2 1 0 나오면서 x값은 4가 됨
	                      // 배열의 크기가 4임을 확인하는 과정
	         num2/=2;
	               i++;
	      }
	      
	      int[] arr = new int[i];
	      int j = 0;
	      num2=num;
	      while(num2>0) {    // 2진법은 2로 나누면서 나머지를 구하고, 그 나머지들을 역으로 배치해야함
	                     // 10%2 = 0
	                     // 5%2 = 1
	                     // 2%2 = 0
	                     // 1%2 = 1   --> 0 1 0 1을 반대로 --> 1 0 1 0
	         
	      arr[j]=num2%2;
	      num2/=2;//---------->매우 중요
	      j++;
	      
	        
	      }
	      
	      
	      for(int n = arr.length;n>0;n--) {
	         // k가 배열 크기인 4부터 시작
	      System.out.println(arr[n-1]);
	      // [k-1]인 이유는 배열은 크기보다 1 작은 항까지만 존재하니까.
	      // k-- 해줌으로써 행렬을 역으로 출력하는것
	      
	      
        }

	}

}
