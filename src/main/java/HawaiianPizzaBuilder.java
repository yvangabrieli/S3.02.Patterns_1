public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    public void addName() {
        pizza.setName("Hawaiian ");
    }

    ;

    public void addSize() {
        pizza.setSize("Medium");
    }

    public void addDough() {
        pizza.setDough("Stuffed crust");
    }

    public void addTopping() {
        pizza.setToppings("Tomato sauce");
        pizza.setToppings("Mozzarella Cheese");
        pizza.setToppings("Ham");
        pizza.setToppings("Pineapple");

    }


    public Pizza getPizza() {
        return pizza;
    }
}