import java.util.ArrayList;

public class StoreController {

	ArrayList<Restaurant> res = new ArrayList<Restaurant>();
	
	ArrayList<Salon> sal = new ArrayList<Salon>();
	
	public StoreController() {
		res.add(new Restaurant("해성식당","식당", 75.0, 75.0, 75.0, 75.0));
		res.add(new Restaurant("정림이네","식당",95.0,75.0,65.0,80.0));
		res.add(new Restaurant("왕뼈사랑","식당",80.0,75.0,82.0,72.0));
		
		sal.add(new Salon("박승철", "미용", 52.0, 70.0, 80.0));
		sal.add(new Salon("이가자", "미용", 55.0, 76.0, 50.0));
		sal.add(new Salon("리안", "미용", 53.0, 88.0, 70.0));
	
	}
	
	
	
	
	
	
	
	
	
}
