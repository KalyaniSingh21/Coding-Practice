/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathworks.ATM;

/**
 *
 * @author Kalyani
 * Withdraw
 * Deposit
 * Balance Check
 */
public class ATMClassDesign {
    
    private float amount;
    BankAccount ba;
    
    ATMClassDesign(int pin)
    {
        this.amount = amount;
        ba = new BankAccount(pin);
    }
    
    float withdraw(float withdrawal_amount)
    {
        if(withdrawal_amount < ba.balance)
        {
            ba.balance = ba.balance-withdrawal_amount;
            return ba.balance;
        }
            
        else
            return 0;
    }
    
    float deposit(float deposit_amt)
    {
        if(deposit_amt >10)
        {
            ba.balance += deposit_amt;
            return ba.balance;
        }
        
        else
            return 0;
            
    }
    
    float balancecheck()
    {
        return ba.balance;
    }
    
    
    public static void main(String args[])
    {
        ATMClassDesign acc = new ATMClassDesign(1234);
        System.out.println("Balance is "+acc.balancecheck());
        System.out.println("Balance after deposit "+acc.deposit(30));
        System.out.println("Balance after withdrawal "+acc.withdraw(20));
        
        
        
    }
}
