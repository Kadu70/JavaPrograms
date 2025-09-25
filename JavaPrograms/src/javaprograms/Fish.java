/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author spinhece
 */



//classe Peixe (subclasse, igual a Cachorro)
public class Fish extends Animal{
        private String waterType;
        
        public Fish(String breed, String waterType, String colour) {
            super(breed, colour);
            this.waterType= waterType;
        }//end constructor method
        public String getWaterType() {
            return waterType;
        }//end method getWaterType
        public void setWaterType(String waterType) {
            this.waterType= waterType;
        }//end method setWaterType
}
