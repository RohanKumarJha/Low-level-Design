package Observer;

public class LEDDisplay implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("📺 LED Display: Updated Temperature = " + temperature);
    }
    
}
