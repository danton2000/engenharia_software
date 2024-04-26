package criacionais.Builder;

public class Main {

    public static void main(String[] args){

        Pizzaiolo pizzaIoloDiretor = new Pizzaiolo();

        PizzaBuilder PizzaHavainaBuilder = new PizzaHavainaBuilder();

        // PizzaBuilder PizzaCalabresaBuilder = new PizzaCalabresaBuilder();

        pizzaIoloDiretor.setPizzaBuilder(PizzaHavainaBuilder);

        pizzaIoloDiretor.contruirPizza();

        Pizza pizzaHavaina = pizzaIoloDiretor.getPizza();

        System.out.println(pizzaHavaina);

    }

}
