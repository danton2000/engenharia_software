package estruturais.Adapter;

public class ConexaoRedonda {
    
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double radio) {
        this.raio = radio;
    }

    public boolean verificaConexao(PinoRedondo pino){

        return (this.raio >= pino.getRaio());

    }

}
