/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//atividade2 - delcara variais do tipo imteiro de diversos tamanhos
public class Atividade02 {
    
    //metodo principal a ser executado
     public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        
        //declarando as variaveis do tipo inteiro
         byte idade= 55;
         short diasnoano = 365;
         long popMundial = 8_23_000_000;
         int kl =  36;
         
        
        // Imprima o valor de cada variável
        
        //usando a clase System, out carrega os metodos de saida
        //println - metodo de impressao na tela dos valores informado
        //e apos isso pula uma linha
        System.out.println("Minha Idade é " + idade + " Anos");
        System.out.println("Dias no Ano " + diasnoano +" Dias");
        System.out.println("População Mundial " + popMundial + " pessoas");
        System.out.println("De Maua ate Av Paulista " + kl + "kl" );
        
    }
}
