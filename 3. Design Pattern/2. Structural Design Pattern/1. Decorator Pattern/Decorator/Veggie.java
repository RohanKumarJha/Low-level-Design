package Decorator;

import Pizza.Pizza;

public class Veggie extends ToppingDecorator {
    
    public Veggie(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with veggie";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
