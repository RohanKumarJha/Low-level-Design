package Subject;

import java.util.ArrayList;
import java.util.List;

import Observers.IObservers;

public class WeatherStation {

    private List<IObservers> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void addSubscriber(IObservers observer) {
        observerList.add(observer);
        System.out.println("Observer subscribed");
    }

    public void removeSubscribers(IObservers observer) {
        observerList.remove(observer);
        System.out.println("Observer unsubscribed!!!");
    }

    public void notifyObservers() {
        for(IObservers observers : observerList) {
            observers.update(temperature, humidity, pressure);
        }
    }

    public void setWeather(float temp, float hum, float pres) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = pres;
        notifyObservers();
    }
    
}
