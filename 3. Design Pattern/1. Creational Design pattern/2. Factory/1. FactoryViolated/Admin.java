public class Admin {
    public static void main(String[] args) {
        Notification notification1 = new EmailNotification();
        notification1.notifyUser();

        Notification notification2 = new PushNotification();
        notification2.notifyUser();

        Notification notification3 = new SMSNotification();
        notification3.notifyUser();
    }
}
