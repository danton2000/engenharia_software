package estruturais.Bridge;

public abstract class Conta {
    
    private int numero;

    private double saldo;

    private Titular titular;

    private Capitalizacao capitalizador;

    private Tarifa tarifador;

    public Conta(int numero, double saldo, Titular titular, Capitalizacao capitalizador, Tarifa tarifador) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.capitalizador = capitalizador;
        this.tarifador = tarifador;
    }

    public void sacar(double valor){

        if(this.saldo >= valor ){

            this.saldo = this.saldo - valor;

        } else {

            System.out.println("Saldo insuficiente.");

        }
    }

    public void depositar(double valor){

        this.saldo = this.saldo + valor;

    }

    public void transferirParaconta(Conta conta, double valor){

        if(this.saldo >= valor ){

            conta.saldo = conta.saldo + valor;
            this.saldo = this.saldo - valor;

        } else {

            System.out.println("Saldo insuficiente.");

        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Capitalizacao getCapitalizador() {
        return capitalizador;
    }

    public void setCapitalizador(Capitalizacao capitalizador) {
        this.capitalizador = capitalizador;
    }

    public Tarifa getTarifador() {
        return tarifador;
    }

    public void setTarifador(Tarifa tarifador) {
        this.tarifador = tarifador;
    }

    

}
