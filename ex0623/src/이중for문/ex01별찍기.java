package 이중for문;

public class ex01별찍기 {

	public static void main(String[] args) {

		// 별찍기(3행*5열)
		// *****
		// *****
		// *****

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
