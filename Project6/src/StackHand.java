import cards.HandOfCards;
import cards.PlayingCard;
import jsjf.LinkedStack;

public class StackHand implements HandOfCards {

	private LinkedStack<PlayingCard> hand;
	
	public StackHand() {
		hand = new LinkedStack<PlayingCard>();
	}
	
	@Override
	public void addCard(PlayingCard c) {
		hand.push(c);
	}
	
	public PlayingCard play() {
		return hand.pop();
	}

	@Override
	public void printHand() {
		System.out.println(hand);
	}
	
	

}
