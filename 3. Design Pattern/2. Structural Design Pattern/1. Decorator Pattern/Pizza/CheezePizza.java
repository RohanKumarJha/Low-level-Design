package Pizza;

public class CheezePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Cheeze pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
    
}
