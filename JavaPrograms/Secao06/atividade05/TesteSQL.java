// Mapeamento JDBC Básico

// Tipo de Dado Oracle/SQL
// Tipo Java Recomendado
// Método ResultSet (Exemplo: rs.____(colName))
// VARCHAR2 ou CHAR
// String
// rs.getString
// NUMBER (inteiro)
// int ou long
// rs.getInt ou rs.getLong
// NUMBER (decimal)
// double
// rs.getDouble
// DATE ou TIMESTAMP
// java.sql.Timestamp
// rs.getTimestamp
// BLOB (Binary Large Object)
// byte[]
// rs.getBytes
// Exportar para as Planilhas
// Ponto Chave

// // A escolha do tipo Java é fundamental para evitar erros de type casting e para otimizar o uso da memória.
// // O java.sql.Timestamp é frequentemente preferido para datas, pois lida tanto com a data quanto com a hora, que é o padrão em muitos SGBDs modernos (como o TIMESTAMP da Oracle).
// // Para valores monetários ou cálculos de alta precisão, o java.math.BigDecimal pode ser uma alternativa melhor do que double ou float (usando rs.getBigDecimal).
// // Com este exercício, você está pronto para o próximo tópico: PreparedStatement!

// Ao usar o ResultSet para extrair dados do banco, é crucial saber qual método Java usar (getInt(), getString(), getDate(), etc.) para o tipo de dado SQL retornado.
// O Cenário
// Você executou uma consulta (SELECT) em uma tabela Oracle e agora precisa usar o objeto ResultSet para extrair os valores das colunas e armazená-los nas variáveis Java correspondentes.
// A Tarefa
// Preencha a Tabela de Mapeamento abaixo, indicando o Tipo Java e o Método ResultSet mais apropriado para cada Tipo de Dado Oracle/SQL fornecido.
// Tipo de Dado Oracle/SQL
// Tipo Java Recomendado
// Método ResultSet (Exemplo: rs.____(colName))
// VARCHAR2 ou CHAR
// _________________
// rs._________________
// NUMBER (inteiro)
// _________________
// rs._________________
// NUMBER (decimal)
// _________________
// rs._________________
// DATE ou TIMESTAMP
// _________________
// rs._________________
// BLOB (Binary Large Object)
// _________________
// rs._________________

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteSQL {

  // Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";
    private static final String SQL_SELECT = "SELECT ID, NOME FROM PRODUTOS";


    public static void main(String[] args) {

    // Dados de entrada simulando dados de um formulário
        int Id = 0;
        String Nome = "";
        double Preco = 0.00;

        System.out.println("Iniciando teste leitura com JDBC...");

        try (
            // Conexão (já preenchida)
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            // 2. COMPLETE AQUI: Crie o Statement a partir da conexão
            Statement stmt = conn.createStatement();
            
            // 3. COMPLETE AQUI: Execute a query e capture o ResultSet
            ResultSet rs = stmt.executeQuery(SQL_SELECT)

        ) {
            System.out.println("Conexão e Statement criados com sucesso.");
            System.out.println("--- Resultados da Consulta ---");

            // 4. COMPLETE AQUI: Itere sobre o ResultSet e imprima os dados
            while (rs.next()) {
                Id = rs.getInt("ID"); // Recupera o valor da coluna ID como inteiro
                Nome = rs.getString("NOME"); // Recupera o valor da coluna NOME como String
                Preco = rs.getDouble("PRECO"); // Recupera o valor da coluna PRECO como double
                System.out.println("ID: " + Id + ", Nome: " + Nome + ", Preco: " + Preco);
            }
            
            System.out.println("------------------------------");

        } catch (SQLException e) {
            System.err.println("ERRO: Falha na execução da consulta JDBC.");
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }   
}