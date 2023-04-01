package az.elvinali.designpatterns.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProvider.getFactory("animal");
        Animal animal = (Animal) factory.create("tiger");
        System.out.println(animal.getAnimal());
        System.out.println(animal.makeSound());
    }
}
