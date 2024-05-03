package estruturais.Bridge;

public class Main {
    
    public static void main(String[] args){

        Titular danton = new Titular("03801115003", "Danton");

        ContaPoupanca poupanca = new ContaPoupanca(000, danton);

        ContaCorrente corrente = new ContaCorrente(001, danton);

        ContaMista mista = new ContaMista(002, danton);

        poupanca.depositar(1000.00);

        corrente.depositar(50.00);

        mista.depositar(5.50);

        System.out.println("Saldo da conta poupança: R$" + poupanca.getSaldo());

        System.out.println("Saldo da conta corrente: R$" + corrente.getSaldo());

        System.out.println("Saldo da conta mista: R$" + mista.getSaldo());

        poupanca.capitalizar();

        corrente.cobrarTarifa();

        mista.capitalizar();

        System.out.println("Saldo da conta poupança: R$" + poupanca.getSaldo());

        System.out.println("Saldo da conta corrente: R$" + corrente.getSaldo());

        System.out.println("Saldo da conta mista: R$" + mista.getSaldo());

    }

}
