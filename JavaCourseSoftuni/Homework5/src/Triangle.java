import java.util.List;


public class Triangle extends PlaneShape {
    public Vertex aVertex;
    public Vertex bVertex;
    public Vertex cVertex;

    public Triangle (List<Vertex> vertices, Vertex aVertex, Vertex bVertex, Vertex cVertex) {
        super();
        vertices.add(aVertex);
        vertices.add(bVertex);
        vertices.add(cVertex);
    }

    private double getDistance(Vertex vertex1, Vertex vertex2){
        double distance = Math.sqrt ((vertex2.getX() - vertex1.getX()) *  (vertex2.getX() - vertex1.getX()) +
                (( vertex2.getY() - vertex1.getY()) * ( vertex2.getY() - vertex1.getY())));
        return distance;
    }
    public double CalculateArea() {
        //calculate distanse between aVertex and bVertex
        double distanceAB = getDistance(aVertex, bVertex);
        double distanceBC = getDistance(bVertex, cVertex);
        double distanceCA = getDistance(cVertex, aVertex);

        double perimeter = CalculatePerimeter();
        return Math.sqrt((perimeter * (perimeter - distanceAB) * (perimeter - distanceBC)
                * (perimeter - distanceCA)));
    }

    @Override
    public double CalculatePerimeter() {
        double distanceAB = getDistance(aVertex, bVertex);
        double distanceBC = getDistance(bVertex, cVertex);
        double distanceCA = getDistance(cVertex, aVertex);

        return distanceAB + distanceBC + distanceCA;
    }

}
