/**
 * Created by maria on 9/7/2015.
 */
public class RadianDegreeConverter {

    public static void main(String[] args) {
        double radiansToDegrees = convertRadiansToDegrees(3.0);
        System.out.println(radiansToDegrees);
        double degreesToRadians = convertDegreesToRadians(180.0);
        System.out.println(degreesToRadians);

    }
    public static double convertDegreesToRadians(double degrees){
        double radians = (Math.PI / 180) * degrees;
        return radians;
    }
    public static double convertRadiansToDegrees(double radians){
        double degrees = radians * (180 / Math.PI);
        return degrees;
    }
}
