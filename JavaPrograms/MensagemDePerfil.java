// Crie um programa que colete três informações distintas do usuário e as combine em uma única mensagem de saída:
// Peça o nome completo (String).
// Peça a cidade onde mora (String).
// Peça o ano de nascimento (int).
// Exiba todas as informações coletadas em uma única linha.
// Foco: Combinação das funções nextLine() e nextInt() do Scanner e concatenação de Strings na saída

import java.util.Scanner;

public class MensagemDePerfil {

    public static void main(String[] args) {
        
   
    //objeto para entrada de dados
    Scanner in = new Scanner (System.in);

    //dados para leitura
    String nome="";
    String cidade="";
    int ano = 0;

    //variavel string que concatenara todas as informações

    String resultado = "";

    //lendo os dados
    System.out.println ("Informe o seu nome completo: ");
    nome =  in.nextLine();// le uma linha da entrada padrao

    System.out.println ("Informe o nome da sua Cidade: ");
    cidade =  in.nextLine();// le uma linha da entrada padrao

    System.out.println ("Que ano voce nasceu?");
    ano =  in.nextInt();// le um numero inteiro

    //concatenando os dados informado em uma unica string
    resultado ="Voce, "+ nome + " que nora na cidade de " + cidade + " nasceu no ano de : " + ano;

    // exibindo o valores concatenados

    System.out.println (resultado);
    
    }


}
