package estruturais.Adapter;

public class PinoPlanoAdapter extends PinoRedondo{
    
    private PinoPlano pino;

    // metodo construtor
    public PinoPlanoAdapter(PinoPlano pino){

        this.pino = pino;

    }

    public boolean getRaio(PinoRedondo pino){

        return (this.pino.getLargura() <= (pino.getRaio() * 2));

    }

    @Override
    public Double getRaio(){

        return pino.getLargura();

    }

}
