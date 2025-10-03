// Crie uma classe Produto simples e prepare-a para serialização.
// Crie uma classe chamada Produto com os seguintes campos:
// String nome
// double preco
// int codigo
// Adicione um construtor e métodos getters à classe.
// Implemente a interface java.io.Serializable para tornar a classe serializável.
// Defina o campo codigo como transient. Explique por que o código não será salvo ao serializar.
// Foco: Entendimento da interface Serializable e do uso da palavra-chave transient.
// Exercício 3 é fundamental para entender como os objetos Java se preparam para a persistência ou transmissão.
// Aqui está o código da classe Produto e a explicação sobre a palavra-chave transient.
// Código Java: Classe Produto Serializável

import java.io.Serializable;

/**
 * A classe Produto implementa a interface Serializable para permitir que seus 
 * objetos sejam convertidos em um stream de bytes (serialização).
 */

public class Produto {// Opcional, mas recomendado: Define uma versão explícita para compatibilidade.
    private static final long serialVersionUID = 1L; 

    private String nome;
    private double preco;
    
    // Campo marcado como 'transient':
    // O valor deste campo NÃO será incluído no stream de bytes durante a serialização.
    private transient int codigo; 

    // Construtor
    public Produto(String nome, double preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    // Métodos Getters (Acessores)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }
    
    // Método toString para facilitar a impressão
    @Override
    public String toString() {
        return "Produto [Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo + "]";
    }

     public static long getSerialversionuid() {
        return serialVersionUID;

        
    }

        

     public void setCodigo(int codigo) {
         this.codigo = codigo;
     }

}


   // Explicação: O Papel da Interface Serializable e de transient
// 1. Interface java.io.Serializable
// Função: Esta interface é uma interface de marcador (ou marker interface), pois não possui métodos para implementar.
// Propósito: Ela serve como um sinal para a Máquina Virtual Java (JVM) de que os objetos desta classe estão aptos a terem seu estado 
//convertido em um formato persistente (byte stream). Sem esta interface, a tentativa de serialização resultaria em uma exceção 
//(NotSerializableException).
// 2. Palavra-chave transient
// Uso: A palavra-chave transient (transiente) é usada para marcar variáveis de instância que não devem ser serializadas.
// No Exemplo (codigo): Ao serializar um objeto Produto, os campos nome e preco serão salvos no stream de bytes. No entanto, o campo codigo será ignorado pelo processo de serialização.
// Resultado na Desserialização: Quando o objeto é lido de volta (desserializado), o campo codigo não terá o valor original. Em vez disso, ele será inicializado com o valor padrão do tipo de dado, que, para um int, é zero (0).
// O transient é útil para dados sensíveis (como senhas, conexões de banco de dados ou caches) que não devem ser persistidos ou que são específicos do ambiente de execução e precisam ser recriados após a desserialização.
