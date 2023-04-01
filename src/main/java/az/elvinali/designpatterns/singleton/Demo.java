package az.elvinali.designpatterns.singleton;

public class Demo {

    public static void main(String[] args) {
        LazyUserInstance lazyUserInstance1=LazyUserInstance.getInstance();
        LazyUserInstance lazyUserInstance2=LazyUserInstance.getInstance();
        System.out.println("hashcode of lazyUserInstance1:  "+lazyUserInstance1.hashCode());
        System.out.println("hashcode of lazyUserInstance2:  "+lazyUserInstance2.hashCode());


        EagerUserInstance eagerUserInstance1=EagerUserInstance.getInstance();
        EagerUserInstance eagerUserInstance2=EagerUserInstance.getInstance();
        System.out.println("hashcode of eagerUserInstance1: "+eagerUserInstance1.hashCode());
        System.out.println("hashcode of eagerUserInstance2: "+eagerUserInstance2.hashCode());

        EnumUserInstance enumUserInstance1=EnumUserInstance.INSTANCE;
        EnumUserInstance enumUserInstance2=EnumUserInstance.INSTANCE;
        System.out.println("hashcode of enumUserInstance1: "+enumUserInstance1.hashCode());
        System.out.println("hashcode of enumUserInstance2: "+enumUserInstance2.hashCode());
    }

}
