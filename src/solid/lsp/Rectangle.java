package solid.lsp;

public class Rectangle implements Area {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return .5 * this.height * this.width;
    }
}
