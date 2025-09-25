/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;
//importa a biblioteca para leitura de dados
//usando a classe scanner
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class ValueChecker {
    //metodo principal da classe atual
    public static void main(String[] args){
        // declara e carrega um classe do tipo Scanner
        //operador new, chama o construtor da classe conforme o parametro informado
        Scanner in = new Scanner(System.in);
       // delcara uma variavel do tipo int e inicializa a mesma com o valor 0
        int value = 0;
        //abre um loop cujo o teste sera no final
        do{
            //exibe a mensagem solicitando que seja digitado um numero
            System.out.println("Entre com um numero:");
            value = in.nextInt();//le na entrada padrão uma linha como sendo do tipo int

            //verifica se o valor digitado é o numero 7
            if( value == 7) {
                //caso seja informa que voce esta com sorte
                System.out.println("Voce esta com sorte!");
            }
            //se não for o numero sete, verifica se é o numero 13
            else if( value == 13) {
                //se for o numero 13, informa que voce não esta com sorte
                System.out.println("voce não esta com sorte!");
            }
            //caso não seja o numero 13
            else {
                //exibe a mensagem dizendo que voce não esta com sorte e nem azar
                System.out.println("este numero nao eh de sorte e nem de azar");
            }//
            //fim do loop e verifica se o mesmo ira ou não continuar
            //caso o valor seja sera, o programa terminara, senão continuara
            //a receber os numeros de sorte/azar
        }while(value != 0);
        //finaliza a classe scanner
        in.close();
    }
}
