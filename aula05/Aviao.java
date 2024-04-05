public class Aviao implements Veiculo{
    
    private String velocidade;

    @Override
    public void mover(){
        System.out.println("O avião voou");

    }

    public void setVelocidade(String velocidade){
        this.velocidade = velocidade;
    }

    public String getVelocidade(){

        return this.velocidade;

    }

}
