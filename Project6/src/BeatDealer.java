import cards.Deck;
import cards.PlayingCard;
import jsjf.LinkedQueue;
import jsjf.exceptions.EmptyCollectionException;

public class BeatDealer {
	static LinkedQueue<Player> players;
	static Deck deck = new Deck(52);
	static Player dealer = new Player();
	static int numPlayers = 5;
	static int handSize = 3;
	static int playerWins = 0;
	static int dealerWins = 0;
	
	public static void main(String[] args) {
		players = new LinkedQueue<Player>();	
		setupGame();
		for (int j=1; j<=handSize; j++) {
			playHand();
		}
		System.out.println("\nThe dealer won " + dealerWins + " of " + handSize + " hands.");
		System.out.println("The players won " + playerWins + " of " + handSize + " hands.");
		System.out.println("\nThanks for playing.");
		}
	
	public static void setupGame() {
		//creates 10 players with handSize cards each and enqueues them into the players queue
		for (int i=1 ; i<=numPlayers; i++) {
			Player player = new Player();
			for (int j=1; j<=handSize; j++) {
				player.receiveCard(deck.dealOne());
			}
			players.enqueue(player);
		}
		
		//gives the dealer handSize cards
		for (int j=1; j<=handSize; j++) {
			dealer.receiveCard(deck.dealOne());
		}
	}
	
	public static void playHand() {
		int playersHandTotal = 0;
		int dealersHandTotal = 0;
		int diff;
		Player activePlayer;
		PlayingCard activeCard;
		
		System.out.println("\n\nNew Hand Starting.");
		
		try {
			
			/*calculates the dealer's hand
			 * wrapping in try block in case a player or dealer does not have a card to play
			 */
			activeCard = dealer.playCard();
			dealersHandTotal = activeCard.getValue()*numPlayers;
			System.out.println("\tDealer's card: " +  activeCard.getRank() + " of " + activeCard.getSuit());
			System.out.println("\tDealer's total: " + dealersHandTotal);
			
			
			/*calculates sum of players cards
			 * player is dequeued and enqueued again after showing hand
			 */
			
			System.out.println("\n\tPlayers cards:");
			for (int i=1; i<=numPlayers; i++) {
				activePlayer = players.dequeue();
				activeCard = activePlayer.playCard();
				System.out.println("\t\tPlayer " + i + ": " + activeCard.getRank() + " of " + activeCard.getSuit());
				playersHandTotal += activeCard.getValue();
				players.enqueue(activePlayer);
			}
			
			System.out.println("\tPlayers total: " + playersHandTotal + "\n");
			
			
		
			//determines who won
			 
			diff = dealersHandTotal - playersHandTotal;
			
			if (diff >= 0) {
				System.out.println("\n\tDealer Wins!");
				dealerWins++;
			}
			else {
				System.out.println("\n\tPlayers Win!");	
				playerWins++;
			}
		}
		catch (EmptyCollectionException e) {
			System.out.println("\n*****We ran out of cards!*****");
		}
		catch (Exception e) {
			System.out.println("\n*****Something went wrong.*****");
		}
			
			
		
	}

}
