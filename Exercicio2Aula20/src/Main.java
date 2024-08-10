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

       // String sqlInsert = "INSERT INTO tb_funcionarios (nome, cracha, data_nascimento) VALUES (?, ?, ?)";
        String sqlInsertContato = "INSERT INTO tb_contato (id, telefone, email) VALUES (?, ?, ?)";

        PreparedStatement comandoDeInsercao = conexao.prepareStatement(sqlInsertContato);

//        comandoDeInsercao.setString(1, "Lucas Almeida");
//        comandoDeInsercao.setString(2, "11111");
//        comandoDeInsercao.setDate(3, toJavaSqlDate(LocalDate.of(2002, 06, 11)));

        comandoDeInsercao.setString(1, "3");
        comandoDeInsercao.setInt(2, 984067514);
        comandoDeInsercao.setString(3, "lucas@gmail.com");


        comandoDeInsercao.execute();
        comandoDeInsercao.close();
        System.out.println("Gravado!");

        conexao.close();


    }
  //  private static Date toJavaSqlDate(LocalDate data) {return Date.valueOf(data);}
}