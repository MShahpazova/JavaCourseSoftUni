import java.text.MessageFormat;
import java.util.Scanner;

/**
 * Created by maria on 8/31/2015.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.next());
        int height = Integer.parseInt(scanner.next());
        int rectangleArea = width * height;

        System.out.println(MessageFormat.format("Area of a rectangle with sides {0} and {1} is {2}", width, height, rectangleArea));
    }
}