//Faysal Khatri
import java.util.Random;

public class Card {
static String[] face_values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
static String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
String face_value = new String();
String suit = new String();
Random randGenerator = new Random();
	public Card() {
		Deal();
	}
	public void Deal() {
		face_value = face_values[randGenerator.nextInt(13)];
		suit = suits[randGenerator.nextInt(4)];
	}
}
