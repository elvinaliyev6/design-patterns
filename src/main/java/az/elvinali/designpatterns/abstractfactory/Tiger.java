package az.elvinali.designpatterns.abstractfactory;

public class Tiger implements Animal{
    @Override
    public String getAnimal() {
        return "tiger";
    }

    @Override
    public String makeSound() {
        return "tiger sound ...";
    }
}
