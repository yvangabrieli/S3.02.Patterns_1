public class PizzaChef {
    PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void makePizza() {
        builder.addName();
        builder.addSize();
        builder.addDough();
        builder.addTopping();
    }

    public Pizza getPizza() {
        return builder.getPizza();
    }
}
