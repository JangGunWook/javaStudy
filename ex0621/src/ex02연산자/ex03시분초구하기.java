package ex02연산자;

import java.util.Scanner;

public class ex03시분초구하기 {

	public static void main(String[] args) {
		
		
		//초를 입력 받아[시,분,초]형태로 출력하세요
		//1시간 : 3600초
		//1분 : 60초
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
		int h = totalSecond/3600;
		totalSecond -= (h*3600);
		int m = totalSecond/60;
		totalSecond -= (m*60);
		int s = totalSecond;
		
		
		System.out.print(h +"시"+m+"분"+s+"초");
		
				//★짝꿍의 코드
				//h = totalSecond/3600;
				//m = totalSecond/60%60;
				//s = totalSecond%60%60;
	
	}

}
