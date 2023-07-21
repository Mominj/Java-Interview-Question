package generics;

public class GenericDemo {
    public static void main(String[] args) {
        Container<Double> container = new Container<>();
        container.setValue(10.0);
        container.typeCheck();

    }
}
