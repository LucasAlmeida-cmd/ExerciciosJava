import br.com.fiapfolha.dominio.Estagiario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EstagioTest {

    @Test
    void calcularSalarioParaEstagiarioQueTemValeTransPorte(){
        Estagiario estagiario = new Estagiario(1200, "123", LocalDate.of(1980, 10, 10),200);
        double valor = estagiario.lerSalario();
        Assertions.assertEquals(1400, valor);
    }
}
