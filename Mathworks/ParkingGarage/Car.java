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
public class Car {   
    
 enum spacetype{regular,handicapped,compact};
 
    
    Car()
    {
    }
    
     String cartype(spacetype st)
     {
         switch(st)
         {
             case regular:
                 return "regular";
             case handicapped:
                 return "handicapped";
             case compact:
                 return "compact";
         }
         return null;    
     }
    
    
    
}
