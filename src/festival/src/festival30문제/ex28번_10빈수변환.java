package festival30문제;

public class ex28번_10빈수변환 {

	public static void main(String[] args) {
		// 28번
		// 30분
		
		String str = "01001101";
		
		String[] array = str.split("");
		
		int num = 1;
		int sum = 0;
		for(int i = (array.length)-1; i>0; i-- ) {
			sum += Integer.parseInt(array[i]) * num;	// integer.parseInt() : 정수로 전환
			num *=2;
		}
		System.out.println(sum);
		

	}

}
