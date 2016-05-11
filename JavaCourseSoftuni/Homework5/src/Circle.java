
public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

   private double radius;
    public Circle(Vertex center, double radius) {
        this.vertices.add(center);
        this.setRadius(radius);
    }

    @Override
    public double CalculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double CalculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public void setRadius(double radValue){
        this.radius = radValue;

    }
}
