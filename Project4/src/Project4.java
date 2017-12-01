//Faysal Khatri
import java.util.Scanner;

import recursion.*;

public class Project4 {

	public static void main(String[] args) {
		System.out.println("Recursion Tests:");
		
		System.out.println("\nClass examples:");
		for (int ii=0;ii<10;ii++) {
			System.out.println("sum_up " + ii + ": " + Recursion.sum_up(ii));
		}
		for (int ii=1;ii<10;ii++) {
			System.out.println("sum_up_tail " + ii + ": " + Recursion.sum_up_tail(ii));
		}

//		Uncomment this block of code to test Activity 4

		System.out.println("\n\nActivity 4:");
		// Test factorial
		System.out.println("Factorial:");
		for (int ii = 1; ii<10; ii ++) {
			System.out.print(Recursion.fact(ii) + "   ");
		}

		// Test fibonacci
		System.out.println("\n\nFibonacci:");
		for (int ii = 1; ii<10; ii ++) {
			System.out.print(Recursion.fib(ii) + "   ");
		}

		// Test Euclid's GCD algorithm 
		System.out.println("\n\nGCD:");
		System.out.println ("GCD of 96 and 60 is " + Recursion.gcd(96, 60));
		System.out.println ("GCD of 30 and 10 is " + Recursion.gcd(30, 10));
		System.out.println ("GCD of 96 and 120 is " + Recursion.gcd(96, 120));

		// Uncomment out this block of code to test Project 4
		System.out.println("\n\nTest Project 4:");
		System.out.println("Power:");
		for (int ii = 1; ii<4; ii ++) {
			for (int jj = 0; jj<6; jj ++)  {
				System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
			}
			System.out.println();
		}

		
//		Uncomment this block of code to test Activity 4

		// Test balance function 
		System.out.println("\nBalance:");
		System.out.println("Balance 10 20 = " + Recursion.balance(10, 20));
		System.out.println("Balance 20 10 = " + Recursion.balance(20, 10));
		System.out.println("Balance 10 21 = " + Recursion.balance(10, 21));
		System.out.println("Balance 21 10 = " + Recursion.balance(21, 10));
		System.out.println("Balance 10 11 = " + Recursion.balance(10, 11));
		System.out.println("Balance 10 10 = " + Recursion.balance(10, 11));

		// Test the Ackermann function 
		System.out.println("\nAckermann:");
		for (int ii = 0; ii<4; ii ++)
		{
			for (int jj = 0; jj < 5; jj++)
			{
				System.out.print(Recursion.Ackermann(ii,jj) + "\t");
			}
			System.out.println();
		}
	
		System.out.println("\nGuessing game:");
		// Try-with-resources automatically closes the resources opened
		try (
			Scanner scan = new Scanner(System.in);
			) {
			System.out.print ("How high should I go?  ");
			int upTo = scan.nextInt();
			Recursion.playGuessingGame(upTo);
				
		}


	}

}
