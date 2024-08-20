package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
    Connection conexao;

    public Connection getConexao() {
        String url = "jdbc:h2:./banco/bd;AUTO_SERVER=TRUE";
        String login = "sa";
        String senha = "";

        try{
            return DriverManager.getConnection(url, login, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }


    }


}
