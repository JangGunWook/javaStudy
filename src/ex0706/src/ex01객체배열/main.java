package ex01객체배열;

import java.awt.Point;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언 방법
		//자료형[] 변수명	= new 자료형[크기];
		// 포켓몬 데이터를 3개 저장 할 수 있는 bag 배열 생성
		
		Pokemon[] bag = new Pokemon[3];
		// Pokemon pika = new Pokemon("피카추","전기",500,5000,"백만볼트" );
		// bag[0] = pika;
		bag[0] = new Pokemon("피카추","전기",500,5000,"백만볼트" );
		
		System.out.println(bag); // --->배열의 이름을 불러줌
		System.out.println(bag[0]);// [0] --> 배열의 0번인덱스에 접근하겠다.
								//			  Pokemon객체 안으로 접근한다.
		System.out.println(bag[0].getSkill());// getSkil() --> skill 필드값을 가져오겠다.
		
		//★객체배열에서는 --> 참조의 참조개
		// ★참조할때마다 접근하는 방식
		// --->배열의 값에 접근 []
		//
				
		
		
		
		ArrayList<Pokemon> bagg = new ArrayList<>();
		bagg.add(new Pokemon("피카추","전기",500,5000,"백만볼트"));
		
		System.out.println(bagg.get(0));
		
		
	}

}
