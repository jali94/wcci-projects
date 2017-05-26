
public class PerPound extends CartItem {

	public PerPound(String name, int quantity, double pricePerUnit) {
		super(name, quantity, pricePerUnit);
	}

	@Override
	public double calculatePrice() {
		
		return ((quantity/16) * pricePerUnit);
	}

}
