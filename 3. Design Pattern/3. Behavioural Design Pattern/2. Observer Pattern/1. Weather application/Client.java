import Observers.IObservers;
import Observers.MobileApp;
import Observers.WebApp;
import Subject.WeatherStation;

public class Client {
    public static void main(String[] args) {
        IObservers mobileApp = new MobileApp();
        IObservers webApp = new WebApp();

        IObservers mobileApp2 = new MobileApp();
        IObservers webApp2 = new WebApp();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addSubscriber(mobileApp);
        weatherStation.addSubscriber(mobileApp2);
        weatherStation.addSubscriber(webApp);
        weatherStation.addSubscriber(webApp2);
        weatherStation.setWeather(30.5f, 65f, 1015f);

        weatherStation.removeSubscribers(webApp2);
        weatherStation.removeSubscribers(webApp);
        weatherStation.setWeather(30.5f, 65f, 1015f);

    }
}
