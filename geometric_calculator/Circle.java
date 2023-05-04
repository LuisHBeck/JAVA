public class Circle extends FlatFigures{
    double ray;
    final double PI = 3.14;

    @Override
    public double calculateArea() {
        return  PI*ray*ray;
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*ray;
    }
}
