package Question2;

public class TV {
	
	public static void main(String[] args) {
		TV t = new TV();
		t.channel = 7;
		t.color= "red";
		t.print();  //현재 Tv의 상태 출력
		t.channelUp();       
		t.channelUp();
		t.print();
		t.color= "black";
		t.channelDown();
		t.print();
	}

	//필드
	int channel;
	String color;
	
	
	//메서드
	public void print() {
		System.out.println("Tv의 현재 채널은 :"+ channel+"이고, Tv의 색깔은" + color +"입니다.");
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}

}
