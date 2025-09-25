/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//atividade que faz as operacoes basicas de matematica
//usando os tipo primitivos inteiro e double
public class Atividade04 {
    
    //metodo principal da classe
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        
       //declarando/iniciando os numeros inteires que farao as operacoes 
       int i1=5, i2=15;
       //declarando e iniciando as variaveis do tipo inteiro
       //que receberão os resultado das operações aritimeticas
       //a mesmas foram iniciando com o valor zero (0)
       int isoma=0, isub=0,idiv=0,imult=0;
       
       //declarando e iniciando as variaveis do tipo double
       double d1=5.45, d2=4.55;
       
       //declarando e iniciando as variaveis do tipo double
       //que receberao os resultados das operações
       double dsoma=0, dsub=0,ddiv=0,dmult=0;
         
        
        //realiza as operação aritimeticas do tipo int
        //e atribuindo o resultado nas variaveis correspondentes
        isoma= i1+12;
        isub= i1-12;
        idiv= i1/12;
        imult= i1*12;
        
        //realiza as operações aritimeticas do tipo double
        //e atribui o resultado nas variaveis correspondentes
        dsoma= d1+d2;
        dsub= d1-d2;
        ddiv= d1/d2;
        dmult= d1*d2;
        
        //usando a classe System, metodo de said out.println
        //para exibir os numeros inteiros e o resultado da operação
        System.out.println(i1 +" + "+ i2 + " = " + isoma );
        System.out.println(i1 +" - "+ i2 + " = " + isub );
        System.out.println(i1 +" / "+ i2 + " = " + idiv );
        System.out.println(i1 +" * "+ i2 + " = " + imult );
        
        //o metodo println, da classe System, pula uma linha apos a impressão 
        //na tela do valor informado
        // o uso do operado "\n", faz com que a saida pula uma linha
        //neste exemplo sera pulado 2 linhas seguidas, uma do println e outra
        //do "/n"
       
        System.out.println("\n");
        
        
        //usando a classe System, metodo de said out.println
        //para exibir os numeros double e o resultado da operação
        System.out.println(d1 +" + "+ d2 + " = " + dsoma );
        System.out.println(d1 +" - "+ d2 + " = " + dsub );
        System.out.println(d1 +" / "+ d2 + " = " + ddiv );
        System.out.println(d1 +" * "+ d2 + " = " + dmult );
        
        // o uso do operado "\n", faz com que a saida pula uma linha
        //neste exemplo sera pulado 2 linhas seguidas, uma do println e outra
        //do "/n"
        System.out.println("\n");
       
        
         //usando a classe System, metodo de said out.println
        //para exibir os numeros int e double e o resultado da operação
       
        System.out.println(i1 +" + "+ d2 + " = " + (i1 + d2) );
        System.out.println(i1 +" - "+ d2 + " = " + (i1 - d2) );
        System.out.println(i1 +" / "+ d2 + " = " + (i1 / d2) );
        System.out.println(i1 +" * "+ d2 + " = " + (i1 * d2) );
        
        
        
        
                
        
        
    }
}
