import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet elephant = new VirtualPet();
		Scanner input = new Scanner(System.in);
		int userChoice = 0;
		
		elephant.elephant();
		
		elephant.tick();
		
		System.out.println("\n\nHorace the elephant\nhunger: " + elephant.getHunger()
		+ "\nLazy: " + elephant.getLazy() + "\nDirty: " + elephant.getDirty() + "\nBored: " 
		+ elephant.getBored() + "\n\n");
	
		//ask for user Input now
		System.out.println("What do you want to Do?\n1. Feed Elephant\n2. Pet the Elephant"
				+ "\n3. Give bath to Elephant\n4. Do nothing and Run Away\n\n");
		
	
		userChoice = input.nextInt();
		switch (userChoice) {
		case 1: 
			if (elephant.getHunger() <= 6) {
				System.out.println("The pet is full ma nigga");
			}else {
				elephant.feed();
				System.out.println("Thank you, You Fed the Elephant");
				
				if (elephant.getHunger() <= 6) {
					System.out.println("The pet is full you dont have to Feed him");
				}else {
					elephant.feed();
					System.out.println("Thank you, You Fed the Elephant");
				}
			}
			break;
			
		case 2: 
			if (elephant.getHunger() <= 6) {
				System.out.println("The pet Is Lazy Now So Stop Petting Him Man");
			}else {
				elephant.feed();
				System.out.println("Thank you, The Elaphant Is Happy Now");
				
				if (elephant.getHunger() <= 6) {
					System.out.println("The pet is Lazy Now So Stop Petting Him Man");
				}else {
					elephant.feed();
					System.out.println("Thank you, The Elaphant Is Happy Now");
				}
			}
			break;

		
		case 3: 
			if (elephant.getHunger() <= 6) {
				System.out.println("The pet is Clean Now");
			}else {
				elephant.feed();
				System.out.println("Thank you, You Cleaned His Dirty Tustk");
				
				if (elephant.getHunger() <= 6) {
					System.out.println("The pet is Clean Now");
				}else {
					elephant.feed();
					System.out.println("Thank you, You Cleaned His Dirty Tusk");
				}
			}
			break;
	
		
		case 4: 
			if (elephant.getHunger() <= 6) {
				System.out.println("This Elaphant Is Gonna Crush You Man");
			}else {
				elephant.feed();
				System.out.println("Watch Out Before You Get Smacked With The Tusk");
				
				if (elephant.getHunger() <= 6) {
					System.out.println("The Elaphant Is Gonna Crush You Man");
				}else {
					elephant.feed();
					System.out.println("Walk Out Before You Get Smacked With The Tusk");
				}
			}
			break;
		
		
		default:
			System.out.println("You had a wrong choice");
			break;
		}
		
		System.out.println("\n\nNow the Elephant is\nhunger: " + elephant.getHunger()
		+ "\nLazy: " + elephant.getLazy() + "\nDirty: " + elephant.getDirty() + "\nBored: " 
		+ elephant.getBored() + "\n\n");
	}

}
