package Pizzas;

public class FourCheesePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public FourCheesePizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void setSize() {
        pizza.setSize("Small");
    }

    public void setDough() {
        pizza.setDough("Thick crust");
    }

    public void addTopping() {
        pizza.setToppings("Cheddar");
        pizza.setToppings("Mozzarella Cheese");
        pizza.setToppings("Ricotta");
        pizza.setToppings("Parmesan");
        pizza.setToppings("Provolone");
    }


    public Pizza getPizza() {
        return pizza;
    }
}
