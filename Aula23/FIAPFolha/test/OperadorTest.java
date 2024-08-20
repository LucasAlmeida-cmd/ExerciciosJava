import br.com.fiapfolha.dominio.Operador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class OperadorTest {

    @Test
    void calculaSalarioParaOperadorCom10(){
        Operador operador = new Operador(1200, "123", LocalDate.of(1980, 10, 10));
        double soma = operador.lerSalario();
        Assertions.assertEquals(1210, soma);
    }
}
