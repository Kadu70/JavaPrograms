
// Crie um programa que faça o seguinte:
// Solicite ao usuário que digite o primeiro número inteiro.
// Solicite ao usuário que digite o segundo número inteiro.
// Calcule a soma dos dois números.
// Imprima o resultado da soma no console em um formato amigável.
// Foco: Uso do Scanner para ler um int e uso do System.out.println para a saída formatada.

import java.util.Scanner;

public class  CalculadoraSomaSimples {

    public static void main(String[] args) {
       int n1=0, n2=0, soma=0;
       //cria um objeto para ler a entrada padrao
       Scanner in = new Scanner(System.in);

       System.out.println("Calculadora");
       
       System.out.println("Entre com um Numero Inteiro");
       n1 = in.nextInt();//le um numero inteiro na entrada padrao

       //pula uma linha na saida padrao
       System.out.println();

       System.out.println("Entre com outro Numero Inteiro");
       n2 = in.nextInt();//le um numero inteiro na entrada padrao

       //pula uma linha na saida padrao
       System.out.println();


       //faz o calculo
       soma = n1+ n2;

       System.out.println("Resultado da Operação");
        //pula uma linha na saida padrao
       System.out.println();

       System.out.format ("A soma ente os numeros %d e o %d eh %d\n\n", n1, n2, soma);




    }


    
}
