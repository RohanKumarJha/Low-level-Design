public class NotificationFactory {
    public Notification createNotification(String type) {
        if(type==null || type.isEmpty()) return null;
        switch (type) {
            case "sms":
                return new SMSNotification();

            case "push":
                return new PushNotification();

            case "email":
                return new EmailNotification();
        
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
