package factoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        Triangle triangle = (Triangle) new PolygonFactory().getPolygon(3) ;
        System.out.println(triangle.getType());
    }
}
