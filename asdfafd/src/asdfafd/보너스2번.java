package festival30����;

public class ���ʽ�2�� {

	public static void main(String[] args) {
		
		//���ʽ� 2��
		// 10��
		
		
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
