//faysal khatri
import cards.*;
import hands.*;

public class Activity5 {

	public static void main(String[] args) {
		Deck d = new Deck(52);
		HandOfCards[] hands = new HandOfCards[3];
		
		hands[0] = new HandOfTwo();
		hands[0].addCard(d.dealOne());
		hands[0].addCard(d.dealOne());

		System.out.println("Hand of Two:");
		hands[0].printHand();
		
		hands[1] = new ArrayHand();
		hands[1].addCard(d.dealOne());
		hands[1].addCard(d.dealOne());
		
		System.out.println("\nArray Hand:");
		hands[1].printHand();
		
		hands[2] = new ArrayListHand();
		System.out.println("\nArray List Hand:");
		hands[2].printHand();
		
	}
	
}
