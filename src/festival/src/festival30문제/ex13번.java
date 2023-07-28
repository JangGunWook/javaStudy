package festival30문제;

public class ex13번 {

	public static void main(String[] args) {
		//13번
		//15분
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] array = score.split(",");
		
		int A =0;
		int B =0;
		int C =0;
		int D =0;
		int F =0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i].equals("A")) {
			A++;	
			}else if(array[i].equals("B")) {
				B++;
			}else if(array[i].equals("C")) {
				C++;
			}else if(array[i].equals("D")) {
				D++;
			}else {
				F++;
			}
		}
		System.out.println("A : " + A);
		System.out.println("B : " + B);
		System.out.println("C : " + C);
		System.out.println("D : " + D);
		System.out.println("F : " + F);
	}

}
