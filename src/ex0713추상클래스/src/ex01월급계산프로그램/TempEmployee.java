package ex01월급계산프로그램;

public class TempEmployee extends Employee{
	
	// 1. 필드

	

	
	
	//2. 메소드
	
	//생성자
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}  
	
	//월급
	public int getMoneyPay() {
		return pay/12 ;
	}
	
	
	
	

}
