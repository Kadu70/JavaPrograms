package JavaPrograms.infra.Data;

public class AplicacaoConfig {
    

    public static void main(String[] args) {
       
        System.out.println("--- DEMONSTRAÇÃO DE ACESSO ÀS CONSTANTES ---");


        // Acessando as constantes de configuração diretamente da classe,
        // sem criar uma instância de DatabaseConfig.
       
        System.out.println("1. Acessando DB_URL: " + DatabaseConfig.DB_URL);
        System.out.println("2. Acessando DB_USER: " + DatabaseConfig.DB_USER);
        System.out.println("3. Acessando DB_PASSWORD: " + DatabaseConfig.DB_PASSWORD);
       
        System.out.println("\n-------------------------------------------");


        // Cria uma instância do DAO e usa as configurações
        ProdutoDAO dao = new ProdutoDAO();
        dao.conectar();
    }

}

// Explicação sobre public static final
// As palavras-chave public static final são amplamente utilizadas para configurações e constantes em Java por três motivos principais:
// final (Constância): Garante que o valor (como a URL do banco) não pode ser alterado por engano em nenhum lugar do código após a inicialização.
// static (Compartilhamento): O valor pertence à classe (DatabaseConfig), não a um objeto específico. Isso significa que há apenas uma cópia na memória, e ela pode ser acessada de qualquer lugar (ex: DatabaseConfig.DB_URL) sem precisar instanciar a classe.
// public (Visibilidade): Permite que qualquer classe na aplicação (como ProdutoDAO ou AplicacaoConfig) possa ler esses valores, facilitando a configuração centralizada.
// Em resumo, usar public static final torna as configurações centrais imutáveis, compartilháveis e universais.

