package 배열기초;

import java.util.Random;

public class ex05배열_로또 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언하세요.
		// 2. 배열 안으 ㅣ데이터를 모두 임의의 값으로 초기화 하세요(1~10까지의 수)
		// 3. 단, 배열에 중복된 값을 제거해주세요.
		// 4. 배열 안의 데이터를 모두 출력해주세요.

		Random ran = new Random();

		System.out.println("=====로또 타임=====");
		System.out.println("이번주 출력번호는요.....!!두구두구두구!!");
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {	// 값이 같다면
					array[i] = ran.nextInt(10) + 1;//새로운 값으로 넣어줌
					i--;		//이전 인덱스로 가서 검사시키기 위해 i--시킨다.
					break;		// break는 중값이 찾아지면 다시 j의 for문으로
								// 돌아가서 굳이 하지 않아도 되는 계산을 하지 않는다
								// break, continue는 중괄호 안에 있는 
								//가장 가까운 for문을 중단 혹은 되돌아간다!
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
