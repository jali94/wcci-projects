package practiceLoops;

import java.util.Scanner;

public class practiceLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    System.out.println("Pick an starting number"); // starting value 
		    Scanner input = new Scanner(System.in);
		    // asking for the user for the input 
		    int number = input.nextInt();
		    System.out.println("Pick an ending number"); // ending value 
		    int number1 = input.nextInt();
		    while(number <= number1)
		    {
		    System.out.println(number);
		        number++;
		    }
		    }
		}
