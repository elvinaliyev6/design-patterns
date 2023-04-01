package az.elvinali.designpatterns.factory;

public class NotificationFactory {

    public Notification craetaNotification(String notificationName) {
        switch (notificationName) {
            case "SMS":
                return new SMSNotification();
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Illegal notification: " + notificationName);
        }
    }

}
