import br.com.fiapfolha.dominio.Gerente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GerenteTest {

    @Test
    void calcularSalarioParaGerenteQueBonus(){
        Gerente gerente = new Gerente(2000, "123", LocalDate.of(1980, 10, 10), 200);
        double soma = gerente.lerSalario();
        Assertions.assertEquals(2200, soma);
    }
}
