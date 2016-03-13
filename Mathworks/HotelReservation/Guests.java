/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathworks.HotelReservation;

/**
 *
 * @author Kalyani
 */
public class Guests {
    enum gender{male,female};
    int age;
    
    Guests()
    {}
    
    Guests(int age,gender g)
    {
        this.age = age;
        
    }
}
