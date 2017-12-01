//Faysal Khatri
package recursion;

import java.util.Random;
import java.util.Scanner;

public class Recursion {

	// Class example
	public static int sum_up(int n) {
		if (n <=1 ) {
			return 1;
		}
		else {
			return n + sum_up(n-1);
		}
	}
	
	// Class example
	public static int sum_up_tail(int n) {
		return sum_up_tail(n, 0);
	}
	public static int sum_up_tail(int n, int tmp) {
		if (n <1 ) {
			return tmp;
		}
		else {
			return sum_up_tail(n-1, tmp+n);
		}
	}
	
	// Activity 4 int fact(int n) 
	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
	// Activity 4 int fib(int n) 
	public static int fib(int n) {
		if (n <= 2) {
			return 1;
		}
		else {
			return fib(n-2) + fib(n-1);
		}
	}
	
	// Activity 4 int gcd(int num1, int num2)
	public static int gcd(int num1, int num2) {
		if (num2 <= num1 && num1%num2==0) {
			return num2;
		}
		else if (num1 < num2) {
			return gcd(num2,num1);
		}
		else {
			return gcd(num2, num1%num2);
		}
	}

    // Project 4 int power (int x, int y)
	public static int power(int x, int y) {
		if (y == 1) {
			return x;
		}
		else if (y==0) {
			return 1;
		}
		else {
			return x * power(x, y-1);
		}
	}
	
	// Project 4 balance(int x, int y)
	public static int balance(int x, int y) {
		if (Math.abs(x-y) <= 1) {
			return Math.min(x, y);
		}
		else if (x>y) {
			return balance(x-1, y+1);
		}
		else {
			return balance(x+1, y-1);
		}
	}
    // Project 4 int ack(int m, int n) 
	public static int Ackermann(int m, int n) {
		if (m == 0) {
			return n+1;
		}
		else if (m>0 && n==0) {
			return Ackermann(m-1,1);
		}
		else {
			return Ackermann(m-1, Ackermann(m,n-1));
		}
	}
	
	// Project 4 playGuessingGame(int m);
	public static void playGuessingGame(int m) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int answer = rand.nextInt(m) + 1; 
		guessHelper(1, m, answer);
		scan.close();
	}
	
	public static void guessHelper(int lowerLimit, int upperLimit, int answer) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess a # between " + lowerLimit + " and " + upperLimit);
		int guess = scan.nextInt();
		if (guess == answer) {
			System.out.println("You guessed it.");
		}
		else if (guess > answer) {
			System.out.println("Too high.");
			guessHelper(lowerLimit, guess-1,answer);
		}
		else if (guess < answer) {
			System.out.println("Too low.");
			guessHelper(guess+1, upperLimit,answer);
		}
		scan.close();
	}
}
