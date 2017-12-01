package hands;

import cards.PlayingCard;
import lists.LinkedList;

public class LinkedListHand implements HandOfCards {
	private LinkedList<PlayingCard> myLLHand;
	
	public LinkedListHand() {
		this.myLLHand = new LinkedList<PlayingCard>();
	}

	@Override
	public void addCard(PlayingCard c) {
		myLLHand.addToFront(c);

	}

	@Override
	public void printHand() {
		System.out.println(myLLHand);

	}

}
