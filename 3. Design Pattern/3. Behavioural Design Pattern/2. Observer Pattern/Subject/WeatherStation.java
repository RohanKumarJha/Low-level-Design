package Subject;

import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class WeatherStation implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
        System.out.println("Observer added successfully");
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
        System.out.println("Observer remove successfully");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList) {
            observer.update(temperature);
        }
    }

    public void setTempreature(float temperature) {
        System.out.println("\nTemperature Updated: " + temperature);
        this.temperature = temperature;
        notifyObserver();
    }
    
}
