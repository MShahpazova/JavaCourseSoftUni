import java.util.Scanner;

public class AngleUnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfConversions = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfConversions; i++) {
            String argument  = scanner.nextLine();
            String [] arguments = argument.split(" ");
            double value = Double.parseDouble(arguments[0]);
            String measure = arguments[1];
            if (measure.equals("deg") ){
                double  result = convertDegreesToRadians(value);
                System.out.printf("%6f rad\n", result);
            }
            else if (measure.equals("rad") ){
                double result = convertRadiansToDegrees(value);
                System.out.printf("%6f deg\n", result);
            }
        }
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
