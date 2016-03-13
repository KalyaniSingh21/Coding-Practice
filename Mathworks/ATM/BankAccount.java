/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathworks.ATM;

/**
 *
 * @author Kalyani
 */
public class BankAccount {
    
    final int pin = 1234;
    float balance;
    
    BankAccount(int pin)
    {
        if(pin == this.pin)
        this.balance = 2000;
    }
    
    
}
