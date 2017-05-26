import java.math.BigDecimal;

public class Rental {
	Movie rented;
	int days;
	
	public Rental(Movie rented, int days) {
		this.days = days;
		this.rented = rented;
	}
	
	public BigDecimal calculateFees() { //make this work to return fees of bigdecimal type
		BigDecimal fees = rented.calculateFees(days);
		return fees;
	}
	
	public String getTitle() {
		return rented.title;
	}
	
	public String getPriceCode() {
		return rented.priceCode;
	}

}
