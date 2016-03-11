/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlepractice;

interface Mammal
{
    enum livelihood{inSea, onLand, onBoth};
    String food = null;
    String eats(String food);
          
}

interface Amphibian
{
    enum livelihood{inSea, onLand, onBoth};
    String food = null;
    String eats(String food);
          
}
public class AnimalKingdom implements Mammal,Amphibian {
    
    public String eats(String food)
    {
        return food;
    }
    
    public boolean eats()
    {
        return true;
    }
    
    public static void main(String[] args)
    {
        Mammal m = new AnimalKingdom();
        AnimalKingdom ak = new AnimalKingdom();
        Amphibian a = new AnimalKingdom();
        //String fish;
        System.out.println(m.eats("fish"));
         System.out.println(ak.eats());
    }
    
}
