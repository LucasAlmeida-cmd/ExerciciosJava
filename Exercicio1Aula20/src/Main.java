import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String urlConexao = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuario = "system";
        String senha = "system";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection conexao = DriverManager.getConnection(urlConexao, usuario, senha);
            System.out.println("Conectado!");

            conexao.close();
        } catch (SQLException e) {

            System.out.println("Erro ao conectar: " + e.getMessage());
        } catch (ClassNotFoundException e) {

            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        }
    }
}
