//Faysal Khatri

package activity2;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Driver class for CSC205 Activity 2
 * 
 * @author Wade Huber
 *
 */
public class Activity2 {

	public static void main(String[] args) {

		Fraction n = new Fraction(8,3);
		
		Scanner scan = new Scanner(System.in);
			
		try {
			//scan.close();   //triggers IllegalStateException
			//scan = new Scanner(System.in); //triggers NoSuchElementException if attempt to reopen input stream
			System.out.print ("Enter the numerator:  ");
			n.setNumerator(scan.nextInt());		
			System.out.print ("Enter the denominator:  ");
			n.setDenominator(scan.nextInt());
			}
			catch (InputMismatchException e) {
				System.out.println("**Exception caught** Input must be an int.");
			}
			catch (NoSuchElementException e) {
				System.out.println("**Exception caught** NoSuchElement.");
			}	
			catch (IllegalStateException e) {
				System.out.println("**Exception caught** Scanner is closed.");
			}
			finally {
				System.out.println("Proceeding with current values.");
			}
		
		try {
			System.out.println ("The fraction " + n.getNumerator() + "/" +
				n.getDenominator() + " is equal to " + n.toMixedNumber());
			}
			catch (ArithmeticException e) {
				System.out.println("**Exception caught** " + e.getMessage());
			}
		
		scan.close();

	}
}