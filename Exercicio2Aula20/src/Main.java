import Dominio.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        Connection connection = new ConnectionFactory().obterConexao();
        connection.close();
    }
}