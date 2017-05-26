
public abstract class CartItem {
	String name;
	int quantity;
	double pricePerUnit;

	//contructor
	public CartItem(String name, int quantity, double pricePerUnit) {
	
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	
	//abstract method
	public abstract double calculatePrice();
	
	
}
