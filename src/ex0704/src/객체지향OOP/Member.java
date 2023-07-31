package 객체지향OOP;

public class Member {
		//클래스 : 객체를 생성하기 위해서 만든 설계도면
		//1. 필드(field, 속성, Data)
		// 이름
		String name;
		
		// 전화번호
		String phone;
		// 알림
		boolean alarm;
		// 이메일
		String email;
		// 나이
		int age;
		
		//getter/setter만들기
		// ctrl + shift + S
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public boolean isAlarm() {
			return alarm;
		}
		public void setAlarm(boolean alarm) {
			this.alarm = alarm;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

	
		
		
		//2. 메소드(Method, Logic, 행위)
		/*
		 * 다른 파일에서 해당하는 메소드를 사용할 거기 때문에, 접근제한자를 public으로 둔다
		 * static 키워드를 쓰지 말자
		 */
		//메세지 보내기
		public void sendMessage() {
			System.out.println("메세지 보내기");
		}
		// 송금하기
		public void sendMoney(int money) {
			System.out.println(money + "원을 보냅니다!");
		}
		
		
		
		
}
