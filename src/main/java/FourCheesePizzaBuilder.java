public class FourCheesePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public FourCheesePizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void addName() {
        pizza.setName("Four Cheese ");
    }

    public void addSize() {
        pizza.setSize("Small");
    }

    public void addDough() {
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
