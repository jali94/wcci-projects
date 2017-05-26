import java.util.Scanner;

public class PerItem extends CartItem {
	public PerItem ( String name, double PricePerUnit ) {
		
double calculatePrice = (quantity * pricePerUnit);

Scanner kb = new Scanner(System.in);
int choice;

System.out.println( "1. Butterfly " );
System.out.println( "2. Elephant  " );
System.out.println( "3. Teddy Bear" );
System.out.println( "4. Snake     " );

System.out.print( "\nWhich animal to draw? " );
choice = kb.nextInt();
System.out.println();

if ( choice == 1 )
{
	butterfly();
}
else if ( choice == 2 )
{
	elephant();
}
else if ( choice == 3 )
{
	 // * write code here to call the function named 'teddybear'
}
else if ( choice == 4 )
{
	 // * write code here to call the function named 'snake'
}
else 
{
	System.out.println( "Sorry, that wasn't one of the choices." );
}

System.out.println( "\nGoodbye!" );
		
		
		
	}

		
	

	
	
	
}
