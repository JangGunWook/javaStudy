package ex02ArrayList;

import java.lang.ref.Reference;
import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//collection의 한종류인 ArrayList
		// - 가변적인 크기를 가지고 있다.
		// - 객체 자료형만 저장가능하다.
		// - 클래스(레퍼런스)형태로만 사용가능하다!!!
		
		// 1. ArrayList 생성하는 방법
		// : ArrayList는 자료구조 그 자체는 아니다.
		//   자료구조처럼 사용할 수 있게 설계되어있는 클래스 파일
		// ArrayList<자료형> 변수명 = new ArrayList<생략가능>();
		ArrayList<String> list = new ArrayList<String>();
		
		// ★ <자료형> : 제네릭 기법
		// --> 클래스 내부에서 사용할 자료형(데이터 타입)을 외부에서 지정하는 기법
		
		// 2. ArrayList에 데이터 추가하기
		list.add("유부초밥");
		list.add("두부카레");
		list.add("치킨마요");
		
		// 3. ArrayList에 있는 데이터를 가져오기
		System.out.println(list.get(2)); 
		
		// 4. arrayList에 데이터 삭제하기
		list.remove(1);
		System.out.println(list.get(1));
		
		// 5. ArrayList에 데이터 특정 위치에 추가하기
		list.add(1, "육회비빔면");
		System.out.println(list.get(1));
		
		// 6. ArrayList에 데이터 전부 삭제하기
		list.clear();
		
		// 7. ArrayList의 크기를 확인하기
		System.out.println(list.size());
		
	
	
	}

}
