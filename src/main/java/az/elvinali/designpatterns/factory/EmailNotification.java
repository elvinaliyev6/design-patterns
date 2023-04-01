package az.elvinali.designpatterns.factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("email notification ...");
    }
}
