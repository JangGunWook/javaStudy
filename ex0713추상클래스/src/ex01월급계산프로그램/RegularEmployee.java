package ex01월급계산프로그램;

public class RegularEmployee extends Employee{

	// 1. 필드
	
	//보너스
	private int bonus;  
	
	
	// 2. 메소드
	
	//생성자
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		
		this.bonus = bonus;
	}

	// 월급계산
	public int getMoneyPay() {
		return (pay+bonus)/12 ;
	}
	
	//개인정보
	
	
	
}
