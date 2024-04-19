public abstract class PizzaBuilder {
    
    public Pizza pizza;

    public Pizza getPizza(){

        return pizza;

    }

    public void criaNovaPizza(){


        pizza = new Pizza();

    }

    public abstract void massaBuilder();

    public abstract void molhoBuilder();

    public abstract void coberturaBuilder();

    public abstract void bordaBuilder();

}
