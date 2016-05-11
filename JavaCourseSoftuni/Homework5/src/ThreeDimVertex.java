
public class ThreeDimVertex extends Vertex {
    private double z;
    public ThreeDimVertex(double x, double y, double z)  {
        super(x, y);
        this.z = z;
    }
    public double  getZ(){
        return z;
    }
    public void setZ(double valueZ){
        if (valueZ == (double)(valueZ)){
                this.z = valueZ;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
