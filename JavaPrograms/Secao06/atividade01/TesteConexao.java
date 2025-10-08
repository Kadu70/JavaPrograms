// Exercício Prático: Conexão Inicial JDBC
// Imagine que você precisa verificar se a sua aplicação Java consegue se conectar corretamente ao seu banco de dados Oracle usando o JDBC Thin Driver.
// O Cenário
// Você está usando um banco de dados local com as seguintes credenciais:
// Driver: oracle.jdbc.driver.OracleDriver (Embora a partir do Java 6/7, o DriverManager geralmente encontre o driver automaticamente, é bom saber o nome da classe).
// URL de Conexão: jdbc:oracle:thin:@localhost:1521:XE
// Usuário: system
// Senha: oracle (ou sua senha de usuário)
// A Tarefa
// Crie uma classe Java simples chamada TesteConexao com um método main. O programa deve:
// Declarar as variáveis de Connection, Statement e ResultSet (mesmo que não as usemos totalmente, é um bom hábito).
// Tentar estabelecer a conexão usando DriverManager.getConnection().
// Imprimir uma mensagem de sucesso ou falha.
// Obrigatório: Usar o bloco try-with-resources para garantir que o objeto Connection seja fechado automaticamente, mesmo que ocorram exceções.
// O Código Base (Para você completar)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TesteConexao {

    // 1. Defina as constantes de conexão

    private static final String URL = "C:/Users/Aluno/OneDrive/Matheus/OneDrive/Documentos/Inicio/bd_vendas.xlsx";
    //private static final String URL = "/workspaces/JavaPrograms/Secao06-atividade01/bd_vendas.xlsx";
//  private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "";//"system";
    private static final String SENHA = "";//"oracle";

    public static void main(String[] args) {
        
        // As variáveis statement e resultSet não são necessárias aqui, mas as mantemos
        // para reforçar o hábito.
        Statement stmt = null;
        ResultSet rs = null;
        System.out.println("connectando");
        // 2. Use try-with-resources para garantir o fechamento da Connection
        try (
            // COMPLETE AQUI: Tente obter a conexão
            
            Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)
        ) {
            // 3. Imprima a mensagem de sucesso
            System.out.println("Status: Conexão estabelecida com sucesso!");

            // Verificação adicional:
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexão está aberta e pronta para uso.");
            }

        } catch (SQLException e) {
            // 4. Trate a exceção em caso de falha na conexão (ex: URL errada, credenciais inválidas)
            System.err.println("ERRO: Falha ao estabelecer a conexão JDBC.");
            System.err.println("Código SQL State: " + e.getSQLState());
            System.err.println("Mensagem: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("ERRO Inesperado: " + e.getMessage());
        }
    }
}

