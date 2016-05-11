
public class Sphere extends SpaceShape {
    private double radius;
    public Sphere(Vertex center, double radius) {
    }

    @Override
    public double CalculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return 4/3 * (Math.PI * radius * radius * radius);
    }
    public void setRadius(double radiusValue){
        this.radius = radiusValue;
    }
}
