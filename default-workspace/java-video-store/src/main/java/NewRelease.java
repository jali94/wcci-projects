 import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title, String priceCode) {
		super(title, priceCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPriceCode() {
		return "New Release";
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal feePerDay = new BigDecimal("3.00");
		BigDecimal totalFees = rentalDays.multiply(feePerDay);
		
		return totalFees;
	}

}
