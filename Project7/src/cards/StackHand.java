package cards;
import jsjf.*;

// Complete ArrayListHands which implements the HandofCards interface using an ArrayList

public class StackHand implements HandOfCards {
	private LinkedStack<PlayingCard> cards;
	
	public StackHand() { 
		cards = new LinkedStack<PlayingCard>();
	}
	
	@Override
	public void addCard(PlayingCard c) {
		cards.push(c);
	}

	@Override
	public void printHand() {
		System.out.println("  " + cards.peek());
	}
	
	public String toString() {
		return cards.peek().toString();
	}
	
	public PlayingCard play() {
		return cards.pop();
	}

}
