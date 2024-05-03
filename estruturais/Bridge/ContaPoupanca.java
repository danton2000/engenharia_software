package estruturais.Bridge;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Titular titular) {
        super(numero, 0.0, titular, new CapitalizadorInflacao(), null);
        //TODO Auto-generated constructor stub
    }

    public void capitalizar() {

        this.getCapitalizador().capitalizar(this);

    }
    
    
    

}
