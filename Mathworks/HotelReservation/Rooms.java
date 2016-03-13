/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathworks.HotelReservation;

import Mathworks.HotelReservation.Guests.gender;

/**
 *
 * @author Kalyani
 */
public class Rooms {
    
    int roomnumber;
    boolean reserved;
    Guests g;
    
    Rooms(int roomnumber)
    {
        this.roomnumber = roomnumber;
        reserved = true;
        g = new Guests(32,gender.female);
    }
    
}
