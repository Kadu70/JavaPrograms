/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
//1
public class UniqueNums {
    public static void main(String[] args) {
   //2
        //cria um objeto do tipo array com 5 numeros inteiros
        int[] numbers= new int[5];
        //cria um objeto do tipo scanner para entrada de dados
        Scanner in= new Scanner(System.in);
        //cria 2 variavel do tipo int, e reinicia com valor 0
   //3   
        int num=0, numValues=0;
        //cria uma variavel do tipo booleana com valor true
        boolean valid= true;
   //4        
        //cria um loop que vai percorer toda lista
        while(numValues<numbers.length) {
   //5
            //loop para entrada de dados
            do{
                valid=true;// define como true a variavel
                //exibe a mensagem na  tela 
                System.out.print("Entre com um numero unico: ");
                num= in.nextInt(); //le o que foi digitado como sendo inteiro
   //6
                //cria um loop que verificara se o numero digitado ja consta na lista
                for(int i= 0; i<numValues; i++)
                {
   //7
                    //se o numero digitadado ja estiver na lista, entra no if
                    if(num== numbers[i]) {
                        //informa na tela que o numero já consta na lista
                        System.out.println("Number already exists");
                        //altera a valiavel para false
                        valid= false;
                        //sai do loop for
                        break;
                    }//finaliza o if
                }//finaliza o loop for
            //enquando o resulta logico for true, será solicitado uma nova entrada
            }while(!valid);
   //8
            //atribui na lista, na posição atual (numValues) o valor digitado
            numbers[numValues] = num;
   //9
            //incrimenta a posição atual para a proxima
            numValues++;
            }//finaliza o while
   //10
            in.close();//fecha o scanner
   //11
            System.out.println("Lista de Numeros digitados");    
            //cria um loop para exibir o valores digitados no arrau
            //metodo length, informa quantas posições o array possui
            for(numValues=0;numValues <numbers.length; numValues++){
               //exibe o valor na posição numValues 
               System.out.println(numbers[numValues]);
            }
        }//finaliza o metodo man
    }//finaliza a classe UniqueNums
        

