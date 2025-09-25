/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;
//carrega a biblioteca com a classe scanner
//para fazer a leitura dos dados de entrada
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AgeChecker {
    public static void main(String[] args) {
        //declara uma variavel do tipo scanner
        //todas as classe ao atribuir valores tem que usar o operador new
        //que chama o construtor da classe
        
        Scanner in = new Scanner(System.in);
        
        //cria uma variavel que recebera um valor inteiro, referente a idade
        int idade;
        
        //variavel que receberá o valor 's', caso tenha licença para dirigir
        char Licenca;
        
        //solicita que seja informado sua idade
        System.out.print("entre com a sua idade : ");
        idade = in.nextInt();//le a entrada padrão como sendo um tipo int
        
        
        System.out.print("Voce tem carteira de motorista?(s/n) ");
        //le apenas o primeiro caractere da linha digitada
        //como sendo um char
        Licenca = in.next().charAt(0);
        
        
        //compara a idade com o parametro informado (20)
        //se for maior, executara o comando abaixo do if
        if((idade > 20) && ((Licenca=='s') || (Licenca =='S')))
            //informa que voce tem mais de 20 anos e tem carteira de motorista
            System.out.println("voce eh maior de idade e tem carteira de motorista");
        else//caso a idade seja melhor ou igual a 20
            //verifica se tem carteira de motorista
            //variavel Licenca eh sim
            if ((Licenca=='s') || (Licenca =='S'))
               //informa que voce ainda não é maior de idade
                System.out.println("voce nao eh maior de idade , mas tem carteira de motorista");
            else
                //caso a respota seja diferente de 's' ou 'S'
                //será exibido a mensagem abaixo
                System.out.println("voce nao eh maior de idade e nao pode dirigir");
        //finaliza a classe scanner
        in.close();
    }
}
