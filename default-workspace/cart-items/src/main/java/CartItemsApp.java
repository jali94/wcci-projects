import java.util.ArrayList;
import java.util.Scanner;

public class CartItemsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CartItem> itemsList = new ArrayList<>();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("What's the name of this item?");
			String name = sc.next();
			System.out.println("What's the quantity of " + name + "?");
			int quantity = sc.nextInt();
			System.out.println("What is the price per unit of each item?");
			double pricePerUnit = sc.nextDouble();
			sc.nextLine();
			System.out.println("How is " + name + " priced- Per item? or Per Pound? or Buy 2 get 1 free?");
			String howPriced = sc.nextLine();
            
			if(howPriced.contains("Per item".toLowerCase())){
				itemsList.add(new PerItem(name, quantity, pricePerUnit));
			}
			if(howPriced.contains("Per Pound".toLowerCase())){
				itemsList.add(new PerPound(name, quantity, pricePerUnit));
			}
			if(howPriced.contains("Buy Two get One Free".toLowerCase())){
				itemsList.add(new BuyTwoGetOneFree(name, quantity, pricePerUnit));
			}
			
			
			System.out.println("Do you want to continue? (Enter quit to stop)");
			String continueChoice = sc.next();
			if(continueChoice.equalsIgnoreCase("Quit")){
				System.out.println("Good bye");
				break;
			}
		}
	
		
	}
}
