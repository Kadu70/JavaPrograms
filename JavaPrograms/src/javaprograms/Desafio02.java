/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//calse para calcular o valor da medica de 3 notas
public class Desafio02 {
    
    //metodo prinicial a ser executado ao iniciar a classe
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        
        //declarando as notas como sendo valores inteiros
        int nota1 = 6, nota2 =6, nota3 = 8;
        
        //declarando o valor da medica, sendo a mesma como float
        // usando o F no final do numero, para informar que o valor é float
        //visto que em java todos os numeros fracionado sao considerado double
        float media= 0.0F;
        
        //realiza a operação matematica para caldular a media
        //primeiro será executado a operação que esta entre parentese, soma
        //só depois o valor do resultado sera dividido pelo valor 3, do tipo
        //ponto flutuante (float), para que exiba o valor fracionado
        media = (nota1 + nota2 + nota3)/3.0F;
        
        //exibe os valores das notas e o resultado da media
        //usando o metodo out.println, da classe System
        System.out.println("a media das notas : ");
        System.out.println("nota1   " + nota1);
        System.out.println("nota2   " + nota2);
        System.out.println("nota3   " + nota3);
        System.out.println("a media das notas : " + media);
        
    }
    
}
