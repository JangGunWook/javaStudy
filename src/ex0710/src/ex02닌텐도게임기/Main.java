package ex02닌텐도게임기;

public class Main {

	public static void main(String[] args) {
	
		//실행하는 곳, 닌텐도 게임기
		// 두가지 방법 : 
		// 1. Mario가 Dongmul과 Zelda를 상속
		// 2. Mario의 형태로 Zelda, Dongmul로 인스턴스한다!
		
		Mario ma = new Mario( );
		playGame(ma);
		
		Zelda dong = new Zelda();
		playGame(dong);
		
		Dongmul zel = new Dongmul();
		playGame(zel);
		

	}
	
	// 게임을 실행시키기
	//메소드 오버로딩방식으로 문제해결 방법
	// --> 게임칩을 추가할 때마다 메소드 하나씩 다시 생성
//	private static void playGame(Zelda zel) {
//		zel.start();
//	}
//	private static void playGame(Dongmul dong) {
//		dong.start();
//	}
//	
//	
	private static void playGame(GameChip ma) {
		ma.start();
	}
	
	

}
