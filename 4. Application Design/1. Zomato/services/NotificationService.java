package services;
import model.Customer;

public class NotificationService {
    public void notifyUser(Customer user, String message) {
        System.out.println("🔔 Notification for " + user.getName() + ": " + message);
    }
}
