// Crie classes para simular a camada de Acesso a Dados (DAL) de uma aplicação e configure as informações de conexão.
// Crie um package chamado infra.data.
// Dentro dele, crie a classe DatabaseConfig com três campos public static final String:
// DB_URL (valor: "jdbc:mysql://localhost:3306/estoque_db")
// DB_USER (valor: "usuario_app")
// DB_PASSWORD (valor: "senha123")
// Crie a classe ProdutoDAO (Data Access Object) no mesmo pacote.
// No método principal (main), tente imprimir as três constantes de configuração acessando-as diretamente da classe DatabaseConfig. Explique por que usar static final é comum para configurações.
// Foco: Simulação da camada de dados e uso de variáveis estáticas para constantes de configuração.

// O Exercício 2 simula a criação da camada de dados e foca no uso de constantes public static final para gerenciar configurações de backend, como credenciais de banco de dados.
// Vou criar as classes DatabaseConfig e ProdutoDAO dentro do package infra.data, e o programa principal para demonstrar o acesso a essas constantes.
// 1. Estrutura da Aplicação
// infra/
// └── data/
//     ├── DatabaseConfig.java
//     └── ProdutoDAO.java




package JavaPrograms.infra.Data;

public class ProdutoDAO {
    
    public ProdutoDAO() {
        // Construtor
        System.out.println("ProdutoDAO inicializado.");
    }


    /**
     * Método que simula a abertura de uma conexão com o banco.
     */
    public void conectar() {

        //exibe as constantes que fazem parte da classe DatabaseConfig
        System.out.println("\nTentando conectar ao banco de dados...");
        System.out.println("URL: " + DatabaseConfig.DB_URL);
        System.out.println("Usuário: " + DatabaseConfig.DB_USER);
        // Nota: Em aplicações reais, a senha NUNCA deve ser logada!
        System.out.println("Senha: " + DatabaseConfig.DB_PASSWORD);
        System.out.println("Conexão simulada com sucesso!");
    }
}

    

