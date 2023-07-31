package festival30문제;

public class ex22번_공포의별찍기 {
	public static void main(String[] args) {
		
		// 22번
		// 17분
		
		for(int i=1; i<=5;i++) {
			for(int j=1; i<5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
