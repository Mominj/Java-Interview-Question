package solid.lsp;

public class LspMain {

    public static void main(String[] args) {
        Area square = new Square(12);
        Area rectangle = new Rectangle(10,5);

        System.out.println(square.area());
        System.out.println(rectangle.area());
    }
}
