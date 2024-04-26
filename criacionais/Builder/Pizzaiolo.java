package criacionais.Builder;

public class Pizzaiolo {
    
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza() {


        return pizzaBuilder.getPizza();

    }

    public void contruirPizza() {

        pizzaBuilder.massaBuilder();

        pizzaBuilder.molhoBuilder();

        pizzaBuilder.coberturaBuilder();

        pizzaBuilder.bordaBuilder();

    }

}
