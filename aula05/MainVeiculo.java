public class MainVeiculo{
    

    public static void main(String[] args){

        Carro fox = new Carro();

        fox.setVelocidade("170");

        Aviao cargo = new Aviao();

        cargo.setVelocidade("1000");

        System.out.println("Velocidade do carro: "+fox.getVelocidade());

        System.out.println("Velocidade do avião: "+cargo.getVelocidade());
    }

}
