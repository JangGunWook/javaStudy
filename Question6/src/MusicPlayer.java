import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MusicController a = new MusicController();
		
		System.out.println("====뮤직 플레이어====");
		while(true) {
		System.out.print("1.등록 2.목록 3.삭제 4.전체삭제 5.종료 >>");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.print("제목 : ");
			String title = sc.next();
			
			System.out.print("가수 : ");
			String singer = sc.next();
			
			System.out.print("시간 : ");
			int playtime = sc.nextInt();
			
			
			a.playlist.add(new MusicVo(title, singer, playtime));
			
			
			
			
			
		}else if(num==2) {
		System.out.println("==노래목록==");
		for(int i =0; i<a.playlist.size();i++) {
			System.out.print((i+1) + ".제목 : " + a.playlist.get(i).getTitle() + "\t");
			System.out.print("가수 : " + a.playlist.get(i).getSinger() + "\t");
			System.out.print("시간 : " + a.playlist.get(i).getTitle() + "\t");
			System.out.println();
			
		}
		
		
			
		
		}else if(num==3) {
			System.out.println("====노래삭제====");
			System.out.println("삭제하고 싶은 노래 번호 입력 : ");
			int dele = sc.nextInt();
			System.out.println(a.playlist.get(dele-1).title + "노래를 삭제합니다.");
			a.playlist.remove((dele-1));
			
			
		}else if(num==4) {
			System.out.println("====전체노래삭제====");
			a.playlist.clear();
			
		}else if(num==5) {
			break;
			
		}
	
		
		}
		}

}
