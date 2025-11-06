package Pizzas;

public class VeggiePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VeggiePizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void setSize() {
        pizza.setSize("Large");
    }

    public void setDough() {
        pizza.setDough("Thin crust");
    }

    public void addTopping() {
        pizza.setToppings("Tomato sauce");
        pizza.setToppings("Mozzarella Cheese");
        pizza.setToppings("Aubergine");
        pizza.setToppings("Mushrooms");
        pizza.setToppings("Black Olives");
    }


    public Pizza getPizza() {
        return pizza;
    }
}
