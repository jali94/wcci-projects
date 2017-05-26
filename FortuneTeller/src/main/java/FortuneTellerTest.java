import java.util.Scanner;

public class FortuneTellerTest {

	public static void main(String[] args) {
		
		String firstName = "Me";
		String lastName = "You";
		int age = 0;
		int numOfSiblings = 0;
		String birthMonth = "may";
		String color = "Red";
		int retireYears = 0;
		double retirementFund = 0.0d;
		String vacationHome = "Panama";
		String transportation = "VAN";
		String playAgain = " ";
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME TO THE FORTUNE TELLER APP.\n\n\n");
		
		
		do {
			System.out.println("What is your first name?");
			firstName = scanner.next();
			
			System.out.println("What is your last name?");
			lastName = scanner.next();
			
			System.out.println("How old are you?");
			age = scanner.nextInt();
			
			System.out.println("How many Siblings do you have?");
			numOfSiblings = scanner.nextInt();
			
			System.out.println("In what month you were born?\n\n"
					+ "please enter full month name:"
					+ "\n january\tfebruary\tmarch"
					+ "\napril\tmay\tjune"
					+ "\n july\taugust\tseptember"
					+ "\noctober\tnovember\tdecember");
			birthMonth = scanner.next().toLowerCase();
			
			System.out.println("Which of the ROYGBIV color is your favourite?\n "
							+ "if you dont know what ROYGBIV is, enter \"Help\"");
			color = scanner.next().toUpperCase();
			
			
			//if user's AGE is an ODD number or EVEN number
			if (age % 2 == 0) {
				retireYears = 20;
			}else {
				retireYears = 30;
			}
			
			//if user's number of siblings
			if(numOfSiblings == 0) {
				vacationHome = "Texas";
			}else if (numOfSiblings == 1) {
				vacationHome = "Westerville";
			}else if (numOfSiblings == 2) {
				vacationHome = "Columbus";
			}else if (numOfSiblings == 3) {
				vacationHome = "Toronto";
			}else if (numOfSiblings > 3) {
				vacationHome = "Atlanta";
			}
			
			//Depending on user's ROYGBIV
			switch (color) {
			case "HELP":
				System.out.println("\n Please enter a letter of your Favourite Color"
						+ " \nR for Red \nO for Orange \nY for Yellow"
						+ "\nG for Green \nB for Blue \nI for Indigo \nV for Violet");
				color = scanner.next().toUpperCase();
				
				//compares the color user choose on a help menu.
				 if (color.equals("R")) {
					 transportation = "Submarine";
				 }else if (color.equals("O")) {
					 transportation = "G6 Jet";
				 }else if (color.equals("Y")) {
					 transportation = "Honda Civic";
				 }else if (color.equals("G")) {
					 transportation = "Lamborghini";
				 }else if (color.equals("B")) {
					 transportation = "Electric Train";
				 }else if (color.equals("I")) {
					 transportation = "Alladins flying rug";
				 }else if (color.equals("V")) {
					 transportation = "Toyota Camry";
				 }else{
					 transportation = "Public transportation";
				 }
				
				break;
				
			case "R": transportation = "Submarine";
			break;
				
			case "O": transportation = "G6 Jet";
			break;
			
			case "Y": transportation = "Honda Civic";
			break;
			
			case "G": transportation = "Lamborghini";
			break;
			
			case "B": transportation = "Electric Train";
			break;
			
			case "I": transportation = "Alladins flying rug";
			break;
			
			case "V": transportation = "Toyota Camry";
			break;
			
			default: transportation = "Public transportation";
				break;
			}
			
			//if first, second or third letter 
			//of a birth month is contained in either first name or last name
			
			String fullName = firstName + lastName;
		
			if(fullName.contains(birthMonth.substring(0,1))) {
				retirementFund = 1000000;
			}else if(fullName.contains(birthMonth.substring(1,2))){
				retirementFund = 2000000;
			}else if(fullName.contains(birthMonth.substring(2,3))){
				retirementFund = 3000000;
			}else{
				retirementFund = 500000;
			}
			
			
			
			System.out.println("\n\n" + firstName + " " + lastName + " here is your FORTUNE\n"
					+ "You will retire in " + retireYears + " Years\n"
					+ "with $ " +  retirementFund + " in the bank\n"
					+ "A vacation home in " + vacationHome + " and a " + transportation + ".\n\n");
			
			System.out.println("Would you like to Continue? "
					+ "Enter Y to continue or enter any Key to quit.");
			playAgain = scanner.next();
			
			
		}while(playAgain.equalsIgnoreCase("Y"));
		System.out.println("Thanks for using Fortune Teller");
		
		scanner.close();
		
	}

}