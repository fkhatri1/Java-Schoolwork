import cards.PlayingCard;

public class Player {
	private StackHand hand;
	
	public Player() {
		hand = new StackHand();
	}
	
	public void receiveCard(PlayingCard c) {
		hand.addCard(c);
	}
	
	public PlayingCard playCard() {
		return hand.play();
	}
}
