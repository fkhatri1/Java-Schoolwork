package cards;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Deck {
	private ArrayList<PlayingCard> cards;
	private Random rand;

	public Deck(int n) {
		super();
		rand = new Random();
		cards = new ArrayList<PlayingCard>(n);
		for (int suite = 1; suite <= 4; suite ++)
			for (int rank = 1; rank <= 13; rank ++) {
				if ((suite - 1) * 13 + rank <= n) { 
				  cards.add(new PlayingCard(rank, suite));
				}
			}
	}
	
	public PlayingCard dealOne() {
		return cards.get(rand.nextInt(52));
	}
	
	public void shuffle_array(){
		this.shuffle();
	}
	
	
	public void shuffle() {
		Integer[] a = new Integer[this.cards.size()];
		for (int ii=0;ii<a.length;ii++) {
			a[ii] = rand.nextInt(1000);
		}
		
		PlayingCard[] deck = new PlayingCard[this.cards.size()];
		int i=0;
		for (PlayingCard card : this.cards) {
			deck[i] = card;
			i++;
		}
		quickShuffle(deck, a, 0, deck.length-1);
		
		this.cards.clear();
		
		for (PlayingCard card : deck) {
			this.cards.add(card);
		}
		
	}
		
		private static <T extends Comparable<T>> 
		void quickShuffle(PlayingCard[] deck, Integer[] rand, int min, int max) {
			if (min < max)
			{
				// create partitions
				int indexofpartition = partitionShuffle(deck, rand, min, max);
				
				// sort the left partition (lower values)
				quickShuffle(deck, rand, min, indexofpartition - 1);
				
				// sort the right partition (higher values)
				quickShuffle(deck, rand, indexofpartition + 1, max);
			}
		}

		private static <T extends Comparable<T>> 
		int partitionShuffle(PlayingCard[] deck, Integer[] rand, int min, int max) {
			Integer partitionelement;
			int left, right;
			int middle = min + ((max - min) / 2);
			
			// use the middle data value as the partition element
			partitionelement = rand[middle];
			// move it out of the way for now
			swap(rand, middle, min);
			swap(deck, middle, min);
			
			left = min;
			right = max;
			
			while (left < right)
			{
				// search for an element that is > the partition element
				while (left < right && less_than_equal(rand[left],partitionelement))
					left++;
				
				// search for an element that is < the partition element
				while (greater_than(rand[right], partitionelement))
					right--;
				
				// swap the elements
				if (left < right)
					swap(rand, left, right);
					swap(deck, left, right);
			}
			
			// move the partition element into place
			swap(rand, min, right);
			swap(deck, min, right);
			
			return right;
		}

		private static void swap(Object[] a, int ii, int jj) {
			Object swap = a[ii];
			a[ii] = a[jj];
			a[jj] = swap;
		}
		private static <T extends Comparable<T>> boolean less_than(T a, T b) {
			return (a.compareTo(b) < 0);
		}
		private static <T extends Comparable<T>> boolean less_than_equal(T a, T b) {
			return (a.compareTo(b) <= 0);
		}
		private static <T extends Comparable<T>> boolean greater_than(T a, T b) {
			return (a.compareTo(b) > 0);
		}
	
	public String toString(){
		String ret = "";
		for (PlayingCard card : cards){
			ret += card + " ";
		}
		return ret;
	}
}
