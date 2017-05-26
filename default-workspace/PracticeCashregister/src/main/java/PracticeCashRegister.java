public class PracticeCashRegister {
    private double balance; 
    
    public PracticeCashRegister(double startingBalance) {
        balance = startingBalance;
    }
    public void addMoney(double addAmount) {
        balance = balance + addAmount;
    }


    public double getBalance() {
        return balance;
    }
}