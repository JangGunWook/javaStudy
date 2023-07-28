package ex01월급계산프로그램;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		//regular
		employee.add(new RegularEmployee("SMHRD001","홍O동",4000,400));
		//temp
		employee.add(new TempEmployee("SMHRD002","박O수",3000));
		//partTime
		employee.add(new PartTimeEmployee("SMHRD003","김O독",10,10));
		
		//for-each문
		// for(자료구조에서 하나씩 꺼내오는 타입과 변수명:순서가 있는 자료구조)
		for(Employee e: employee) {
			System.out.println(e.print());
			System.out.println(e.getMoneyPay());
		}
	
	}

}
