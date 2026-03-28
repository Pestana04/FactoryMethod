package Test;

import FactoryMethod.IServico;
import FactoryMethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoCancelamentoTest {

    @Test
    void deveExecutarCancelamento() {
        IServico servico = ServicoFactory.obterServico("Cancelamento");
        assertEquals("Cancelamento efetuado", servico.executar());
    }

    @Test
    void deveCancelarCancelamento() {
        IServico servico = ServicoFactory.obterServico("Cancelamento");
        assertEquals("Cancelamento revertido", servico.cancelar());
    }
}