public class Rectangle extends FlatFigures{
    double base, height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base*height;
    }

    @Override
    public double calculatePerimeter() {
        return base*2+height*2;
    }
}
