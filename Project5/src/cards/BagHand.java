//Faysal Khatri
package cards;
import bag.MyBag;

public class BagHand implements HandOfCards {

	private MyBag<PlayingCard> hand;
	
	public BagHand() {
		hand = new MyBag<PlayingCard>();
	}

	@Override
	public void addCard(PlayingCard c) {
		hand.add(c);
	}

	@Override
	public void printHand() {
		System.out.print(hand);

	}
	
	public int getValue() {
		int handValue = 0;
		for (PlayingCard card : hand) {
			switch (card.getRank()) {
			case "Ace": 
				handValue += 11;
				break;
			case "Jack":
			case "Queen":
			case "King":
				handValue += 10;
				break;
			default:
				handValue += Integer.parseInt(card.getRank());
			}
		}
		return handValue;
	}
	
	public String toString() {
		return hand.toString();
	}

}


