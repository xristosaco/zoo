/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import animals.Animal;
import java.util.List;

/**
 *
 * @author xristos
 */
public class Crocodile extends Animal {

    private static Crocodile get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int legs;

    public  Crocodile (){
    
    }
    public  Crocodile (String name, int age){
        
        
//        super.name = name;
//        super.age = age;

super();
System.out.println("crocodile is greated");
        
    }
            
            
    public void printVariblees() {
        System.out.println("Name is is" + name);
        System.out.println("age is" + age);
        System.out.println("cage " + cage);
        play();
    }
    
    
    @Override
    public void play(){
        System.out.println("crocodile is paly");
        super.play();
    }

    public  Crocodile getOldestAnimal(List<Animal> animals){
        Crocodile max = Crocodile.get(0);
        for (Animal i : animals) {
            if (i.getAge() > max.getAge()) {
                max = (Crocodile) i;

            }

        }
        return max;
    }
    @Override
    public String toString() {
        return super.toString() +"Crocodile{" + "legs=" + legs + '}';
    }

   
}
