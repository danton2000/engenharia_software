package estruturais.Bridge;

public class Tarifa {

    public void cobrarTarifa(Conta conta) {
        
        conta.setSaldo(conta.getSaldo() - 2.00);

    }

}
