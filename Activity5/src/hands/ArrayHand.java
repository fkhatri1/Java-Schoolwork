package hands;

import cards.PlayingCard;

//ArrayHand is a class implementing a hand of cards using an array
public class ArrayHand implements HandOfCards {

	private PlayingCard hand[];
	private int count;
	
	public ArrayHand () {
		this(2);
	}
	
	public ArrayHand (int length) {
		count = 0;
		hand = new PlayingCard[length];
		for (int ii=0;ii<length;ii++)
			hand[ii] = null;
	}
	
	@Override
	public void addCard(PlayingCard c) {
		if (count < hand.length) {
			hand[count] = c;
			count ++;
		}
		// else hand is full so do nothing
	}

	@Override
	public void printHand() {
		for (int ii=0; ii<count; ii++) {
			System.out.println("Card " + (ii+1) + ": " + hand[ii]);
		}
	}
}
