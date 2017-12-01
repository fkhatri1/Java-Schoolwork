import java.util.Scanner;

import recursion.*;

public class Project4 {

	public static void main(String[] args) {
		System.out.println("Test Activity 4 & Project 4:");
		
/*		Uncomment this block of code to test Activity 4
		// Test factorial
		System.out.println("Factorial:");
		for (int ii = 0; ii<10; ii ++) {
			System.out.print(Recursion.fact(ii) + "   ");
		}

		// Test fibonacci
		System.out.println("\n\nFibonacci:");
		for (int ii = 0; ii<10; ii ++) {
			System.out.print(Recursion.fib(ii) + "   ");
		}

		// Test Euclid's GCD algorithm 
		System.out.println("\n\nGCD:");
		System.out.println ("GCD of 96 and 60 is " + Recursion.gcd(96, 60));
		System.out.println ("GCD of 30 and 10 is " + Recursion.gcd(30, 10));
		System.out.println ("GCD of 96 and 120 is " + Recursion.gcd(96, 120));
		System.out.println();
*/

/*		Uncomment this block of code to test Project 4
		System.out.println("Test Project 4:");
		System.out.println("Power:");
		for (int ii = 0; ii<4; ii ++) {
			for (int jj = 0; jj<6; jj ++)  {
				System.out.print(ii + "^" + jj + "=" + Recursion.power(ii,jj) + "   ");
			}
			System.out.println();
		}

		// Test balance function 
		System.out.println("Balance 10 20 = " + Recursion.balance(10, 20));
		System.out.println("Balance 20 10 = " + Recursion.balance(20, 10));
		System.out.println("Balance 10 21 = " + Recursion.balance(10, 21));
		System.out.println("Balance 21 10 = " + Recursion.balance(21, 10));
		System.out.println("Balance 10 11 = " + Recursion.balance(10, 11));
		System.out.println("Balance 10 10 = " + Recursion.balance(10, 11));

		// Test the Ackerman function 
		System.out.println("\nAckerman:");
		for (int ii = 0; ii<4; ii ++)
		{
			for (int jj = 0; jj < 5; jj++)
			{
				System.out.print(Recursion.Ackerman(ii,jj) + "\t");
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
*/

	}

}
