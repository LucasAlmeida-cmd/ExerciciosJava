import br.com.fiapfolha.dominio.AssistenteRH;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssistenteRHTest {


    @Test
    void calcularSalarioParaAssistenteRHQuePossuiDezPorCentoDeComissao() {
        AssistenteRH assistente = new AssistenteRH(100, "4444", LocalDate.of(1980, 10, 10), 10);
        double salario = assistente.lerSalario();
        Assertions.assertEquals(110, salario, 0);
    }


}
