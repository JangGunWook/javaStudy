package festival30문제;

import java.util.Scanner;

public class ex02번 {
	public static void main(String[] args) {
		
		//2번
		//제한시간8분
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int money = 5000;
		if(time<=8) {
			money = money*time;  
		}else if(time>8) {
			money = (money*8) + (int)(money*1.5*(time-8));
		}
		
		System.out.println("총 입금은 " + money + "원 입니다");
	}

}
