package az.elvinali.designpatterns.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String animalType) {
        if(animalType.equalsIgnoreCase("lion"))
            return new Lion();
        else if(animalType.equalsIgnoreCase("tiger"))
            return new Tiger();
        return null;
    }
}
