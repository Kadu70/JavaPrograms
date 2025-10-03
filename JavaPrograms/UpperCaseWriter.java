// Crie um filter stream customizado para adicionar uma funcionalidade a um stream existente.
// Crie uma classe UpperCaseWriter que herde de FilterWriter (ou use a interface Writer para um desafio ainda maior).
// O objetivo dessa nova classe é que, ao chamar o método write(String str), ela converta a string para maiúsculas antes de passá-la para o writer subjacente.
// Crie um stream de saída (output stream) usando:
//  FileWriter→BufferedWriter→UpperCaseWriter
//  (A ordem é: new BufferedWriter(new UpperCaseWriter(new FileWriter("maiusculo.txt")))).
// Escreva uma frase em letras minúsculas e verifique o arquivo maiusculo.txt para confirmar que todo o texto foi gravado em maiúsculas.
// Foco: Entendimento do Padrão Decorator em Java I/O (streams em cadeia), e a criação de um stream customizado.
// O Desafio 3 aborda o Padrão Decorator em Java I/O, onde um stream é envolvido por outro para adicionar funcionalidades, o que é a base de classes como BufferedReader e BufferedWriter.
// Aqui está o código completo, incluindo a classe UpperCaseWriter customizada e o programa principal que demonstra seu uso.
// 1. Classe Customizada: UpperCaseWriter
// Primeiro, criamos o nosso filter stream customizado que herda de FilterWriter e modifica o comportamento do método write(String).

/**
 * UpperCaseWriter é um FilterWriter que converte todos os caracteres de uma String
 * para maiúsculas antes de passá-los para o Writer subjacente (o 'out' protegido).
 * * Isso demonstra o Padrão Decorator, onde adicionamos uma funcionalidade
 * a um stream existente.
 */

import java.io.IOException;
import java.io.Writer;


import java.io.FilterWriter;
public class UpperCaseWriter extends FilterWriter {


    /**
     * Construtor.
     * @param out O Writer subjacente que receberá os dados processados.
     */
    public UpperCaseWriter(Writer out) {
        super(out);
    }


    /**
     * Sobrescreve o método write(String) para converter a string para maiúsculas
     * antes de escrever.
     * @param str A string a ser escrita.
     * @throws IOException Se ocorrer um erro de I/O na escrita.
     */
    @Override
    public void write(String str) throws IOException {
        // Converte a string para maiúsculas
        String upperCaseStr = str.toUpperCase();
       
        // Chama o método write do Writer subjacente (this.out)
        super.write(upperCaseStr, 0, upperCaseStr.length());
    }


    // Nota: O método write(int c) também deveria ser sobrescrito para
    // ser completo, mas focamos em write(String) conforme o desafio.
}







