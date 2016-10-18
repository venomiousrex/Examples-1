/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount a1 = new BankAccount("Lamont", 1234, 100);
     
     //check balance
        System.out.println("Init balance "  + a1.checkFunds());
        a1.deposit(100);
        System.out.println(a1.checkFunds());
        a1.withdraw(10);
        System.out.println(a1.checkFunds());
        
        BankAccount a2 = new BankAccount("Another", 1234, 1000);
        
        System.out.println("B2 balance " + a2.checkFunds());
        
       //return account number
        System.out.println("Account number for A1 "+a1.getAccountNumber());
        
        a1.transferFundsTo(a2, 1);
       
        System.out.println(a2.checkFunds());
        System.out.println(a1.checkFunds());
    }
}
