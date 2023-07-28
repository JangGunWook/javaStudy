package while문;

public class ex01while문기초 {
		public static void main(String[] args) {
			
			//while문 구조
			// hello world 5번 출력하는 코드 작성 해보기
		
			/*
			int i = 0;
			while(i<5) {
				System.out.println("hello world");
				i++;
			}
			*/
			
			//while문 두번째 방법
			
			int num = 0;
			while(true) {
				System.out.println("두번째 방법");
				num++;
				if(num>4) {
					break;
				}
			}
			
			
		}
		
			
}
