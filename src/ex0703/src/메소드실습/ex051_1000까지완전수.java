package 메소드실습;

public class ex051_1000까지완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex03완전수구하기 a = new ex03완전수구하기();
		ex051_1000까지완전수 b = new ex051_1000까지완전수() ;	//객체생성
		ex051_1000까지완전수 c;		//ex051_1000까지완전수를 참조하는 변수
		c=b;		//b가 가지고 있는 클래스
		
		
		System.out.println("1부터 1000까지의 완전수 : ");
		
		for(int i=1; i<=1000; i++) {
			if(a.isPerfect(i)==true) {
				System.out.print(i +" ");
			}
		}
		
	}

}
