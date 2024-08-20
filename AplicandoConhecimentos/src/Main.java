import banco.LivroDAO;
import dominio.Livro;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        LivroDAO livroDAO = new LivroDAO();
        Livro livro1 = new Livro("Percy Jackson", "Rick Riordan", "2010", "Intrínseca" );
        Livro livro2 = new Livro("Harry Potter", "JK", "1999","Bloomsbury Publishing");

        ArrayList<Livro> listaLivros = new ArrayList<Livro>();

        listaLivros.add(livro1);
        listaLivros.add(livro2);

        livroDAO.adicionaLivro(listaLivros);



        livroDAO.atualizaAutor("Lucas", 2);
        livroDAO.atualizaTitulo("HARRY POTTER", 3);
        livroDAO.atualizaAnoPublicacao(9999, 3);
        livroDAO.atualizaEditora("FIAP", 3);



        ArrayList<Livro> livros = livroDAO.listaTodosLivros();

        livroDAO.exibirLista(livros);


        livroDAO.deletaLivro(3);



        livroDAO.fechar();


    }
}