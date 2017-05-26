
public class CookerApp {

	public static void main (String[] args) {
		
		
	Cooker myCooker = new Cooker();
		myCooker.cook();
		
		Cooker myGrill = new Grill(); 
		myGrill.cook();
		
		Cooker myPizzaOven = new PizzaOven();
		myPizzaOven.cook();
		
		Cooker myStove = new Stove();
		myStove.cook();
		
		
		System.out.println("*************************");
		System.out.println("Let the kitchen manager handle the cooking");
		KitchenManager manager = new KitchenManager();
		Cooker kmPizzaOven = new PizzaOven();
		Grill kmGrill = new Grill();
		
		
		manager.handleCooking(kmGrill);
		manager.handleCooking(kmPizzaOven);
		
	}
}
