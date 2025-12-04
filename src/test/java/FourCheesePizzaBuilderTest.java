import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourCheesePizzaBuilderTest {

    private FourCheesePizzaBuilder builder;
    private Pizza pizza;

    @BeforeEach
    void setUp() {
        builder = new FourCheesePizzaBuilder();
        pizza = builder.getPizza();
    }

        @Test
        void addName () {
            builder.addName();
            assertEquals("Four Cheese ", pizza.getName());
        }

        @Test
        void addSize () {
            builder.addSize();
            assertEquals("Small", pizza.getSize());
        }

        @Test
        void addDough () {
            builder.addDough();
            assertEquals("Thick crust", pizza.getDough());
        }

        @Test
        void addTopping () {
            builder.addTopping();
            assertEquals(5, pizza.getToppings().size());
            assertTrue(pizza.getToppings().contains("Mozzarella Cheese"));
            assertFalse(pizza.getToppings().contains("Pineapple"));
        }

        @Test
        void getPizza () {
            builder.addName();
            builder.addSize();
            builder.addDough();
            builder.addTopping();

            Pizza result = builder.getPizza();

            assertEquals("Four Cheese ", result.getName());
            assertEquals("Small", result.getSize());
            assertEquals("Thick crust", result.getDough());
            assertEquals(5, result.getToppings().size());
        }
    }
