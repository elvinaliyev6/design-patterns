package az.elvinali.designpatterns.singleton;

public class EagerUserInstance {

    private EagerUserInstance(){

    }

    private static EagerUserInstance instance=new EagerUserInstance();

    public static EagerUserInstance getInstance(){
        return instance;
    }

}
