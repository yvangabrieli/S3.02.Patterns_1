package Pizzas;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void setSize() {
        pizza.setSize("Medium");
    }

    public void setDough() {
        pizza.setDough("Stuffed crust");
    }

    public void addTopping() {
        pizza.setToppings("Tomato sauce");
        pizza.setToppings("Mozzarella Cheese");
        pizza.setToppings("Ham");
        pizza.setToppings("Pineapple");
        pizza.setToppings("Tomato Sauce");
    }


    public Pizza getPizza() {
        return pizza;
    }
}