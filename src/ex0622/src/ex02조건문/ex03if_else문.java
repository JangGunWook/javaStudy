package ex02조건문;

public class ex03if_else문 {

	public static void main(String[] args) {
		
		// if_else문
		// if(조건식) {
		//		조건식이 참인 경우 실행할 문장
		// }else{
		//		조건식이 거짓인 경우 실행할 문장
		// }
		
		int age = 20;
		// age가 20이상인 경우에는 성인입니다. 출력
		// 그렇지 않은 경우에는 미성년자입니다. 출력
		
		if(age >= 20) {
			System.out.println("성인입니다!");
		} else {
			System.out.println("미성년자입니다!");
		}
		
	}
}
