package az.elvinali.designpatterns.factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sms notification ...");
    }
}
