package ex02조건문;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05마트계산대프로그램 {

	public static void main(String[] args) {
		//다음 마트계산대 프로그램입니다.
		//10000원 짜리 선물세트를 구입햇을 때 지불해야하는 금액을 계산해 보세요.
		// 단, 11개 이상 구매 시에는 전체 금액에서 10%할인이 적용됩니다.
		DecimalFormat decimalFormat = new DecimalFormat("#,###");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int product = sc.nextInt();
		
		int result = (int) (product*10000*0.9);
		String formattedNumber = decimalFormat.format(result);
		if(product >=11) {
			
			System.out.print("가격은 " + formattedNumber  + "입니다.");
		}else {
			
			System.out.print("가격은 " + formattedNumber + "입니다.");
		}
		

	}

}
