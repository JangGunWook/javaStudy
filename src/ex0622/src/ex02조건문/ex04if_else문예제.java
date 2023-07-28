package ex02조건문;

import java.util.Scanner;

public class ex04if_else문예제 {

	public static void main(String[] args) {
		// 다음은 에버랜드 입장료 계산 프로그램입니다.
		// 기본료는 5,000원이며 인원수에 따라 지불해야하는 프로그램을 만들어 보세요.
		// 단, 20세 미만인 경우 50%할인이 적용됩니다.
		
		System.out.println("====에버랜드에 오신 걸 환영합니다====");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int count = sc.nextInt();
		
		if(age<20) {
			System.out.println("총" + 2500*count+"원입니다.");
		}else {
			System.out.println("총" + 5000*count+"원입니다.");
		}
		
		//★★★★★지역변수(local variable)★★★★
		// : 즉, 영역 안에서 선언된 변수는 해당하느 영역을 벗어나서 사용할 수 없다.
	}

}
