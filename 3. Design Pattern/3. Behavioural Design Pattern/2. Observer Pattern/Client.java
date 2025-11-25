
import Observer.LEDDisplay;
import Observer.MobileApp;
import Observer.Observer;
import Subject.WeatherStation;

public class Client {
    public static void main(String[] args) {
        Observer observer1 = new LEDDisplay();
        Observer observer2 = new MobileApp();
        Observer observer3 = new MobileApp();
        Observer observer4 = new LEDDisplay();

        WeatherStation subject = new WeatherStation();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer4);
        subject.addObserver(observer3);
        subject.removeObserver(observer4);

        subject.setTempreature(23);
    }
}