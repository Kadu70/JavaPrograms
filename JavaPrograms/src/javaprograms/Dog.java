/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author spinhece
 */
//2
public class Dog extends Animal{
    
//3
    //declarando os atributos da clase
    //valor pribate, define que apenas os metodos da classe poderam
    //ler ou alterar os valores desses atributos
    private String name;
    private String breed;
    private String barkNoise= "Woof";
    private double weight;
   
//metodos    
/*//4
  //criando metodo construtor, com parametors os valores para os atributos
  // name, breed, weight

    /**
     
    public Dog(String name, String breed, double weight) {
        //metodo this, informa define o atributo da classe
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
  //craindo um metodo construtor com todos os parametros dos atributos da classe
     public Dog(String name, String breed, double weight,String barkNoise) {
        //metodo this, informa define o atributo da classe
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.barkNoise = barkNoise;
    }
*/
    
    public Dog(String name, String breed, double weight, String colour) {
        super(breed, colour);
        this.name= name;
        this.weight= weight;
        
    }//end constructor method
public Dog(String name, String breed, String noise, double weight, String colour) {
        super(breed, colour);
        this.name= name;
        barkNoise= noise;
        this.weight= weight;
    }//end constructor method
    
    
     //6 criando metodos para pegar os valores dos parametros
    public String getName() {
        return name;
    }

       public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }
    //7
    //criando metodos para alterar os valores dos atributos
     public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
 //8
    //metodo que exbira o valor da variavel barkNoise
    public void bark(){
        System.out.println(barkNoise);
    }
  //9
    //sobrecarregando o metodo bark, alterando o parametro
    public void bark(String barkNoise){
        System.out.println(barkNoise);
    }//end method bark
    
    
}//fim da classe dog
  
