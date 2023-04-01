package az.elvinali.designpatterns.abstractfactory;

public class Lion implements Animal{
    @Override
    public String getAnimal() {
        return "lion";
    }

    @Override
    public String makeSound() {
        return "lion sound ...";
    }
}
