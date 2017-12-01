//Faysal Khatri

import java.util.Scanner;

public class Activity0 {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		boolean validInput = false;
		int n = 0;
		while (!validInput) {
			System.out.print("Enter a number 1-20: ");
			n = user_input.nextInt();		
			if (n<=20 && n>0) {
				validInput = true;
			}
		}
		activity(n);
	}
	
	public static void activity(int n) {
		String linebreak = System.getProperty("line.separator");
		System.out.print("Numbers: ");
		for (int j=1;j<=n;j++) {
			System.out.print(j + " ");
		}
		System.out.print(linebreak + "Evens: ");
		if (n>1) {
			for (int j=2;j<n;j+=2) {
				System.out.print(j + " ");
			}
		}
		System.out.print(linebreak + "Activity: ");
		for (int j=1;j<=n;j++) {
			if (j%5==0) {
				System.out.print("fiver "); 
			}
			else if (j%7==0) {
				System.out.print("ssss ");
			}
			else {
				System.out.print(j + " ");
			}
		}
	}
}

