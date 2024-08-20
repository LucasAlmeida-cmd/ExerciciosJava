package banco;

import dominio.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LivroDAO {

    private Connection conexao = new ConectionFactory().getConexao();

    public LivroDAO(){

    }

    public void fechar(){
        try{
            conexao.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void adicionaLivro(ArrayList<Livro> livro){
        try{
            for (Livro livros: livro){
            String sqlInsert = "INSERT INTO livros (titulo, autor, ano_publicacao, editora) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conexao.prepareStatement(sqlInsert);
            stmt.setString(1, livros.getTitulo());
            stmt.setString(2, livros.getAutor());
            stmt.setString(3, livros.getAno_publicacao());
            stmt.setString(4, livros.getEditora());


            stmt.execute();
            stmt.close();
            System.out.println("Livro Adicionado!");
            }


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Livro> listaTodosLivros(){
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            String sqlSelect ="SELECT * FROM livros";
            PreparedStatement comando = conexao.prepareStatement(sqlSelect);
            ResultSet rs = comando.executeQuery();
            while (rs.next()){
                Livro livro = new Livro();
                livro.setTitulo(rs.getString("TITULO"));
                livro.setAutor(rs.getString("AUTOR"));
                livro.setAno_publicacao(rs.getString("ANO_PUBLICACAO"));
                livro.setEditora(rs.getString("EDITORA"));
                livros.add(livro);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return livros;
    }

    public void atualizaTitulo(String novoTitulo, Integer id){
        try{
            String sqlUpdate = "UPDATE livros SET titulo = ? WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sqlUpdate);
            comando.setString(1,novoTitulo);
            comando.setInt(2,id);
            comando.executeUpdate();

            System.out.println("Livro Atualizado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizaAutor(String novoAutor, Integer id){
        try{
            String sqlUpdate = "UPDATE livros SET autor = ? WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sqlUpdate);
            comando.setString(1,novoAutor);
            comando.setInt(2,id);
            comando.executeUpdate();

            System.out.println("Autor Atualizado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizaAnoPublicacao(Integer novoAno, Integer id){
        try{
            String sqlUpdate = "UPDATE livros SET ANO_PUBLICACAO = ? WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sqlUpdate);
            comando.setInt(1,novoAno);
            comando.setInt(2,id);
            comando.executeUpdate();

            System.out.println("Ano Atualizado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizaEditora(String novoEditora, Integer id){
        try{
            String sqlUpdate = "UPDATE livros SET editora = ? WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sqlUpdate);
            comando.setString(1,novoEditora);
            comando.setInt(2,id);
            comando.executeUpdate();

            System.out.println("Editora Atualizado!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletaLivro(Integer id){
       try{
           String sqlDelete = "DELETE FROM livros WHERE id = ?";
           PreparedStatement comando = conexao.prepareStatement(sqlDelete);
           comando.setInt(1,id);
           comando.executeUpdate();

       }catch (SQLException e){
           throw new RuntimeException(e);
       }
    }

    public void exibirLista(ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println("---------------------");
            System.out.println(livro.getTitulo());
            System.out.println(livro.getEditora());
            System.out.println(livro.getAutor());
            System.out.println(livro.getAno_publicacao());
        }
    }
}
