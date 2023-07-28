package 연습용;
import java.util.Scanner;
import java.util.Random;
public class 플러스게임 {


	public class ex03_dowhile {
	   public static void main(String[] args) {
	      Random ran = new Random();
	      Scanner sc = new Scanner(System.in);

	      String c = "Y";

	      do {
	         int r1 = ran.nextInt(9) + 1; // 1~
	         int r2 = ran.nextInt(9) + 1;
	         int sum = r1 + r2;

	         System.out.print(r1 + " + " + r2 + " = ");
	         int i = sc.nextInt();

	         if (i == sum) {
	            System.out.println("정답입니다!");
	         } else {
	            System.out.println("오답입니다.");
	            System.out.print("계속하시겠습니까? (Y/N): ");
	            c = sc.next();
	         }
	      } while (c.equals("Y")); //문자열 비교

	      System.out.println("프로그램을 종료합니다.");
	   }

	}
}