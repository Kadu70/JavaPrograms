// Pontos para Reflexão
// Ordem dos Parâmetros: Observe que a numeração dos placeholders (?) começa em 1, não em 0.Segurança: 
// Qual é a principal vantagem de usar ps.setDouble() em vez de concatenar o novoPreco diretamente na string SQL?
//  (Resposta: Prevenção total contra SQL Injection.)

//  Este exercício reforça a segurança, a clareza e o desempenho do PreparedStatement comparado ao Statement simples.
// O Cenário
// Você precisa atualizar o preço (PRECO) de um produto específico (ID) na tabela PRODUTOS.
// Variável
// Valor
// produtoId
// 101
// novoPreco
// 785.50

// Exportar para as Planilhas
// A Tarefa
// Complete o código Java abaixo. Você deve:
// Definir a instrução SQL usando placeholders (?) para os valores.
// Usar conn.prepareStatement() para criar o objeto seguro.
// Vincular os valores das variáveis (novoPreco e produtoId) aos placeholders usando os métodos setXxx() corretos, garantindo a ordem.
// Executar a atualização e verificar o número de linhas afetadas.


package Secao06.atividade06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizacaoSegura {
     // Constantes de Conexão
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";

    public static void main(String[] args) {

        int produtoId = 101;
        double novoPreco = 785.50;
        
        // 1. Defina o SQL com placeholders (?)
        //caracter coringa
        String sql = "UPDATE PRODUTOS SET PRECO = ? WHERE ID = ?";

        System.out.println("Iniciando atualização com PreparedStatement...");

        try (
            // Estabelece a conexão
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            // 2. Crie o PreparedStatement
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            // 3. COMPLETE AQUI: Vincule o NOVO PREÇO (primeiro '?')
            ps.setDouble(1, novoPreco);
            
            // 4. COMPLETE AQUI: Vincule o ID do PRODUTO (segundo '?')
            ps.setInt(2, produtoId);
            
            System.out.println("SQL preparado para execução: " + sql);
            
            // 5. Execute a atualização
            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Sucesso! " + linhasAfetadas + " linha(s) atualizada(s).");
            } else {
                System.out.println("Nenhuma linha foi atualizada. ID " + produtoId + " pode não existir.");
            }

        } catch (SQLException e) {
            System.err.println("ERRO: Falha na execução do PreparedStatement.");
            System.err.println("Mensagem: " + e.getMessage());
        }
    }

}
