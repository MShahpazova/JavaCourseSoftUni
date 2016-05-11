
public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(Vertex upperLeftAngle, double width, double height) {
        vertices.add(upperLeftAngle);
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public double CalculateArea() {
        return width * height;
    }

    @Override
    public double CalculatePerimeter() {
        return width * 2 + height * 2;
    }
    public void setWidth(double widthValue){
        this.width = widthValue;
    }
    public void setHeight(double heightValue){
        this.height = heightValue;
    }
}
