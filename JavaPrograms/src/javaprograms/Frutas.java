/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class Frutas {
    public int id = 3;
    private String[] ArrayFrutas;
    private ArrayList<String> ListFruta;

    public Frutas() {
        this.ArrayFrutas = new String[id];
        this.LimparArray();
        this.ListFruta = new ArrayList<>();
        this.LimparList();
        
    }
    
    private void LimparArray (){
        for (int i=0; i <id; i++) 
            this.ArrayFrutas[i]= "";
      
    }
    
    private void LimparList(){
        this.ListFruta.clear();
    }
            
 

     public String getArrayFrutas(int i) {
        if (indice(i))
            return this.ArrayFrutas[i];
        return "erro de indice";
        
    }

    private boolean indice (int i){
        if (i<0 || i>id)
            return false;
        return true;
            
    } 
     
    
    public String getListFruta() {
        String retorno ="";
        for  (String item : this.ListFruta)
            retorno += item + "\n";
                
        return retorno;
    }

    public void setArrayFrutas(String Fruta) {
        for (int i=0; i<id;i++){
            if (this.ArrayFrutas[i].equals("")){
                this.ArrayFrutas[i]=Fruta;
                return;
               
            }
        }
         System.out.println("o ArrayFruta esta Cheio");
    }
    public void setListFruta(String Fruta) {
        this.ListFruta.add(Fruta);
    }
    
  
}
