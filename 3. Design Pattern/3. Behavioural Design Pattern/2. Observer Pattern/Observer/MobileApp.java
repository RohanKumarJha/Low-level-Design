package Observer;

public class MobileApp implements Observer {

    @Override
    public void update(float temperature) {
        System.out.println("📱 Mobile App: New Temperature = " + temperature);
    }
    
}
