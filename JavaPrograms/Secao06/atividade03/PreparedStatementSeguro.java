package Secao06.atividade03;

// Exercício Prático: Prevenção de SQL Injection
// Este exercício prático aborda uma das melhores práticas mais críticas do JDBC: a segurança.
// O Cenário
// Você precisa inserir um novo produto na tabela PRODUTOS (a mesma do exercício anterior). Você recebe o nome do produto e seu preço como variáveis.
// Tabela: PRODUTOS (colunas: ID, NOME, PRECO)
// Dados:
// ID: 3
// NOME: "Teclado Mecânico"
// PRECO: 450.00
// A Tarefa
// Complete o código abaixo para executar a operação de INSERT de duas maneiras:
// Método Inseguro (Statement): Crie uma string SQL concatenando os valores da variável.
// Método Seguro (PreparedStatement): Use o ? como placeholder e o método setXxx() para vincular os valores.
// O programa deve executar a versão segura e exibir o número de linhas afetadas.
// O Código Base (Para você completar)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementSeguro {
  // Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";

    public static void main(String[] args) {

    // Dados de entrada simulando dados de um formulário
        int novoId = 3;
        String novoNome = "Teclado Mecânico";
        double novoPreco = 450.00;

        System.out.println("Iniciando teste de INSERT seguro com JDBC...");

        try (
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        ) {
            
            // --- PARTE 1: Demonstração Insegura (Apenas para fins de estudo) ---
            // NUNCA faça isso em produção!
            String sqlInseguro = "INSERT INTO PRODUTOS (ID, NOME, PRECO) VALUES (" 
                               + novoId + ", '" + novoNome + "', " + novoPreco + ")";
            
            /*
            // 1. COMPLETE AQUI: Use um Statement para executar o SQL Inseguro
            try (Statement stmtInseguro = conn.createStatement()) {
                // int linhasAfetadas = stmtInseguro.executeUpdate(sqlInseguro);
                // System.out.println("Linhas afetadas (Inseguro): " + linhasAfetadas);
            }
            // 2. Comente: Qual é o principal risco desta abordagem?
            // Risco: Vulnerabilidade a SQL Injection, pois os dados do usuário são tratados como código SQL.
            */


            // --- PARTE 2: Implementação SEGURA (Recomendada) ---
            
            String sqlSeguro = "INSERT INTO PRODUTOS (ID, NOME, PRECO) VALUES (?, ?, ?)";
            
            // Use try-with-resources para o PreparedStatement
            try (
                // 3. COMPLETE AQUI: Crie o PreparedStatement a partir do SQL Seguro
                PreparedStatement ps = conn.prepareStatement(sqlSeguro)
            ) {
                // 4. COMPLETE AQUI: Vincule os valores aos placeholders (1, 2 e 3)
                ps.setInt(1, novoId);
                ps.setString(2, novoNome);
                ps.setDouble(3, novoPreco);
                
                // 5. Execute a atualização
                int linhasAfetadasSeguras = ps.executeUpdate();

                System.out.println("INSERT Seguro executado com sucesso.");
                System.out.println("Linhas afetadas: " + linhasAfetadasSeguras);
            }

        } catch (SQLException e) {
            System.err.println("ERRO: Falha na execução da operação JDBC.");
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
 
}
