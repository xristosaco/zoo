/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

import java.util.List;

/**
 *
 * @author xristos
 */
public class Animal {

    public String name;
    public int age;
    public String cage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void play() {
        System.out.println("Animal is playin");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    public Animal(String name, int age, String cage) {
        this.name = name;
        this.age = age;
        this.cage = cage;
    }

    public static Animal getOldestAnimal(List<Animal> animals) {
        Animal max = animals.get(0);
        for (Animal i : animals) {
            if (i.getAge() > max.getAge()) {
                max = i;

            }

        }
        return max;
        
       public static Crocodile getOldestCrocodilel(List<Crocodile> croco) {
        Animal max = animals.get(0);
        for (Animal i : animals) {
            if (i.getAge() > max.getAge()) {
                max = i; 
        
    }
            }
        return max;
       }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", cage=" + cage + '}';
    }

}
