package Pizzas;

public interface PizzaBuilder {
    public void setSize();

    public void setDough();

    public void addTopping();

    public Pizza getPizza();
}