package Pizzas;

import java.util.ArrayList;

public class Pizza {
    private String size;
    private String dough;
    private ArrayList<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<>();

    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        if (size.isEmpty()) {
            throw new IllegalArgumentException("Size cannot be empty!");
        }
        this.size = size;
    }

    public String getDough() {
        return this.dough;
    }

    public void setDough(String dough) {
        if (dough.isEmpty()) {
            throw new IllegalArgumentException("Dough cannot be empty!");
        }
        this.dough = dough;
    }

    public ArrayList<String> getToppings() {
        return this.toppings;
    }

    public void setToppings(String topping) {
        if (topping.isEmpty()) {
            throw new IllegalArgumentException("topping cannot be empty!");
        }
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza with: \n-size: " + getSize() + " \n-dough: " + getDough() + "\n-Topping: " + getToppings();
    }
}
