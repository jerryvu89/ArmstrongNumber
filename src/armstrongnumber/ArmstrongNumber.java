/*
Enter any number
Divide the given number into individual digits (Example: 153 into 1, 5, 3) and 
count them.
Calculate the power of n for each individual and add those numbers.
Compare original value with Sum value.
If they exactly matched then it is Armstrong number else it is not Armstrong.
153 = 1^3 + 5^3 + 3^3
 */

package armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Temp, Reminder, Times = 0;
		double Sum = 0;
		sc = new Scanner(System.in);
                
                // Ask user to enter any positive integer. That number will be assigned
                // to Number variable.
		System.out.println("\n Please Enter number to Check for Armstrong: ");
		Number = sc.nextInt();

		// Helps to prevent altering the original value
		Temp = Number;
		while (Temp != 0) {
			Times = Times + 1;
			Temp = Temp / 10;
		   }
		
                // To make sure that the given number is greater than 0 and calculate
                // the sum of the powers of given number.
		Temp = Number;
		while( Temp > 0)  {
			Reminder = Temp %10;
		    Sum = Sum + Math.pow(Reminder, Times);
		    Temp = Temp /10;
		   }
		System.out.format("\n Sum of entered number is = %.2f", Sum);
		
		if (Sum == Number) {
			System.out.format("\n% d is a Armstrong Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Armstrong Number", Number);
		}
	}
}