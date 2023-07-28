
public class Restaurant extends Store {

	// 1. 필드
	double service;
	double flavor;
	double clean;

	
	
	//2. 메서드
	//생성자
	public Restaurant(String name,String event, double Service, double price, double flavor, double clean) {
		super.name = name;
		super.event = event;
		super.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}
	
	
	public double grade() {
		return (service + flavor + clean + price)/4;
	}
	
	
}
