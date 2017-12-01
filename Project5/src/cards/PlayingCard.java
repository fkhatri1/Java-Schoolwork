package cards;
// Card class
// Constructor creates a joker, deal() method sets a rank & suit.
import java.util.Random;

public class PlayingCard {

	private final static String suits[] = {"None", "Hearts", "Spades", "Diamonds", "Clubs"};
	private final static String ranks[] = {"Joker", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", 
											"10", "Jack", "Queen", "King"};
	private int rank;
	private int suit;
	
	// Default constructor 
	public PlayingCard ()
	{
		chooseRandomCardValue();
	}
	
	public PlayingCard (int rank, int suit)
	{
		this.rank = 0;
		this.suit = 0;
		if ( (suit > 0) && (suit < suits.length) ) {
			if ( (rank > 0) && (rank < ranks.length) ) {
				this.suit = suit;
				this.rank = rank;
			}
		}
	}
	
	public PlayingCard (String rank, String suit)
	{
		this.rank = find_entry(rank, ranks);
		this.suit = find_entry(suit, suits);
	}	
	
	private static int find_entry(String value, String values[]) 
	{
		int ret = 0;
		for (int ii=0;ii<values.length;ii++)
		{
			if (value.toUpperCase() == values[ii].toUpperCase()) 
				ret = ii;
		}
		return ret;
	}

	public void chooseRandomCardValue()	
	{
		Random randNum = new Random();
		rank = randNum.nextInt(ranks.length-1) + 1;
		suit = randNum.nextInt(suits.length-1) + 1;
	}
	
	// Getters 
	public String getRank() {
		return ranks[rank];
	}
	public String getSuit() {
		return ranks[suit];
	}
	
	// Allow card to be printed nicely
	public String toString ()
	{
		return (ranks[rank] + " of " + suits[suit]);
	}
	
}
