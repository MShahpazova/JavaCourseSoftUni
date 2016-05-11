
public class SquarePyramid extends SpaceShape {
private double baseWidth;
    private double height;
    public SquarePyramid(Vertex baseCenter, double baseWidth, double height) {
        vertices.add(baseCenter);
        this.setBaseWidth(baseWidth);
        this.setHeight(height);
    }

    @Override
    public double calculateVolume() {
        return (baseWidth * baseWidth * height) / 3;
    }

    @Override
    public double CalculateArea() {
        return baseWidth * baseWidth + 2 * baseWidth * height;
    }
    public void setBaseWidth(double valueBaseWidth){
        this.baseWidth = valueBaseWidth;
    }
    public void setHeight(double valueHeight){
        this.height = valueHeight;
    }
}
