
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // define variables
        int number = 5;
        char letter = 'a';
        boolean lightSwitch = true;
        
        // to get user input
        Scanner input = new Scanner(System.in);
        
        // Ask the user for input
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        // say hello to the user
        System.out.println("Hello " + name);
        
        // make an array of names
        String[] nameList = new String[5];
        
        // loop through the array
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Please enter name " + (i+1) );
            nameList[i] = input.nextLine();
        }
        
        // say hello to everyone
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Hello " + nameList[i]);
        }
        
        int num1 = -5;
        int num2 = -10;
        double power = Math.pow(num1 * num2, 5);
        double sqRoot = Math.sqrt(num1);
        
        int count = 10;
        while(count > 0){
            System.out.println(count);
            count--;
            if(count == 5){
                break;
            }
        }
        
    }
}
