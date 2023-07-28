package 이차원배열;

public class ex03이차원배열스네이프 {

	public static void main(String[] args) {
		
		// 정수형 데이터를 저장할 수 있는 5행 5열 크기의 array를 선언하세요.
		// 아래와 같이 21~45까지의 숫자를 저장하고, 출력하세요.
		// 스네이크
		// 21 22 23 24 25 -------->
		// 30 29 28 27 26 <--------
		// 31 32 33 34 35 -------->
		// 40 39 38 36 37 <--------
		// 41 42 43 44 45 -------->
		
	    int[][] array = new int[5][5];
	    int num = 21;
	    
	    // 0,2,4 ----> 인덱스 행이 짝수일 때
	    // 1,3 <----- 인덱스 행이 홀수일 때
	    for (int i = 0; i < array.length; i++) {
	    	// 행이 홀수인지, 짝수인지 판별
	    	// 행의 값 --> i
	        if (i % 2 == 0) {		
	        	//행이 짝수일 때
	            for (int j = 0; j < array[i].length; j++) {
	                array[i][j] = num++;
	            }
	        } else {
	        	//행이 홀수일 때
	            for (int j = array[i].length - 1; j >= 0; j--) {
	                array[i][j] = num++;
	            }
	        }
	    }

	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array[i].length; j++) {
	            System.out.print(array[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
