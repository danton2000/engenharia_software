public class PizzaHavainaBuilder extends PizzaBulder{

    //Metodos que vem lá da classe PizzaBulder
    @Override
    public void massaBuilder() {
        // TODO Auto-generated method stub
        pizza.setMassa("Fininha");
        
    }

    @Override
    public void molhoBuilder() {
        // TODO Auto-generated method stub
        pizza.setMassa("Molho Tomate");
    }

    @Override
    public void coberturaBuilder() {
        // TODO Auto-generated method stub
        pizza.setCobertura("Abacaxi, Presunto, Queijo");
    } 

    @Override
    public void bordaBuilder() {
        // TODO Auto-generated method stub
        pizza.setBorda("Chocolate");
    }
}
