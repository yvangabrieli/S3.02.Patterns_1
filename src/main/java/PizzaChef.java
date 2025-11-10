import Pizzas.Pizza;
import Pizzas.PizzaBuilder;

public class PizzaChef {
    PizzaBuilder builder;

    public PizzaChef(){

    }
    public void setPizzaBuilder (PizzaBuilder builder){
        this.builder = builder;
    }
    public void makePizza (){
        builder.setSize();
        builder.setDough();
        builder.addTopping();
    }
    public Pizza getPizza(){
        return builder.getPizza();
    }
}
