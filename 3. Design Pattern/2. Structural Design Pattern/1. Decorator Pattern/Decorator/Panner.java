package Decorator;

import Pizza.Pizza;

public class Panner extends ToppingDecorator {
    
    public Panner(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with panner";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
