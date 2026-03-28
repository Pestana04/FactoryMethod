package Test;

import FactoryMethod.IServico;
import FactoryMethod.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoEntregaTest {

    @Test
    void deveExecutarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega efetuada", servico.executar());
    }

    @Test
    void deveCancelarEntrega() {
        IServico servico = ServicoFactory.obterServico("Entrega");
        assertEquals("Entrega cancelada", servico.cancelar());
    }
}