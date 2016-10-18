
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
    
    private int suit;
    private int rank;
    private Color colour;
    private boolean faceUp;
    
   public Card(int suit, int rank, Color colour, boolean faceUp){
       this.colour = colour;
       this.rank = rank;
       this.colour = colour;
       this.faceUp = faceUp;
   }
   
   public boolean compareTo(Card a){
       if(this.rank > rank){
           return true;
          
       }else{
           return false;
       }
   } 
   public int getSuit(){
       return this.getSuit();
   }
   public int getRank(){
       return this.getRank();
   }
   public Color getColour(){
       return this.getColour();
       
   }
   public boolean isFaceUp(){
       return this.faceUp;
   }
   public boolean flipCard(){
       
   }
}
