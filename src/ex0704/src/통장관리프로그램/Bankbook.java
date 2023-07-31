package 통장관리프로그램;

public class Bankbook {
	
	// 내가 설계하는 나만의 자료형
	
	// 1. 필드(데이터, 속성)
	// 정수형 money(잔액)
		private int money;	//private : 클래스 설계도면에 존재하는 데이터를 함부로 접근 제한걸어버림
		
	
	// 2. 메소드(행위, 로직)
	// 리턴타입 X, 매개변수로 정수형 데이터를 하나 받아오는 deposit(입금) 메소드 생성
		public void deposit(int money) {
			this.money += money;
			// this 키워드 : 내가 가지고 있는 클래스의 변수를 의미함
		}
	// 리턴타입 X, 매개변수로 정수형 데이터를 하나 받아오는 withdraw(출금) 메소드 생성
		public void withdraw(int money) {
			//잔액보다 출금금액이 크면 출금이 불가능하게 만들기!!
			if(this.money>=money) {	
				this.money -= money;
			}else {
				System.out.println("잔액이 부족합니다!");
			}
			
		}
	// 리턴타입 정수형, 매개변수는 없는 showMoney(잔액조회) 메소드 생성
		public int showMoney() {
			
			return money;
			
		}
}
