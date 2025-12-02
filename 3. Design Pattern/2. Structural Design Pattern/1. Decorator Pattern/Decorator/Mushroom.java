package Decorator;

import Pizza.Pizza;

public class Mushroom extends ToppingDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with mushroom";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
    
}
