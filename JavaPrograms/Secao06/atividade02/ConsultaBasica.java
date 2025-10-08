// Exercício Prático: Execução de Consulta e ResultSet
// Imagine que, após estabelecer a conexão, você precisa executar uma consulta SQL simples para recuperar dados e exibi-los no console.
// O Cenário
// Usando o mesmo ambiente do exercício anterior, seu objetivo é:
// Criar uma tabela simples (se ainda não existir).
// Executar um comando SELECT simples.
// Processar os resultados usando o ResultSet.
// A Tarefa
// Complete o código abaixo para:
// Estabelecer a conexão (já preenchido).
// Criar um Statement a partir da conexão.
// Executar uma consulta SELECT que retorne os dados.
// Iterar sobre o ResultSet para imprimir as colunas "ID" e "NOME" no console.
// O Código Base (Para você completar)
// Assuma que você tem uma tabela simples chamada PRODUTOS no seu banco de dados Oracle, com as colunas ID (NUMBER) e NOME (VARCHAR2).

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaBasica {

    // Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";
    private static final String SQL_SELECT = "SELECT ID, NOME FROM PRODUTOS";

    public static void main(String[] args) {

        System.out.println("Iniciando teste de consulta JDBC...");

        // 1. Usando try-with-resources para Connection, Statement e ResultSet
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
                int id = rs.getInt("ID"); // Recupera o valor da coluna ID como inteiro
                String nome = rs.getString("NOME"); // Recupera o valor da coluna NOME como String
                
                System.out.println("ID: " + id + ", Nome: " + nome);
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


