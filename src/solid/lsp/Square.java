package solid.lsp;

public class Square implements Shape {
    private int side;

    public Square(int s) {
        side = s;
    }

    public int getArea() {
        return side * side;
    }
}