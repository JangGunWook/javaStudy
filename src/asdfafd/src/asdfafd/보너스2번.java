package festival30문제;

public class 보너스2번 {

	public static void main(String[] args) {
		
		//보너스 2번
		// 10분
		
		
		System.out.println(getMiddle("test"));
		
	}
	
	public static String getMiddle(String word) {
		
		
		String[] array = word.split("");
		
		if(array.length%2==0) {
			
			int i = array.length/2;
			return array[i-1] + array[i];
		}else {
			int i = array.length/2;
			return array[i];
		}
		
		
	}

}
