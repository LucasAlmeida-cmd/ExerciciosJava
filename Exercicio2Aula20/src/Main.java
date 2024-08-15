import Dominio.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {


        Connection conexao = new ConnectionFactory().getConnection();
        System.out.println("Conectado!");

        String sqlInsert = "INSERT INTO tb_funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
        //String sqlInsertContato = "INSERT INTO tb_contato (id, telefone, email) VALUES (?, ?, ?)";

        PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsert);


        comandoDeInsercao.setString(1, "José Ribeiro");
        comandoDeInsercao.setString(2, "2222");
        comandoDeInsercao.setDate(3, Date.valueOf(LocalDate.of(2002, 06, 12)));

//        comandoDeInsercao.setString(1, "3");
//        comandoDeInsercao.setInt(2, 984067514);
//        comandoDeInsercao.setString(3, "lucas@gmail.com");


        comandoDeInsercao.execute();
        comandoDeInsercao.close();
        System.out.println("Gravado!");

        conexao.close();


    }
}