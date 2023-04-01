package az.elvinali.designpatterns.singleton;

public class Test {
    public static void main(String[] args) {

        new Thread(() -> {
            try {
                Thread.sleep(1);
            }catch (InterruptedException ex){

            }
            System.out.println("hashcode of lazy: " + LazyUserInstance.getInstance().hashCode());
            System.out.println("hashcode of eager: " + EagerUserInstance.getInstance().hashCode());
            System.out.println("hashcode of enum: " + EnumUserInstance.INSTANCE.hashCode());
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1);
            }catch (InterruptedException ex){

            }
            System.out.println("hashcode of lazy: " + LazyUserInstance.getInstance().hashCode());
            System.out.println("hashcode of eager: " + EagerUserInstance.getInstance().hashCode());
            System.out.println("hashcode of enum: " + EnumUserInstance.INSTANCE.hashCode());
        }).start();

    }
}
