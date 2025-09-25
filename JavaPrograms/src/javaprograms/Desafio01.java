/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//classe que recebe 2 numeros inteiros e troca os valores de um para outro
public class Desafio01 {
    public static void main(String[] args) {
        // TODO code application logic here
        // Declare e inicialize as seguintes variáveis:
        
        //declara as varias com valores inteiros
        //i=sendo a e b as variaves que terao seus valores trocados
        //t a variavel que sera usada como auxiliar para a troca de valores
        int a=25,b=10,t=0;
        
        //esibindo os valores atuais das variveis a e b, conforme foram inicializadas
        //usando o metodo println, da classe System, out
        System.out.println("valor de a = " + a + " e valor de b = "+ b);
        
        //usando o println + "\n". para pular 2 linhas
        System.out.println("\n");
        //atribuindo a t, o valor de a
        t=a;
        //atribuind a a o valor de b
        a=b;
        //atribuindo o valor de t, que era o do a ao inicialmete, para b
        b=t;
        
        //exibindo os valores de a e b, novamente, agora com seus valores trocados
        System.out.println("valor de a = " + a + " e valor de b = "+ b);
                
                
        
    }
}
