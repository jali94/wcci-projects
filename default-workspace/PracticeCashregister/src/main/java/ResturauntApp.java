
public class ResturauntApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double customerCash = 53.76;
		PracticeCashRegister register = new PracticeCashRegister (23.00);
		register.addMoney(customerCash);
		double balance = register.getBalance();
		System.out.println(balance);
	}

}
