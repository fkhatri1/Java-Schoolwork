//Faysal Khatri
import recursion.*;

public class Activity4 {

	public static void main(String[] args) {

		for (int ii=0;ii<10;ii++) {
			System.out.println("sum_up " + ii + ": " + Recursion.sum_up(ii));
		}
		for (int ii=0;ii<10;ii++) {
			System.out.println("sum_up_tail " + ii + ": " + Recursion.sum_up_tail(ii));
		}

//Uncomment out the following code to test your functions		
		System.out.println("Test Activity 4:");
		System.out.println("Factorial:");
		for (int ii = 1; ii<10; ii ++) {
			System.out.print(Recursion.fact(ii) + "   ");
		}

		System.out.println("\n\nFibonacci:");
		for (int ii = 1; ii<10; ii ++) {
			System.out.print(Recursion.fib(ii) + "   ");
		}

		// Test Euclid's algorithm 
		System.out.println("\n\nGCD:");
		System.out.println ("GCD of 96 and 60 is " + Recursion.gcd(96, 60));
		System.out.println ("GCD of 30 and 10 is " + Recursion.gcd(30, 10));
		System.out.println ("GCD of 96 and 120 is " + Recursion.gcd(96, 120));
		System.out.println();

	}

}
