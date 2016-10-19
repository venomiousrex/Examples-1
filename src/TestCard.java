
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class TestCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Card a1 = new Card(Card.CLUBS, 10, Card.BLACK, true);
        Card a2 = new Card(Card.SPADES, 9, Card.RED, true);
        System.out.println(""+ a1.compareTo(a2));
        
        System.out.println(a1);
    }
}
