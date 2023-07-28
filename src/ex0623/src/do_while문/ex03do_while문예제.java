package do_while문;

import java.util.Random;
import java.util.Scanner;

public class ex03do_while문예제 {

	public static void main(String[] args) {
		
		// 1. 랜덤으로 정수 2개를 뽑아 문제를 출력하세요.
		// 2. 사용자로부터 두 수의 합을 입력받으세요.
		// 3. 
		
		// ★★★★★★ 랜더한 수 생성한는 방법!
		Random ran = new Random();

		//10미만으로 출력!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==Plus Game==");
		
		do {
			int ranNum1 = ran.nextInt(10)+1;		//10미만으로 출력!
			int ranNum2 = ran.nextInt(10)+1;
			
			System.out.print(ranNum1+"+"+ranNum2+"= ");
			int input = sc.nextInt();
			
			if(ranNum1+ranNum2 == input) {
				System.out.println("Success");
			}else {
				System.out.println("Fail");
				System.out.print("계속하시겠습니까? >>");
				String answer = sc.next();
				if(answer.equals("N")) {		// String은 기본형이 아닌 특이한 데이터타입
					break;						// 그래서 비교하기 위해서.equals()사용
				}
			}
		}while(true);
		System.out.println("종료하겠습니다!!");
		
		
	}

}
