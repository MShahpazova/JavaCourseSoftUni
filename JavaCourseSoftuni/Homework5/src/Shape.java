import java.util.ArrayList;
import java.util.List;



public abstract class Shape {
    public  List<Vertex>  vertices  = new ArrayList<Vertex>();

    public Shape() {
        this.vertices = new ArrayList<Vertex>();
    }
}
