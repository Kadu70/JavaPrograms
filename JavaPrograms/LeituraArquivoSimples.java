// Exercício 1: Leitura Simples de Arquivo de Texto (Character Streams)
// Crie um programa que leia um arquivo de texto existente e imprima seu conteúdo no console.
// Crie manualmente um arquivo chamado entrada.txt na raiz do seu projeto e adicione algumas linhas de texto nele.
// No seu código Java, use a classe FileReader (Stream de Caractere) para abrir o arquivo.
// Implemente um loop para ler e imprimir cada caractere no console.
// Use o bloco try-catch para tratar a exceção IOException.
// Foco: Uso básico de FileReader e tratamento de exceções de I/O.
// Codigo:
// Exercício 1 de Fundamentos de I/O foca na leitura de arquivos usando Character Streams (FileReader) e no tratamento essencial de erros com try-catch.
// Lembre-se de criar o arquivo entrada.txt na mesma pasta do seu projeto ou especificar o caminho completo para o arquivo.
// Conteúdo do entrada.txt (Exemplo):
// Primeira linha de texto.
// Java I/O é fundamental.
// Fim do arquivo.

//Código Java (com FileReader e try-catch)

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivoSimples {
     public static void main(String[] args) {

        //objeto para ler arquivo
        Scanner in =new Scanner(System.in);

        //variavel que recebera o nome do arquivo
        String arq = "";

        //objeto para ler
        FileReader leitor = null; // Inicializado como null para ser acessível no bloco finally
        
        System.out.println("Informe o nome do arquivo");
        arq = in.nextLine();


        System.out.println("Iniciando a leitura do arquivo: " + arq + "\n");
        
        try {//abrindo area que pode conter erro na abertura e leitura
            //abrindo o arquivo
            leitor = new FileReader(arq);

            //codigo ASCII que será lido
            int codAscii;

           //percorre caracter por caracter do arquivo, e ao chegar no final retorna -1
           //o valor da leitrua é o codigo ASCII do caracter
            while ((codAscii = leitor.read()) != -1) {
                // Converte o código ASCII de volta para um caractere e imprime no console
                System.out.print((char) codAscii );
            }

        } catch (IOException e) {//exceção que pode ocorrer caso tenha alguma falha na abertura e leitura de uma arquivo
            // 3. Trata a exceção em caso de erro (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---");
            //e-> objeto que tem as ocorrencia de erros da exceção
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        } finally {// esse bloco será executado idependente se ocorreu ou não um erro (excecao)
            // O bloco finally garante que o recurso (FileReader) será fechado,
            // independentemente de ter ocorrido uma exceção ou não.
            try {
                if (leitor != null) {//verifica se o objeto que contem o arquivo realmente esta ativo
                    leitor.close();//fecha o arquivo liberando ele na memoria
                    System.out.println("\n\nLeitor de arquivo fechado com sucesso.");
                }
            } catch (IOException e) {
                // Trata exceções caso o fechamento do arquivo falhe
                System.err.println("Erro ao tentar fechar o arquivo: " + e.getMessage());
            }
        }
    }

}
