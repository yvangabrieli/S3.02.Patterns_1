public class PizzaApp {
    private final PizzaChef chef;

    public PizzaApp() {
        this.chef = new PizzaChef();
    }

    public void run() {
        Pizza fourCheese = makePizza(new FourCheesePizzaBuilder());
        Pizza veggie = makePizza(new VeggiePizzaBuilder());
        Pizza hawaii = makePizza(new HawaiianPizzaBuilder());

        displayPizza(fourCheese);
        displayPizza(veggie);
        displayPizza(hawaii);
    }

    private void displayPizza(Pizza pizza) {
        System.out.println("================= \n" + pizza + "\n================= \n");
    }

    private Pizza makePizza(PizzaBuilder builder) {
        chef.setPizzaBuilder(builder);
        chef.makePizza();
        return chef.getPizza();
    }
}


