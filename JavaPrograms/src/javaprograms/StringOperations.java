/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Aluno
 */

//ativada que realiza operacoes usando variaveis do timpo string
//1
public class StringOperations {
    
    //metodos principal da classe
     public static void main(String[] args) {
         //declarando variaveis do tipo string
         //e inicializando com 
   //2      
         //primeiro nome
         String Snome = "Carlos";
         
         //sobrenome
         String Ssobrenome = "Pinheiro";
         
         //string sem valores
         String Svalor;
//3         
         //usando o operador (+)  para cancatenar, juntas as strings
         Svalor = Snome + " " + Ssobrenome;
         //exibe na tela o valor de ambas as variaveis, concatenando
         //usando o metodo out.println
//4         
         System.out.println("Bem vindo :" + Svalor);


//5         
         //informando o comprimento, quantidade de caracteres, da variavel Snome
         //como a variavel Snome, é do tipo String, a mesma tem o metodo
         //length, que informa o tamanho da mesma
         System.out.println("o tamanho da variavel e : "+ Snome.length());
         
         //exibindo parte do valor da variavel Svalor
         //iniciando do primeiro digito, até o digito que fica na posição 4Snome + " " + Ssobrenome
//6         
         //o metodo substring, da classe String, pega parte do string
         //informando o valor inicial e o valor final a ser exibindo
         //da variavel String
         System.out.println("substring da variavel Svalor, e 0 ate 5 é :"+ Svalor.substring(0,5));
         
//7 
         //exibindo a variavel String em caixa alta, todas as letras em maiusculas
         //o metodo toUpperCase, da classe String, exibe o valor da String com a caixa aula
         //o metodo toLower, exibe o valor da String em caixa baixa
         System.out.println ("o valor da variavel Ssobrenome em caixa alta e : "+ Ssobrenome.toUpperCase());

//8
              
         //comparando os valores de 2 string
         //as string nao usam o operador de comparação (==)
         //a mesmo possui o seu proprio metodo para comparação
         
         //metodo equals da classe string verifica se a string informada é igual
         //a string que chamou o metodo
         //usando as variais não iguais
         if (Snome.compareTo(Ssobrenome)==0) // se forem iguais o valor é zero (0)
             //se os valores forem iguais, sera exibido a mensagem abaixo
             System.out.println("o valor de :" +Snome+ " e "+ Ssobrenome + " sao iguais") ;
         else //se nao forem iguais a mensagem a ser exibida ser essa   
             //verifica qual a ordem algabetica (lexicografica) da 2 strings
             if (Snome.compareTo(Ssobrenome)<0)// a Primeira string é maior
                      System.out.println("o valor de :" +Snome+ " e "+ Ssobrenome + " nao sao iguais") ;
             else  // se retirbar umar menor que zero a segunda string é maior
                      System.out.println("o valor de :" +Ssobrenome+ " e "+ Snome + " nao sao iguais") ;
         //usando as variaveis iguais
         Ssobrenome = Snome;
         if (Snome.equals(Ssobrenome))
             //se os valores forem iguais, sera exibido a mensagem abaixo
             System.out.println("o valor de :" +Snome+ " e "+ Ssobrenome + " sao iguais") ;
         else //se nao forem iguais a mensagem a ser exibida ser essa   
             System.out.println("o valor de :" +Snome+ " e "+ Ssobrenome + " nao sao iguais") ;
         
         
         
     }
    
}
