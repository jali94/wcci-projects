import java.util.Scanner;

public class easyWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		String weight;
		double earthweight, venus, mars, jupiter, saturn, uranus, neptune;
		
		earthweight = keyboard.nextDouble();
		venus = (earthweight * .78 );
		mars = (earthweight * .39);
		jupiter = (earthweight * 2.65);
		saturn = (earthweight * 1.17);
		uranus = (earthweight * 1.05);
		neptune = (earthweight * 1.23);
		
		System.out.println(" Please enter your current earth weight: ");
		weight = keyboard.next();
		System.out.println(" I have information for the following planets: ");
		System.out.println(" 1. Venus____2. Mars___ 4. Jupiter___4. Saturn____5. Uranus____6. Neptune ");
		System.out.println(" Which planet are you visiting? ");
		keyboard.nextDouble();
		System.out.println(" Your weight would be" + earthweight + " on that planet");
				
		
		
		
		
		

		}
	}

