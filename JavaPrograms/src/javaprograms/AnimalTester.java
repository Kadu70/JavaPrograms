/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

import java.util.Scanner;

/**
 *
 * @author spinhece
 */
public class AnimalTester {
    
    public static void main(String[] args) {
     
   //13 -  criando objetos do tipo clase anterior (Dog)
        Dog dog1= new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "brown");
        Fish fish= new Fish("Goldfish", "cold", "red");

     //   Dog dog2= new Dog("Bailey", "Boerboel",82.2, "arf-arf");
        
        //saida de dados
        System.out.println("Dog name : "+ dog1.getName());
        System.out.println("Dog breed : "+ dog1.getBreed());
        System.out.print("Bark noise: ");
        dog1.bark();
        System.out.println("Dog weight: "+ dog1.getWeight());
        //System.out.println("Dog name : "+ dog2.getName());
        //System.out.println("Dog breed : "+ dog2.getBreed());
        System.out.print("Bark noise: ");
       // dog2.bark();
               
        System.out.println("Dog colour: "+ dog1.getColour());
        
        
        System.out.println("Fish breed : "+ fish.getBreed());
        System.out.println("Water type : "+ fish.getWaterType());
        System.out.println("Fish colour: "+ fish.getColour());
       
        //System.out.println("Dog weight: "+ dog2.getWeight());        
    }
}
