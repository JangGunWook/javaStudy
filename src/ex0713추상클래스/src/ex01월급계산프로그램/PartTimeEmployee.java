package ex01월급계산프로그램;

public class PartTimeEmployee extends Employee {
	
		// 1. 필드
	
		//일수
		private int workDay;

	
		//2. 메소드
		//생성자
		public PartTimeEmployee(String empno, String name, int pay, int workDay) {
			super(empno, name, pay);
			this.workDay = workDay;
		}  
		
		//월급
		public int getMoneyPay() {
			return pay*workDay;
		}
		
	
		
		
	

}
