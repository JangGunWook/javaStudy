import java.util.Scanner;

public class Main {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	 StoreController a = new StoreController();
	 while(true) {
		 System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >>");
		 int num = sc.nextInt();
		 if(num==1) {
			 System.err.println("====음식점보기=====");
			 for(int i =0; i<a.res.size(); i++) {
				 System.out.print((i+0) +". " + a.res.get(i).name);
				 System.out.println("\t 평점 : " + a.res.get(i).grade());
			 }
			 
		 }else if(num==2) {
			 System.err.println("====미용실보기=====");
			 for(int i =0; i<a.res.size(); i++) {
				 System.out.print((i+0) +". " + a.sal.get(i).name);
				 System.out.println("\t 평점 : " + a.sal.get(i).grade());
			 }
		 }
	 }
}

}
