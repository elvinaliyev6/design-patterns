package az.elvinali.designpatterns.factory;

public class Demo {
    public static void main(String[] args) {
        NotificationFactory factory=new NotificationFactory();
        Notification notification=factory.craetaNotification("Email");
        notification.notifyUser();

       Integer value= Integer.valueOf(1);
    }
}
