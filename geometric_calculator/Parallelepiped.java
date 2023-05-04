public class Parallelepiped extends SpaceFigures{
    double weight, height, depth;

    public Parallelepiped(double weight, double height, double depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double calculateVolume() {
        return weight*height*depth;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2*(weight*height + weight*depth + height*depth);
    }
}
