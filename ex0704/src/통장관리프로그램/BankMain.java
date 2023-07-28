package 통장관리프로그램;

public class BankMain {

	public static void main(String[] args) {
		
		//1. BankBook 클래스를 기반으로 bank라는 객체 생성
			Bankbook bank = new Bankbook();
		//2. bank객체의 잔에 1500원 입금
			bank.deposit(1500);
		//3. bank객체의 잔액을 출력
			System.out.println("잔액 : " + bank.showMoney() + "원");
		//4. bank객체의 잔액에서 700원 출금
			bank.withdraw(700);
		//5. bank객체의 잔액을 출력
			System.out.println("잔액 : " + bank.showMoney() + "원");

	}

}
