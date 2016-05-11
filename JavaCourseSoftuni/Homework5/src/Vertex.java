
public class Vertex {
    protected  double x;
    protected double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){ return x;

    }
    public void setX(double valueX){
        if (valueX == (double)(valueX)) {
            this.x = valueX;
        }
        else{
            throw new IllegalArgumentException();
        }

    }
   public double getY(){ return y;
   }
    public void setY(double valueY){
        if (valueY == (double)(valueY)) {
            y = valueY;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}

