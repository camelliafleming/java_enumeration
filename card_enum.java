import java.security.SecureRandom;
import java.util.Scanner;


/*
 * Author: Camellia Fleming
 * Class: CSC 151 Spring 22
 * Assignment: Enumeration program
 */

public class card_enum {
	
	public enum cardSuit{
		SPADES,
		HEARTS,
		CLUBS,
		DIAMONDS;		
	}//end enum cardSuit
	
	static cardSuit suit;
	
	public enum cardNum{
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING,
		ACE;	
	}// end enum cardNum
	
	static cardNum card_num;
	
	//constructor to initialize suit and card_num
	public card_enum(cardSuit suit, cardNum card_num) {
		this.suit = suit;
		this.card_num = card_num;
	}// end constructor
	
	
	public void displayCard() {
		switch (suit) {
		case SPADES:
		case CLUBS:	
			System.out.println("The card is a black card.");
			break;
		case HEARTS:
		case DIAMONDS:
			System.out.println("The card is a red card.");
			break;
		}//end switch
	}//end displayCard method
	
	public void displayNum() {
		switch (card_num) {
		case TWO: case THREE:
		case FOUR: case FIVE: case SIX:
		case SEVEN: case EIGHT: case NINE: 
		case TEN:
			System.out.println("The card is not a face card.");
			break;
		
		case JACK: case QUEEN: case KING: case ACE:
			System.out.println("The card is a face card.");
			break;
		}//end switch
	}//end displayNum method
	

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		
		int getSuit = 0;
		int getNum = 0;
		
		getSuit = rand.nextInt(4)+1;
		getNum = rand.nextInt(13)+1;
		
		System.out.println(getSuit);
		System.out.println(getNum);
		
		if (getSuit == 1) {
			suit = suit.SPADES;
		}
		if (getSuit == 2) {
			suit = suit.HEARTS;
		}
		if (getSuit == 3) {
			suit = suit.CLUBS;
		}
		if (getSuit == 4) {
			suit = suit.DIAMONDS;
		}
		
		if (getNum == 2) {
			card_num = card_num.TWO;
		}
		if (getNum == 3) {
			card_num = card_num.THREE;
		}
		if (getNum == 4) {
			card_num = card_num.FOUR;
		}
		if (getNum == 5) {
			card_num = card_num.FIVE;
		}
		if (getNum == 6) {
			card_num = card_num.SIX;
		}
		if (getNum == 7) {
			card_num = card_num.SEVEN;
		}
		if (getNum == 8) {
			card_num = card_num.EIGHT;
		}
		if (getNum == 9) {
			card_num = card_num.NINE;
		}
		if (getNum == 10) {
			card_num = card_num.TEN;
		}
		if (getNum == 11) {
			card_num = card_num.JACK;
		}
		if (getNum == 12) {
			card_num = card_num.QUEEN;
		}
		if (getNum == 13) {
			card_num = card_num.KING;
		}
		if (getNum == 14 || getNum == 1) {
			card_num = card_num.ACE;
		}
		
		
		String s = String.valueOf(suit);
		String n = String.valueOf(card_num);
		card_enum e = new card_enum(cardSuit.valueOf(s), cardNum.valueOf(n));
		e.displayCard();
		e.displayNum();
		System.out.println(card_num.name() + " of "+ suit.name());
		

	}//end main

}//end class
