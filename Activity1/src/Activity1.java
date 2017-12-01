//Faysal Khatri
public class Activity1 {
	public static void main(String[] args) {
		String linebreak = System.getProperty("line.separator");
		Card[] cards = new Card[5];
		for (int i=0;i<cards.length;i++){
			cards[i] = new Card();
			System.out.print("Card " + (i+1) + ": " + cards[i].face_value + " of " + cards[i].suit + linebreak);
		}
	}
}
