package 배열기초;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class ex01배열선언하기 {

	public static void main(String[] args) {

		// 배열(자료구조)
		// : 같은 타입의 여러 젼수를 하나의 묶음으로 다루는 자료구조

		// 1) 배열의 선언방법
		// 자료형 + [] + 변수명 = new 자료형 [배열의 크기];
		// 정수형 데이터 10개를 저장할 수 있는 배열 array 하나 생성

		int[] array = new int[10];

		// int array[] = new int[10];

		System.out.println(array); // 주소값 출력!

		// array -> 10칸짜리 배열이 어디 있는지
		// 주소값을 참조하는 "레퍼런스 변수"이다!

		// 10칸짜리 배열에는 각각 데이터를 저장하는 공간을 가리키는
		// 방번호가 존재한다. ----> index(0부터 시작한다.)

		// 2) 배열의 실제 데이터에 접근한느 방법
		// : 레퍼렌스변수명[index번호]
		// array의 0번 인데스 데이터를 출력해주세요.
		System.out.println(array[0]); // int의 기본값 0이 출력된다!

		// 3) 배열안에 데이터를 변경하는 방법
		// array 0번방의 데이터를 4로 변경
		array[0] = 4;
		System.out.println(array[0]); // 출력값 4

		// array라는 배열안에 들어가는 데이터를
		// 1 ~ 10까지의 랜덤한 값으로 모두 변경

		Random ran = new Random();

		array[0] = ran.nextInt();// index0번에 랜덤값 집어넣기
		System.out.println(array[0]);
		System.out.println();
		
		// 랜덤한 숫자(1~9까지) 집어넣기
		for (int i = 0; i < array.length; i++) { 
			array[i] = ran.nextInt(10) + 1;
			System.out.print(array[i]);
		}
		// 배열의 크기(길이)를 가져오는 방법 : array.length
			array[10] = 7;
			
		//java의 배열의 특징	
		// 1) 같은 자료형끼리만 저장 가능하다.
		// 2) 배열의 크기는 고정적이다.
		// 3) 배열은 인덱스 번호(방번호)를 가지고 있으며, 0부터 시작한다.
		//	  -----> 인데스 번호는 순차적으로 1씩 증가한다.
		//	  -----> 반복문 for문과 사용하며 편리하게 쓸 수 있다.
		
		System.out.println("\n\n\n\n\n\n");
		System.out.println(Arrays.toString(array));	// 배열전체 출력방법
		
		ArrayList<String> list = new ArrayList<>();	// arrayList선언
		
		list.add("tqda");		//arrayList 변수에 추가방법
		System.out.println(list.get(0));
		
	}

}
