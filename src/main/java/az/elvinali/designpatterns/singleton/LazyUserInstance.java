package az.elvinali.designpatterns.singleton;

public class LazyUserInstance {
    private static LazyUserInstance instance;

    private LazyUserInstance(){

    }

    public static LazyUserInstance getInstance(){
        if(instance == null){
           instance=new LazyUserInstance();
        }
        return instance;
    }
}
