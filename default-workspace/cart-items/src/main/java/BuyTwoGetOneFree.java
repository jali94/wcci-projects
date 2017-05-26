
public class BuyTwoGetOneFree extends CartItem {

	public BuyTwoGetOneFree(String name, int quantity, double pricePerUnit) {
		super(name, quantity, pricePerUnit);
	}

	@Override
	public double calculatePrice() {
		double totalPrice = 0;
		int times = quantity/3;
		int remeinderQty = quantity%3;
		
		//if no reminder this code is going to work
		if (quantity % 3 == 0) { 
			quantity = quantity - times;
			totalPrice = quantity * pricePerUnit;
			
			 //if there is reminder this code is going to work
		} else if (quantity % 3 != 0) {
			int newQuantity = quantity - remeinderQty;
			int newTimes = newQuantity/3;
			quantity = quantity - newTimes;
			totalPrice = quantity * pricePerUnit;
			
		}
		
		
		return totalPrice;
	}

}
