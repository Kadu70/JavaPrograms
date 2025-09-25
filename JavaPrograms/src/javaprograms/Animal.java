/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author spinhece
 */
public class Animal {
           
        private String breed,colour;
        
        public Animal(String breed, String colour) {
            this.breed= breed;
            this.colour= colour;
        }//end constructor method
        
        public String getBreed() {
            return breed;
        }//end method getBreed
        public void setBreed(String breed) {
            this.breed= breed;
        }//end method setBreed
        public String getColour() {
            return colour;
        }//end method getColour
        public void setColour(String colour) {
            this.colour= colour;
}//end method setColour
}//end class Animal
