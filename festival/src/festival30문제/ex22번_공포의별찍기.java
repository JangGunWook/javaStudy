package festival30문제;

public class ex22번_공포의별찍기 {
	public static void main(String[] args) {
		
		// 22번
		// 17분
		
		int rows = 5; //
        for (int i = 1; i <= rows; i++) {
            // 공백 출력
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 별표 출력
           
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // 다음 행으로 이동
            System.out.println();
	}

	}

}
