package Dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    String urlConexao = "jdbc:h2:./banco/bancoDeDados";
    String usuario = "sa";
    String senha = "";


    public ConnectionFactory() {
    }

    public Connection obterConexao() {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(urlConexao, usuario, senha);
            System.out.println("Conectado!");

        } catch(SQLException e) {
            System.out.println("Erro ao conectar: "+e.getMessage());
        }
        return conexao;
    }


}
