import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title, String priceCode) {
		super(title, priceCode);
	}

	@Override
	public String getPriceCode() {
		return "Children";
	}

	@Override
	public BigDecimal calculateFees(int days) {
		
		BigDecimal fee = new BigDecimal("1.50");
		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			fee = fee.add(new BigDecimal("1.50").multiply(extraDays));
		}
		
		return fee;
	}

}
