package estruturais.Bridge;

public class ContaMista extends Conta{

    public ContaMista(int numero, Titular titular) {
        super(numero, 0.0, titular, new CapitalizadorInflacao(), new CestaDeServicos());
        //TODO Auto-generated constructor stub
    }
    
    public void cobrarTarifa(){

        this.getTarifador().cobrarTarifa(this);

    }

    public void capitalizar(){

        this.getCapitalizador().capitalizar(this);

    }
}
