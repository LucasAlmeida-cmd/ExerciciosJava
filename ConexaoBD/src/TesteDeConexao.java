import banco.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class TesteDeConexao {

    public static void main(String[] args) throws SQLException {
        Connection conexao = new ConnectionFactory().getConnection();
        System.out.println("Conectado!");

        String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
        PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);

        comandoDeInsercao.setString(1, "Rogerio Oliveira");
        comandoDeInsercao.setString(2, "67890");
        comandoDeInsercao.setDate(3, toJavaSqlDate(LocalDate.of(2001, 11, 11)));

        comandoDeInsercao.execute();
        comandoDeInsercao.close();
        System.out.println("Gravado!");

        conexao.close();

    }

    private static Date toJavaSqlDate(LocalDate data) {
        return Date.valueOf(data);
    }
}
