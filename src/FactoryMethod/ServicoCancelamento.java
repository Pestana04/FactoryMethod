package FactoryMethod;

public class ServicoCancelamento implements IServico {

    public String executar() {
        return "Cancelamento efetuado";
    }

    public String cancelar() {
        return "Cancelamento revertido";
    }
}