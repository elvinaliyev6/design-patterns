package az.elvinali.designpatterns.abstractfactory;

public interface AbstractFactory<T> {
    T create(String typeName);
}
