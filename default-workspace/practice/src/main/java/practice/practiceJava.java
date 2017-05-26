package practice;

import java.util.Scanner;

public class practiceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);
		boolean another;
		do {
		
		System.out.println("are you a Member");
		boolean member = input.nextBoolean();
		System.out.println(member);
		
		System.out.println("how much is the total Bill");
		double bill = input.nextDouble();
		
		if (member == true) {
			double discount = bill * .15;
			double newBill = bill - discount;
			System.out.println(newBill);
		} else {

		if (bill >= 50) {
			double discount = (bill * .1);
			double newBill = (bill - discount);
			System.out.println(newBill);
		} else {
			double discount = (bill *.05);
			double newBill = (bill - discount);
			System.out.println(newBill);
		}
		System.out.println("Do you have another table ?");
		another = input.nextBoolean();
	
		} while  (another);
		{
	
}
		}
	}
	


