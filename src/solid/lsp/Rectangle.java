package solid.lsp;

public class Rectangle implements Shape {
    private int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public int getArea() {
        return width * height;
    }
}