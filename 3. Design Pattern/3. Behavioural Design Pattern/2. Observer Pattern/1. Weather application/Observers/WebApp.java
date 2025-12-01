package Observers;

public class WebApp implements IObservers  {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current Display:");
        System.out.println("Temp: " + temperature + "°C, Humidity: " + humidity + "%");
    }
    
}
