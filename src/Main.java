import Pizzas.*;

public class Main {
    public static void main(String[] args) {
    PizzaChef luigi = new PizzaChef();
    PizzaBuilder fourCheese = new FourCheesePizzaBuilder();
    PizzaBuilder veggie = new VeggiePizzaBuilder();
    PizzaBuilder hawaii = new HawaiianPizzaBuilder();

    luigi.setPizzaBuilder(fourCheese);
    luigi.makePizza();
    Pizza pizza1 = luigi.getPizza();

    luigi.setPizzaBuilder(veggie);
    luigi.makePizza();
    Pizza pizza2 = luigi.getPizza();

    luigi.setPizzaBuilder(hawaii);
    luigi.makePizza();
    Pizza pizza3 = luigi.getPizza();

    System.out.println(pizza1 + "\n" +  pizza2 + "\n" +  pizza3);

    }
}