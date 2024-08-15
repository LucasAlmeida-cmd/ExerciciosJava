import Dominio.Animal;
import Dominio.Cachorro;
import Dominio.Gato;
import Dominio.Leao;
import Dominio.Som;

public class Main {
    public static void main(String[] args) {

        Som cachorro = new Cachorro("Rex", 3);
        Som gato = new Gato("Mimi", 2);
        Som leao = new Leao("Simba", 5);

        cachorro.emitirSom();
        gato.emitirSom();
        leao.emitirSom();
    }
}
