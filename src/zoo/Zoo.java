/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import animals.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xristos
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Crocodile croco = new Crocodile("Crocodilino", 12);
        croco.play();
        croco.toString();
        System.out.println(croco);
        Animal a1 = new Animal ("Dogy",13);
                
        Animal a2 = new Animal ("Caty",18);
                        
        Animal a3 = new Animal ("Frogy",15);
        List<Animal> animals = new ArrayList ();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        Animal.getOldestAnimal(animals);
        
        Animal tempAnimal = Animal.getOldestAnimal(animals);
        System.out.println(tempAnimal);
        
        
     
        
                                
       //        System.out.println("crocodile is playing");
                ////       croco.eat();
                //        
                //       Zebra zebra = new Zebra();
                //       zebra.play();
                //       
                //       Lion lion =new Lion();
                //       lion.move();
        
//        System.out.print(croco);
    }

}
