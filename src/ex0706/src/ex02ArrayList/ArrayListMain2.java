package ex02ArrayList;

import java.util.ArrayList;

import ex01객체배열.Pokemon;

public class ArrayListMain2 {

	public static void main(String[] args) {
		
		// 1. 포캣몬 자료형들을 저장할 수 있는 가변적인 배열 list 생성
		ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		
		// 2. list 데이터 추가하기
		// --> 뮤즈, 정신, 500, 5000, "스킬1
//		Pokemon m = new Pokemon("뮤즈", "정신", 500, 5000, "스킬1");
//		list.add(m);
		list.add(new Pokemon("뮤즈", "정신", 500, 5000, "스킬1" ));
		
		// 3. list에 0번째 방에 저장되어 있는 포케몬의 이름과 타입을 출력해주세요.
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getType());
		
		// 4. list의 0번째 방의 이름 뮤즈를 장건욱으로 바꿔보기!
		list.get(0).setName("장건욱");
		System.out.println(list.get(0).getName());
		
		
	}

}
