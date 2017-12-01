//Faysal Khatri
import bag.*;
import cards.*;

public class Project5 {

	public static void main(String[] args) {
		System.out.println("**Blackjack Round 1**");
		blackjack();
		System.out.println("**Blackjack Round 2**");
		blackjack();		
		System.out.println("**Blackjack Round 3**");
		blackjack();		
	}
	
	public static void blackjack() {
		Deck deck = new Deck(52);
		BagHand[] myhands = new BagHand[3];
		for (int i=0; i<myhands.length; i++) {
			myhands[i] = new BagHand();
			myhands[i].addCard(deck.dealOne());
			myhands[i].addCard(deck.dealOne());
			System.out.println("\tHand #: " + (i+1));
			System.out.println("\t\t" + myhands[i]);
			if (myhands[i].getValue() == 21) {
				System.out.println("\t\tHand Value: Blackjack!\n");
			}
			else {
				System.out.println("\t\tHand Value: " + myhands[i].getValue() + "\n");
			}
		}
	}

}
