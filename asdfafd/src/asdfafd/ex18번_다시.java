package festival30문제;

import java.util.Random;

public class ex18번_다시 {

	public static void main(String[] args) {
		
		//18번
		//15분

		Random ran = new Random();
		int[] array = new int[6];
		
		for(int i=0; i<6; i++) {
			array[i] = ran.nextInt(40)+1;
			for(int j=0; j<i; j++) {	//비교대상할 인덱스 번호를 만들기
				if(array[i]==array[j]) {
					i--;
				}
			}
			
		}
		for(int i = 0; i<6; i++) {
			System.out.println("행운의 숫자 : " + array[i]);
		}

	}

}
