
import java.math.BigDecimal;

public abstract class Account {

	protected BigDecimal balance;
	protected BigDecimal interestRate;
	
	public Account(BigDecimal startingBalance) {
		balance = startingBalance;
	}
	
	// this indicates that all subclasses must implement this method
	public abstract String getAccountType();
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void update() {
		BigDecimal interest = balance.multiply(interestRate);
		balance = balance.add(interest);
		
		//fix the rounding
		balance = balance.setScale(2, BigDecimal.ROUND_HALF_UP);
	}

	public void deposit(BigDecimal amountToDeposit) {
		balance = balance.add(amountToDeposit);
	}
}
