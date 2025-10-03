// Crie um programa que grave dados binários (bytes) em um novo arquivo.
// Crie um array de bytes com alguns números (ex: byte[] dados = {10, 20, 30, 40, 50};).
// Use a classe FileOutputStream (Stream de Byte) para criar e abrir um arquivo chamado dados_brutos.dat.
// Use o método write() do stream para gravar o array de bytes no arquivo.
// Certifique-se de fechar o stream após a escrita (idealmente usando try-with-resources).
// Foco: Uso de FileOutputStream para I/O binário e garantia de fechamento de recursos.
// Exercício 2 é crucial para entender a diferença entre streams de caractere (para texto) e streams de byte (para dados brutos/binários). Usaremos o FileOutputStream e a sintaxe try-with-resources para garantir que o arquivo seja fechado.
// Aqui está o código Java para escrever dados brutos em um arquivo:

import java.io.FileOutputStream;//biblioteca pela trabalhar com arquivos
import java.io.IOException;//biblioteca de exceções de IO


public class EscritaDadosBrutos {

    public static void main(String[] args) {
        
    
         // 1. Cria um array de bytes (dados brutos)
        // Estes números serão escritos diretamente no arquivo binário.
        byte[] dados = {10, 20, 30, 40, 50, 60, 70};
        //cria uma string para receber o nome do arquivo
        String nomeArquivo = "dados_brutos.dat";
        
        System.out.println("Iniciando a escrita de " + dados.length + " bytes no arquivo: " + nomeArquivo);

        // 2. Usa try-with-resources com FileOutputStream
        // Isso garante que o 'outputStream' será fechado automaticamente no final do bloco try, 
        // mesmo se ocorrer uma exceção.
        //objeto para gravação de um arquivo binario
        try (FileOutputStream outputStream = new FileOutputStream(nomeArquivo)) {
            
            // 3. Usa o método write(byte[]) para gravar o array inteiro no arquivo
            //grava o array de uma vez so
            outputStream.write(dados);
            
            System.out.println("Escrita concluída com sucesso.");
            
        } catch (IOException e) {//se ocorrer algum erro de IO
            // Trata a exceção em caso de erro de I/O (ex: erro de permissão)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
        
    }

}
