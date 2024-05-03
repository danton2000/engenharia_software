package estruturais.Bridge;

public class ContaCorrente extends Conta{

    //Metodo construtor
    public ContaCorrente(int numero, Titular titular) {
        super(numero, 0.0, titular, null, new CestaDeServicos());
        //TODO Auto-generated constructor stub
    }

    public void cobrarTarifa(){

        this.getTarifador().cobrarTarifa(this);

    }
    
}
