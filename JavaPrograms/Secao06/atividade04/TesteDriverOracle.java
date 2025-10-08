package JavaPrograms.Secao06.atividade04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDriverOracle {
      // Defina as constantes de conexão
    private static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE"; // Formato JDBC Oracle Thin
    private static final String USUARIO = "system";
    private static final String SENHA = "oracle";
    
    // 1. Defina o nome da classe do Driver
    private static final String DRIVER_CLASS = "__________________________"; 

    public static void main(String[] args) {
        
        // --- Passo 1: Carregamento Explícito do Driver (Forma antiga) ---
        try {
            System.out.println("Tentando carregar o driver: " + DRIVER_CLASS);
            
            // Tenta carregar a classe do driver
            Class.forName(DRIVER_CLASS);
            System.out.println("Driver JDBC carregado com sucesso.");

        } catch (ClassNotFoundException e) {
            // 3. COMPLETE AQUI: Trate a exceção se o driver (o arquivo ojdbcX.jar) não estiver no Classpath.
            System.err.println("ERRO: Driver não encontrado.");
            System.err.println("Certifique-se de que o arquivo ojdbcX.jar está no classpath do seu projeto.");
            return; // Encerra o programa se o driver não puder ser carregado
        }
        
        // --- Passo 2: Estabelecer a Conexão ---
        try (
            Connection conn = DriverManager.getConnection(ORACLE_URL, USUARIO, SENHA)
        ) {
            System.out.println("\nStatus: Conexão estabelecida com sucesso!");
            
            // Exibe informações do driver em uso (metadados da conexão)
            System.out.println("Driver utilizado: " + conn.getMetaData().getDriverName());

        } catch (SQLException e) {
            System.err.println("\nERRO: Falha ao conectar ao banco de dados.");
            System.err.println("Mensagem: " + e.getMessage());
        }
    }

}
