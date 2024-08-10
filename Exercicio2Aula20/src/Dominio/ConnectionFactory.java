package Dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    String urlConexao = "jdbc:h2:./banco/bancoDeDados";
    String usuario = "sa";
    String senha = "";


    public Connection getConnection() {
        String urlDeConexao = "jdbc:h2:./banco/bancoDeDados;AUTO_SERVER=TRUE";
        String login = "sa";
        String senha = "";

        try {
            return DriverManager.getConnection(urlDeConexao, login, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
