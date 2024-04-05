public class Carro implements Veiculo{
    
    private String velocidade;

    @Override
    public void mover(){
        System.out.println("O carro andou");

    }

    public void setVelocidade(String velocidade){
        this.velocidade = velocidade;
    }

    public String getVelocidade(){

        return this.velocidade;

    }

}
