
public class PerItem extends CartItem {

	public PerItem(String name, int quantity, double pricePerUnit) {
		super(name, quantity, pricePerUnit);
	}

	@Override
	public double calculatePrice() {
		
		return quantity * pricePerUnit;
	}

}

