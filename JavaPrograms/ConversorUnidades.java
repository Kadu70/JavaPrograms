// Crie um programa que interaja com o usuário para realizar uma conversão de unidades:
// Solicite ao usuário que digite um valor em metros (use um tipo de ponto flutuante, como double).
// Calcule o valor equivalente em centímetros (1 metro = 100 centímetros).
// Imprima a conversão no console.
// Foco: Leitura de um valor double com o Scanner e cálculo matemático básico.

import java.util.Scanner;

public class ConversorUnidades  {

    public static void main(String[] args) {
        //objeto para leitura na entrada padrao
        Scanner in = new Scanner(System.in);

        //variavel de entrada
        double m = 0;

        //variavel convertida
        double cm = 0;

        //entrada de dados
        System.out.println("Entre o numero que corresponde ao o Metro: ");

        //le um valor tipo double na entrada padrao
        m = in.nextDouble();

        //fazendo a conversão

        cm = m * 100;

        //exibindo o resultado

        //formatando a saida com valores de 2 casa decimais
        System.out.format("o valor de  %.2f metros em centimetros eh  %.2f \n\n", m, cm);
    }
}
