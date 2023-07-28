package 연습용;

public class 보너스6 {

	public static void main(String[] args) {
		

		System.out.println(powerN(2,4));
	}
	
	public static int powerN(int base, int n) {
		int result = 1;
		for(int i=0; i<n; i++) {
			result = result * base; 
		}
		return result;
		
	}
}
