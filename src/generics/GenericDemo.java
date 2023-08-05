package generics;

public class GenericDemo {
    public static void main(String[] args) {
//        Container<Double> container = new Container<>();
//        container.setValue(10.0);
//        container.typeCheck();

        Container<Integer> container = new Container<>();
        container.setValue(12);
        container.typeCheck();

    }
}
