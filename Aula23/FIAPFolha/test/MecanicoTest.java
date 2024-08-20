import br.com.fiapfolha.dominio.Mecanico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MecanicoTest {

    @Test
    void calcularSalarioParaMecanicoComPLR(){
        Mecanico mecanico = new Mecanico(2000, "123", LocalDate.of(1980, 10, 10), 100);
        double soma = mecanico.lerSalario();
        Assertions.assertEquals(2100, soma);
    }
}
