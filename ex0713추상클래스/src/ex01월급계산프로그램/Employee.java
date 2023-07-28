package ex01월급계산프로그램;

public abstract class Employee {
   
   //1. 필드
	//접근제한자의 종류
	// - public
	// - private
	// - default : 동일한 패키지에서만 접근 가능
	// - protected : 1. 동일한 패키지거나 2. 상속관계에 있는 경우 접근가능
	
	protected String empno; // 사번
	protected String name; // 이름
	protected int pay; // 연봉
   
   
   //2.메소드
   
   //생성자
   public Employee(String empno, String name, int pay) {
      this.empno = empno;
      this.name = name;
      this.pay = pay;
   }
   
   //월급
   public abstract int getMoneyPay();
   
   //개인정보
   public String print() {
		return empno+" : "+name+" : "+pay ;
	}

}