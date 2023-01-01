package solid.lsp;

public class Square implements Area {

    int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return this.lenght * this.lenght;
    }
}
