package Pizza;

public class NormalPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Normal pizza";
    }

    @Override
    public double getCost() {
        return 50;
    }
    
}
