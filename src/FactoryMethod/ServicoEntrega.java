package FactoryMethod;

public class ServicoEntrega implements IServico {

    public String executar() {
        return "Entrega efetuada";
    }

    public String cancelar() {
        return "Entrega cancelada";
    }
}