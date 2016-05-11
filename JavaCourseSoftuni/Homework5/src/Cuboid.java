
public class Cuboid extends SpaceShape {

    private double width;
    private double height;
    private double depth;
    public Cuboid(Vertex center, double width, double height, double depth) {
        vertices.add(center);
        this.setWidth(width);
        this.setHeight(height);
        this.setDepth(depth);
    }

    @Override
    public double CalculateArea() {

        return 2 * (width * depth + depth * height + height * width);
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }
    public void setWidth(double widthValue){
        this.width = widthValue;
    }
    public void setHeight(double heightValue){
        this.height = heightValue;
    }
    public void setDepth(double depthValue){
        this.depth = depthValue;
    }
}
