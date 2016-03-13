/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathworks.ParkingGarage;

/**
 *
 * @author Kalyani
 */
public class ParkingGarage extends ParkingSpace {
    
    boolean entrance;
    ParkingSpace ps;
    Car c;
    
   // park, unpark car

    ParkingGarage(int capacity) {
        
        super(capacity);
           
    }
    
    void park(spacetype st)
    {     
        capacity = capacity - 1;
        System.out.print(c.cartype(st)+"Capacity "+ capacity);
    }
    
    void unpark(spacetype st)
    {
        capacity -= 1;
        System.out.print("Capacity "+capacity + "Unparked from "+st);
    }
    
    
    public static void main(String[] args)
    {
        ParkingGarage p = new ParkingGarage(20);
        p.park(spacetype.compact);
        p.unpark(spacetype.regular);
        
    }
    
}
