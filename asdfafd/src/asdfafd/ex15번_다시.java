package festival30문제;

import java.util.Scanner;

public class ex15번_다시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//15번
		//15분
		
		  //정수 n을 입력받아 1,2,4,7,11 과 같은 수열의 n번째 항까지 출력

        // 1,2,4,7,11,16,22

        Scanner sc = new Scanner(System.in);

        

        System.out.print("n 입력 : ");

        int n = sc.nextInt();

    

        for(int i=0, j=1; i<n; i++) {

            j+=i;

            System.out.print(j+"\t");

        }
	}

}
