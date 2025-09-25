/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */
public class TesteFrutas {
    
    public static void main(String[] args) {
         Frutas f = new Frutas();
    
    
        //carregando um array
        f.setArrayFrutas("Maça");
        f.setArrayFrutas("Banana");
        f.setArrayFrutas("Laranja");
        f.setArrayFrutas("Uva");

        //Carregando o lista Arrayclear
        f.setListFruta("Manga");
        f.setListFruta("Graviola");
        f.setListFruta("Melancia");
        f.setListFruta("Coco");

        //exibindo os arrays
        for (int i = 0; i< f.id; i++){
            System.out.println(f.getArrayFrutas(i));
        }

        System.out.println (f.getListFruta());




        
         
  
    
    }

}
