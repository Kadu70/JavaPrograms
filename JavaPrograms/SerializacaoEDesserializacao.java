// Implemente a lógica completa de salvar e carregar o objeto criado no Exercício 3.
// Usando a classe Produto (serializável), crie uma instância de um produto (ex: nome="Celular", preco=1500.0, codigo=101).
// Serialização:
// Use FileOutputStream e ObjectOutputStream para salvar o objeto em um arquivo chamado produto.ser.
// Desserialização:
// Use FileInputStream e ObjectInputStream para ler o arquivo produto.ser.
// Converta o objeto lido de volta para o tipo Produto (faça o casting).
// Imprima todos os campos do objeto original e do objeto desserializado, comprovando que o campo codigo (marcado como transient) não foi mantido.
// Foco: Fluxo completo de Serialização/Desserialização, casting e confirmação do efeito de transient.
// Desafio 2 é o teste final para entender o fluxo de Serialização (salvar o objeto) e Desserialização (restaurar o objeto), além de comprovar o comportamento da palavra-chave transient.
// Você precisará da classe Produto que criamos no Exercício 3 (com codigo marcado como transient) para rodar este código.
// Código Java: Serialização e Desserialização
// Codigo:
import java.io.*;


public class SerializacaoEDesserializacao {
        // Nome do arquivo onde o objeto será salvo
    private static final String ARQUIVO_SER = "produto.ser";

    public static void main(String[] args) {
        
        // 1. Criação do Objeto Original
        // O código é 101, mas foi marcado como transient na classe Produto.
        Produto original = new Produto("Celular S10", 1500.0, 101);
        System.out.println("--- 1. OBJETO ORIGINAL ---");
        System.out.println("Objeto Original: " + original);
        System.out.println("Código Original (transient): " + original.getCodigo());
        
        // ----------------------------------------
        // A. SERIALIZAÇÃO (Salvando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 2. SERIALIZANDO Objeto para o arquivo: " + ARQUIVO_SER);
        try (
            // Usa FileOutputStream para o fluxo de bytes no arquivo
            FileOutputStream fileOut = new FileOutputStream(ARQUIVO_SER);
            // Usa ObjectOutputStream para escrever o objeto no fluxo de bytes
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            // Escreve o objeto no arquivo.
            objOut.writeObject(original);
            System.out.println("Serialização concluída. Estado salvo.");
            
        } catch (IOException i) {
            i.printStackTrace();
            return; // Termina se a serialização falhar
        }

        // ----------------------------------------
        // B. DESSERIALIZAÇÃO (Carregando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 3. DESSERIALIZANDO Objeto do arquivo: " + ARQUIVO_SER);
        Produto restaurado = null;
        
        try (
            // Usa FileInputStream para ler o fluxo de bytes do arquivo
            FileInputStream fileIn = new FileInputStream(ARQUIVO_SER);
            // Usa ObjectInputStream para ler o objeto a partir do fluxo de bytes
            ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) 
        {
            System.out.println("aqui");
            // Lê o objeto e faz o casting para a classe Produto
            restaurado = (Produto) objIn.readObject();
            System.out.println("Desserialização concluída. Objeto restaurado.");
            
        } catch (IOException i) {

            System.err.println(i.getMessage());
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Produto não encontrada.");
            c.printStackTrace();
            return;
        }
        
        // ----------------------------------------
        // 4. COMPROVAÇÃO DO EFEITO TRANSIENT
        // ----------------------------------------
        System.out.println("\n--- 4. COMPROVAÇÃO ---");
        System.out.println("Objeto Restaurado: " + restaurado);
        
        // Comprova que o campo 'codigo' foi perdido
        System.out.println("\nEfeito Transient:");
        System.out.println("Nome (Salvo): " + restaurado.getNome());
        System.out.println("Preço (Salvo): " + restaurado.getPreco());
        System.out.println("Código (Transient, PERDIDO): " + restaurado.getCodigo());
    }
}
// Saída Esperada no Console:
// --- 1. OBJETO ORIGINAL ---
// Objeto Original: Produto [Nome: Celular S10, Preço: 1500.0, Código: 101]
// Código Original (transient): 101

// --- 2. SERIALIZANDO Objeto para o arquivo: produto.ser
// Serialização concluída. Estado salvo.

// --- 3. DESSERIALIZANDO Objeto do arquivo: produto.ser
// Desserialização concluída. Objeto restaurado.

// --- 4. COMPROVAÇÃO ---
// Objeto Restaurado: Produto [Nome: Celular S10, Preço: 1500.0, Código: 0]

// Efeito Transient:
// Nome (Salvo): Celular S10
// Preço (Salvo): 1500.0
// Código (Transient, PERDIDO): 0

