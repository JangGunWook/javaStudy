package 학생관리프로그램;

public class Pokemon {

	
	// 포캣몬 자료형
	// 1. 필드
	// 이름
	private String name;
	// 타입	
	private String type;
	// 공격력
	private int atk;
	// 체력
	private int hp;
	// 스킬
	private String skill;
	
	
	// 2. 메소드
	// 생성자
	public Pokemon(String name, String type, int atk, int hp, String skill) {
		super();
		this.name = name;
		this.type = type;
		this.atk = atk;
		this.hp = hp;
		this.skill = skill;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	
	
}
