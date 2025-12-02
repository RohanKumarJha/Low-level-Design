import Decorator.Mushroom;
import Decorator.ToppingDecorator;
import Decorator.Veggie;
import Pizza.CheezePizza;
import Pizza.NormalPizza;
import Pizza.Pizza;

public class Client {
    public static void main(String[] args) {
        Pizza normalPizza = new NormalPizza();
        System.out.println(normalPizza.getDescription() + " => $" + normalPizza.getCost());

        Pizza cheezePizza = new CheezePizza();
        System.out.println(cheezePizza.getDescription() + " => $" + cheezePizza.getCost());

        ToppingDecorator cheezePizzaWithMushroom = new Mushroom(cheezePizza);
        System.out.println(cheezePizzaWithMushroom.getDescription() + " => $" + cheezePizzaWithMushroom.getCost());

        ToppingDecorator cheezePizzaWithMushroomWithVeggie = new Veggie(cheezePizzaWithMushroom);
        System.out.println(cheezePizzaWithMushroomWithVeggie.getDescription() + " => $" + cheezePizzaWithMushroomWithVeggie.getCost());

        ToppingDecorator normalPizzaWithVeggie = new Veggie(normalPizza);
        System.out.println(normalPizzaWithVeggie.getDescription() + " => $" + normalPizzaWithVeggie.getCost());
    }
}
