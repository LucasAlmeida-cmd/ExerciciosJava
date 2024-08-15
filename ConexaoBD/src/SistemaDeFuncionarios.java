import banco.FuncionarioDAO;
import dominio.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaDeFuncionarios {
    public static void main(String[] args) {
        Funcionario neymar = new Funcionario("Neymar Jr.", "0001",
                LocalDate.of(1992, 2, 5));

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        //funcionarioDAO.adiciona(neymar);

        ArrayList<Funcionario> funcionarios = funcionarioDAO.listarTodos();
        for(Funcionario funcionario : funcionarios){
            System.out.println("---------------------------------------------");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Crachá: " + funcionario.getCracha());
            System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());

        }
        funcionarioDAO.fechar();
    }
}
