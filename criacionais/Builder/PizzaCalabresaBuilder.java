package criacionais.Builder;

public class PizzaCalabresaBuilder extends PizzaBuilder{

    //Metodos que vem lá da classe PizzaBuilder
    @Override
    public void massaBuilder() {
        // TODO Auto-generated method stub
        pizza.setMassa("Grossa");
        
    }

    @Override
    public void molhoBuilder() {
        // TODO Auto-generated method stub
        pizza.setMassa("Molho Tomate apimentado");
    }

    @Override
    public void coberturaBuilder() {
        // TODO Auto-generated method stub
        pizza.setCobertura("Quijo, Frango, Cebola");
    } 

    @Override
    public void bordaBuilder() {
        // TODO Auto-generated method stub
        pizza.setBorda("Queijo-cheeder");
    }
}
