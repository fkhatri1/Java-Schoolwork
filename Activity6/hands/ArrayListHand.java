//faysal khatri

package hands;
import java.util.ArrayList;
import java.util.List;
import cards.*;

// Complete ArrayListHands which implements the HandOfCards interface using an ArrayList

public class ArrayListHand implements HandOfCards{

	List<PlayingCard> arraylisthand = new ArrayList<PlayingCard>();

	public ArrayListHand() {
		this(2);
	}
	

	public ArrayListHand(int numCards) {
		for (int i=1;i<=numCards;i++) {
			arraylisthand.add(new PlayingCard());
		}
	}

	@Override
	public void addCard(PlayingCard c) {
		arraylisthand.add(c);
		
	}

	@Override
	public void printHand() {
		for (PlayingCard i : arraylisthand) {
			System.out.println("Card: " + i);
		}
		
	}
}
