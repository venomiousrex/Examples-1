/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class BankAccount {
    
    //shared between all BankAccounts
    private static int currentAccounts = 0;
    

    
    //instance variables (called encapsulation)
    private double amount;
    private int pin;
    private int accountNumber;
    private String name;
    
    //constructor 
    //initial set up that needs to happen before using 
    public BankAccount(String name, int pin, double initBalance){
        //refers to this class and not any other, initializes variables to avoid conflicts
        this.amount = initBalance;
        this.name = name;
        this.pin = pin;
        
        //add 1 to create an account
        BankAccount.currentAccounts++;
        //set the account number
        this.accountNumber = BankAccount.currentAccounts;
    } 
    
    // Class Methods
    
    public void withdraw(double amount){
        if(amount > 0 && this.amount >= amount){
            this.amount -= amount;
            
        }
    }
    
    public void deposit(double amount){
        //incase user deposits money less than 1
        if(amount > 0){
            this.amount += amount;
        }
    }
    
    public double checkFunds(){
        return this.amount;
    }
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void transferFundsTo(BankAccount a, double amount){
        //check for proper amount
        if(this.amount >= amount){
            //withdraw money from A(number) A1
            //this.withdraw(amount);
            //or you can write this instead of above (SAME TIHNGGGGG)
            this.amount -= amount;
            //do the transfer to a(number) A2
            //a.amount += amount;
            //or you can write this instead of above
            a.deposit(amount);
        }
    }
}
