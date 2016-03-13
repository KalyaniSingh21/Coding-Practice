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
public class Hotel {
    
    int capacity = 100;
    Rooms r;
    //Guests g;
    
    Hotel(int roomnumber)
    {
        r = new Rooms(roomnumber);  // call reserved on it
        capacity -= 1;
    }
    
    public static void main(String[] args)
    {
        Hotel ht = new Hotel(1231);
        System.out.print("Capacity "+ht.capacity+" "+ ht.r.reserved+" "+ht.r.g.age);
        
    }   
}
