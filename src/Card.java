
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class Card {

    public static final Color RED = Color.red;
    public static final Color BLACK = Color.black;
    
    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;
    // RANKS 
    private static final int ACE = 1;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private int suit;
    private int rank;
    private Color colour;
    private boolean faceUp;

    /**
     * A constructor to create a new playing card 
     * @param suit the suit of the playing card
     * @param rank the rank of the playing card
     * @param colour color of playing card 
     * @param faceUp is the card face up
     */
    public Card(int suit, int rank, Color colour, boolean faceUp) {
        //initializing instance variables 
        this.colour = colour;
        this.rank = rank;
        this.faceUp = faceUp;

        //determine card colour
        if (this.suit == Card.SPADES || this.suit == Card.CLUBS) {
            colour = Color.BLACK;
        } else {
            colour = Color.RED;
        }
    }

    /**
     * Compares the rank of 2 cards
     * @param a compares the rank of the card with second one
     * @return 0 means the cards are equivalent less than 0 card is less than c, greater than 0 card is bigger than c
     */
    public int compareTo(Card a) {

        return this.rank - a.rank;
    }

    /**
     * Returns the suit of the playing card
     * @return the suit of the playing card
     */
    public int getSuit() {
        return this.getSuit();
    }
    
    /**
     * returns the rank of the playing card
     * @return the rank of the playing card
     */
    public int getRank() {
        return this.getRank();
    }
    
    /**
     * return the colour of the card
     * @return return the colour of the card
     */
    public Color getColour(){
        return this.colour;
    }

 
    /**
     * return if the card is face up or not
     * @return true if the playing card is face up
     */
    public boolean isFaceUp() {
        return this.faceUp;
    }
    

    public void flipCard() {
        //toggle (fastest) 
        faceUp = !faceUp;

    }
    /**
     * Pretty String version of the Card
     * @return a String representation of the card
     */ 
    @Override 
    public String toString(){
        String suit = "";
        if(this.suit == Card.SPADES){
            suit = "Spades";
        }else if(this.suit == Card.CLUBS){
            suit = "Clubs";
        }else if(this.suit == Card.DIAMONDS){
            suit = "Diamonds";
        }else if(this.suit == Card.HEARTS){
            suit = "Hearts";
        }
        
        return "Suit: " + suit + " Rank: " + this.rank + " faceUp: " + this.faceUp;
        
        
    }
}
