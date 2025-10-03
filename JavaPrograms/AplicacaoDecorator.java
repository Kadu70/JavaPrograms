import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class AplicacaoDecorator {


    public static void main(String[] args) {
        String nomeArquivo = "maiusculo.txt";
       
        // Frase que será escrita em minúsculas
        String fraseOriginal = "esta é uma frase de teste em letras minúsculas.";
       
        System.out.println("Frase original (minúscula): \"" + fraseOriginal + "\"");
        System.out.println("Gravando no arquivo " + nomeArquivo + " usando o UpperCaseWriter...");
       
        // Define o stream mais externo como Writer para o try-with-resources
         Writer escritorFinal = null;


        // 1. Encadeamento de Streams (Padrão Decorator):
        // FileWriter -> UpperCaseWriter (Customizado) -> BufferedWriter (Eficiência)
        try (
            // O Writer mais externo é o BufferedWriter para bufferizar a saída.
            // Ele recebe o nosso UpperCaseWriter como argumento.
            BufferedWriter escritor = new BufferedWriter(
                // O UpperCaseWriter recebe o FileWriter.
                // A ordem de processamento é de fora para dentro na construção e de dentro para fora na escrita.
                new UpperCaseWriter(
                    new FileWriter(nomeArquivo) // O stream base para escrita no arquivo
                )
            )
        ) {
            // 2. Escreve a frase em minúsculas. O UpperCaseWriter irá interceptar e converter.
            escritor.write(fraseOriginal);
           
            // É importante fazer o flush para garantir que o buffer seja esvaziado no arquivo.
            escritor.flush();
           
            System.out.println("\nEscrita concluída. Verifique o arquivo " + nomeArquivo + ".");
            System.out.println("O conteúdo deve estar em CAIXA ALTA.");


        } catch (IOException e) {
            System.err.println("\n--- ERRO DE I/O ---");
            System.err.println("Falha ao escrever ou fechar o arquivo: " + e.getMessage());
        }
    }
}

// eof


// ### Saída Esperada no Console:


// ```
// Frase original (minúscula): "esta é uma frase de teste em letras minúsculas."
// Gravando no arquivo maiusculo.txt usando o UpperCaseWriter...


// Escrita concluída. Verifique o arquivo maiusculo.txt.
// O conteúdo deve estar em CAIXA ALTA.
// ```


// ### Conteúdo do `maiusculo.txt` (Arquivo Gerado):


// ```
// ESTA É UMA FRASE DE TESTE EM LETRAS MINÚSCULAS.

// O código demonstra com sucesso como o UpperCaseWriter (o Decorator customizado) intercepta os dados antes que cheguem ao FileWriter base, modificando a funcionalidade de I/O.


