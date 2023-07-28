package MVC;

public class MemberDTO {
	
	
	// 1. 필드
	private String id;    // 아이디
	private String pw;    // 패스워드
	private String name;  // 이름
	
	// 2. 메소드
	// 모든 필드값을 채우는 생성자 메소드, setter, getter
	
	
	public MemberDTO(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
