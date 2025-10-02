// Crie um programa que lide com a leitura de múltiplas palavras na mesma linha e depois inverta uma delas:
// Solicite ao usuário que digite três palavras separadas por espaço (ex: "Java é legal"). Use apenas uma chamada nextLine().
// Use o método split() da String para dividir a entrada em um array de Strings (tokens).
// Inverta a segunda palavra e imprima a frase reformatada no console.
// Foco: Manipulação avançada de Strings (que geralmente acompanha a leitura de entrada no console), transformando a entrada de uma linha em múltiplos dados.

import java.util.Scanner;

public class InversorDePalavras {

    public static void main(String[] args) {

        //definindo a entrada dos dados
        Scanner in = new Scanner (System.in);

        //string de entrada
        String str = "";

        //String Array
        String[] strSeparado ;

        //entrada da frase
        System.out.println("Entre com um frase com 3 palavara");
        str = in.nextLine();

        //usa o caracter " ", como divisor entre as palavras
        strSeparado = str.split(" ");

        //verifica se contem 3 palabras
        if (strSeparado.length!=3){
            System.out.println("quantidade de palabras errada. só digitar 3 palavras");
            return;
        }


        // mostrando a frase original
        System.out.println ("a Frase original eh: " + str );

        //exibe a frase com as posições das palabras alteradas
        System.out.println ("a Frase invertida: " + strSeparado[2] + " "+strSeparado[0] + " "+strSeparado[1]  );




    }

}


